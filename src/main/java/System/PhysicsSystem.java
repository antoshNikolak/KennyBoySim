package System;

import Component.PositionComponent;
import Component.UserInputComponent;
import Component.VelocityComponent;
import Entity.Entity;
import Game.KeyManager;

import java.util.List;

public class PhysicsSystem extends BaseSystem {

//    private KeyManager keyManager;
    public PhysicsSystem() {
       super();
//       KeyManager.init();
    }


    @Override
    public void executeTask(double delta) {
        handleMovingEntity();
    }

    private void handleMovingEntity(){
        List<Entity> filteredEntities = this.filterEntitiesForCurrentState(UserInputComponent.class, VelocityComponent.class, PositionComponent.class);
        for (Entity entity: filteredEntities){// at the moment this will only be kenny boi
            moveEntity(entity);
        }
    }

    private void moveEntity(Entity entity){
        VelocityComponent velocityComponent = entity.getComponent(VelocityComponent.class);
        PositionComponent positionComponent = entity.getComponent(PositionComponent.class);

        changeEntityVelocity(velocityComponent);
        changeEntityPosition(velocityComponent, positionComponent);
    }

    private void changeEntityPosition(VelocityComponent velocityComponent, PositionComponent positionComponent){
        positionComponent.incrementX(velocityComponent.getVelX());
        positionComponent.incrementY(velocityComponent.getVelY());
        handleDiagonalMovement(velocityComponent);
    }

    private void handleDiagonalMovement(VelocityComponent velocityComponent){
        if (velocityComponent.getVelX() != 0 && velocityComponent.getVelY() != 0) {
            double magnitude = Math.sqrt(velocityComponent.getVelY() * velocityComponent.getVelY() + velocityComponent.getVelX() * velocityComponent.getVelX());
            velocityComponent.setVelX(velocityComponent.getVelX() / (magnitude / 5));
            velocityComponent.setVelY(velocityComponent.getVelY() / (magnitude / 5));
        }
    }

    private void changeEntityVelocity(VelocityComponent velocityComponent){
        if (KeyManager.isRightKeyPressed()){
            velocityComponent.setVelX(2);
        }else if (KeyManager.isLeftKeyPressed()){
            velocityComponent.setVelX(-2);
        }else {
            velocityComponent.setVelX(0);
        }

        if (KeyManager.isDownKeyPressed()){
            velocityComponent.setVelY(2);
        }else if (KeyManager.isUpKeyPressed()){
            velocityComponent.setVelY(-2);
        }else {
            velocityComponent.setVelY(0);
        }
    }


}

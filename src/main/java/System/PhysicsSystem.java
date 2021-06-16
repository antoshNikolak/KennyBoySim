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
            System.out.println("kenny");
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
    }

    private void changeEntityVelocity(VelocityComponent velocityComponent){
        if (KeyManager.isRightKeyPressed()){
            velocityComponent.setVelX(5);
        }else if (KeyManager.isLeftKeyPressed()){
            velocityComponent.setVelX(-5);
        }else {
            velocityComponent.setVelX(0);
        }

        if (KeyManager.isDownKeyPressed()){
            velocityComponent.setVelY(5);
        }else if (KeyManager.isUpKeyPressed()){
            velocityComponent.setVelY(-5);
        }else {
            velocityComponent.setVelY(0);
        }
    }


}

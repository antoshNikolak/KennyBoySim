package System;

import Component.PositionComponent;
import Component.TextureComponent;
import Entity.Entity;
import Game.App;
import Game.ScreenManager;
import Game.TextureManager;
import GameState.BaseState;
import javafx.scene.canvas.GraphicsContext;
import Camera.*;
import Entity.*;

import java.util.List;

public class RenderSystem extends BaseSystem {
    private GraphicsContext gc;
    private Camera camera;
    //todo can we have kenny boi as a global field, eventhough we already have him

    public RenderSystem(GraphicsContext gc) {
        this.gc = gc;
        KennyBoi kennyBoi = App.game.getStateManager().getCurrentState().getKennyBoi();
        PositionComponent position = kennyBoi.getComponent(PositionComponent.class);
        this.camera = new Camera(position.getX(), position.getY());

    }

    @Override
    public void executeTask(double delta) {//todo if every system could have its own thread maybe
//        new Thread(() -> {
        gc.clearRect(0, 0, ScreenManager.getScene().getWidth(), ScreenManager.getScene().getHeight());
        List<Entity> filteredEntities = filterEntitiesForCurrentState(TextureComponent.class, PositionComponent.class);
        for (Entity entity : filteredEntities) {
            drawEntity(entity);
        }
        this.camera.centreOnEntity(App.game.getStateManager().getCurrentState().getKennyBoi());
//        }).start();
    }

    private void drawEntity(Entity entity) {
        TextureComponent textureComponent = entity.getComponent(TextureComponent.class);
        PositionComponent positionComponent = entity.getComponent(PositionComponent.class);
        gc.drawImage(textureComponent.getImage(), positionComponent.getX(), positionComponent.getY(), textureComponent.getWidth(), textureComponent.getHeight());

    }
}

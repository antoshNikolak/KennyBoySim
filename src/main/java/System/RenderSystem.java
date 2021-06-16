package System;

import Component.PositionComponent;
import Component.TextureComponent;
import Entity.Entity;
import Game.App;
import Game.ScreenManager;
import Game.TextureManager;
import GameState.BaseState;
import javafx.scene.canvas.GraphicsContext;

import java.util.List;

public class RenderSystem extends BaseSystem {
    GraphicsContext gc;

    public RenderSystem(GraphicsContext gc) {
        this.gc = gc;
    }

    @Override
    public void executeTask(double delta) {//todo if every system could have its own thread maybe
//        new Thread(() -> {
        gc.clearRect(0, 0, ScreenManager.getScene().getWidth(), ScreenManager.getScene().getHeight());
        List<Entity> filteredEntities = filterEntitiesForCurrentState(TextureComponent.class, PositionComponent.class);
        for (Entity entity : filteredEntities) {
            drawEntity(entity);
        }
//        }).start();


    }

    private void drawEntity(Entity entity) {
        TextureComponent textureComponent = entity.getComponent(TextureComponent.class);
        PositionComponent positionComponent = entity.getComponent(PositionComponent.class);
        gc.drawImage(textureComponent.getImage(), positionComponent.getX(), positionComponent.getY(), textureComponent.getWidth(), textureComponent.getHeight());

    }
}

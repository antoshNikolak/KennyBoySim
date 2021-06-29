package Camera;

import Component.PositionComponent;
import Component.TextureComponent;
import Game.ScreenManager;
import Entity.*;

public class Camera {
    private double offsetY;
    private double offsetX;


    public Camera(double offsetX, double offsetY) {
        this.offsetX = offsetX;
        this.offsetY = offsetY;

    }

    public void centreOnEntity(Entity entity) {
        PositionComponent position = entity.getComponent(PositionComponent.class);
        TextureComponent texture = entity.getComponent(TextureComponent.class);

        double centreX = ScreenManager.getScene().getWidth() / 2;
        double centreY = ScreenManager.getScene().getHeight() / 2;

        offsetY = position.getY() - centreY + texture.getHeight() / 2;
        offsetX = position.getX() - centreX + texture.getWidth() / 2;
    }

//    public void move(double xAmt, double yAmt){
//        xOffset += xAmt;
//        yOffset += yAmt;
//
//    }

    public double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }
}


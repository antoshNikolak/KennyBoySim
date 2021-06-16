package World;

import Component.PositionComponent;
import Component.TextureComponent;
import Entity.Entity;

public class Tile extends Entity {
    public Tile(double x, double y, String textureName) {
        addComponent(new PositionComponent(x,  y));
        addComponent(new TextureComponent(textureName));
    }
}

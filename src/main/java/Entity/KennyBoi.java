package Entity;

import Component.PositionComponent;
import Component.TextureComponent;

public class KennyBoi extends Entity{

    public KennyBoi() {
        super();
        this.addComponent(new PositionComponent(50, 50));
        this.addComponent(new TextureComponent("KennyBoi"));
    }
}

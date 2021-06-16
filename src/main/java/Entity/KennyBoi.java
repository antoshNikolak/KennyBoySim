package Entity;

import Component.PositionComponent;
import Component.TextureComponent;
import Component.UserInputComponent;
import Component.VelocityComponent;

public class KennyBoi extends Entity{

    public KennyBoi() {
        super();
        this.addComponent(new PositionComponent(50, 50));
        this.addComponent(new VelocityComponent());
        this.addComponent(new TextureComponent("KennyBoi"));
        this.addComponent(new UserInputComponent());
    }
}

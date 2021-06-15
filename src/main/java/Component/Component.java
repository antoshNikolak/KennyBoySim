package Component;

import Entity.*;

public abstract class Component {
    private  Entity entity;

    public Component() {
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}

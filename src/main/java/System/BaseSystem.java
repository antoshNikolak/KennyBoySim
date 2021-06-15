package System;

import Component.Component;
import Entity.Entity;

public abstract class BaseSystem {
    public BaseSystem() {
    }

    public abstract void executeTask(double delta);//for now, not all methods may need delta
    //todo loop through components not entities

    @SafeVarargs
    public final <T extends Class<? extends Component>> boolean checkEntityHasComponents(Entity entity, T... components){ //works
        boolean hasComponents = true;
        for (T component: components){
            if (!entity.hasComponent(component)){
                hasComponents = false;
            }
        }
        return hasComponents;

    }


}

package System;

import Component.Component;
import Entity.Entity;
import Game.App;
import GameState.BaseState;

import java.util.ArrayList;
import java.util.List;

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

    @SafeVarargs
    protected final <T extends Class<? extends Component>> List<Entity> filterEntities(BaseState state, T... components){
        ArrayList<Entity> filteredEntities = new ArrayList<>();
        for (Entity entity: state.getEntities()){
            if (checkEntityHasComponents(entity, components)){
                filteredEntities.add(entity);
            }
        }
        return filteredEntities;
    }

    @SafeVarargs
    protected final <T extends Class<? extends Component>> List<Entity> filterEntitiesForCurrentState(T... components){
        BaseState state = App.game.getStateManager().getCurrentState();
        ArrayList<Entity> filteredEntities = new ArrayList<>();
        for (Entity entity: state.getEntities()){
            if (checkEntityHasComponents(entity, components)){
                filteredEntities.add(entity);
            }
        }
        return filteredEntities;
    }


}
;
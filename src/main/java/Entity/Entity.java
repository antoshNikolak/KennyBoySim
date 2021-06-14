package Entity;

import java.util.HashMap;
import java.util.Map;

import Component.*;

public abstract class Entity {
    private final Map<Class<? extends Component>, Component> components =  new HashMap<>();

    protected Entity(){
        //add to list of entities probably
    }

    public void addComponent(Component component){
        components.put(component.getClass(), component);
//            component.setEntity(this);

    }

    @SuppressWarnings("unchecked")
    public <T extends  Component> T getComponent( Class<T> component) {
        return (T) components.get(component);
    }

    public boolean hasComponent( Class<? extends Component> component) {
        return components.containsKey(component);
    }







}

package GameState;

import java.util.HashMap;
import java.util.Map;

import System.*;
import javafx.scene.canvas.GraphicsContext;

public abstract class BaseState {

    private Map<Class<? extends BaseSystem>, BaseSystem> systems = new HashMap<>();



    public void update(double delta){
//        getSystem(PhysicsSystem.class).setDelta(delta);//todo set delta of just physics system or pass into each system
        for (BaseSystem system: systems.values()){
            system.executeTask(delta);
        }
    }


    protected abstract void initialiseSystems();

    public void addSystem(BaseSystem system){
        this.systems.put(system.getClass(), system);
    }

    @SuppressWarnings("unchecked")
    public <T extends  BaseSystem> T getSystem( Class<T> system) {
        return  (T) systems.get(system);
    }

    public void clearSystems(){
        this.systems.clear();
    }
}

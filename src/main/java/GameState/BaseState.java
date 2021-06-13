package GameState;

import java.util.HashMap;
import java.util.Map;

import System.BaseSystem;
public abstract class BaseState {

    private Map<Class<? extends BaseSystem>, BaseSystem> systems = new HashMap<>();

    public void handleGame(double delta){
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

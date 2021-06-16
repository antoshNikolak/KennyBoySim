package GameState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Entity.*;
import System.*;
import World.World;
import javafx.scene.canvas.GraphicsContext;

public abstract class BaseState {

    private Map<Class<? extends BaseSystem>, BaseSystem> systems = new HashMap<>();
    private List<Entity> entities = new ArrayList<>();
    protected World world;

//    private KennyBoi kennyBoi;

    public BaseState() {
    }

    public void update(double delta){
        for (BaseSystem system: systems.values()){
            system.executeTask(delta);
        }
    }

    protected void loadKennyBoi(){
        this.entities.add(new KennyBoi());
    }

    public void init(){
        loadKennyBoi();
    }


    protected abstract void initialiseSystems();
    protected abstract void initialiseWorld();
//    protected abstract void init();

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

    public List<Entity> getEntities() {
        return entities;
    }
}

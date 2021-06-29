package GameState;
import Game.App;
import Game.ScreenManager;
import System.*;
import World.World;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class TravelState extends BaseState{


    @Override
    public void init() {
        loadKennyBoi();
        initialiseWorld();
        initialiseSystems();
    }

    @Override
    protected void initialiseSystems() {
        this.addSystem(new PhysicsSystem());
        Canvas canvas = (Canvas) ScreenManager.getNode("game", "GameCanvas");
        GraphicsContext gc = canvas.getGraphicsContext2D();
        this.addSystem(new RenderSystem(gc));
    }

    @Override
    protected void initialiseWorld() {
        this.world = new World();
        this.world.createWorld("Game/TravelWorld.txt");

    }

    public TravelState() {
        App.game.getStateManager().pushState(this);
    }

    //    public TravelState() {
//        initialiseWorld();
//        initialiseSystems();
//    }
}

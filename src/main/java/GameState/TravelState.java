package GameState;
import Game.ScreenManager;
import System.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class TravelState extends BaseState{


    @Override
    protected void initialiseSystems() {
        this.addSystem(new PhysicsSystem());
        Canvas canvas = (Canvas) ScreenManager.getNode("game", "GameCanvas");
        GraphicsContext gc = canvas.getGraphicsContext2D();
        this.addSystem(new RenderSystem(gc));
    }




    public TravelState() {
        initialiseSystems();
    }
}

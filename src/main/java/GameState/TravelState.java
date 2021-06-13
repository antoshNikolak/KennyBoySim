package GameState;
import System.*;
public class TravelState extends BaseState{
    @Override
    public void handleGame(double delta) {

    }

    @Override
    protected void initialiseSystems() {
        this.addSystem(new PhysicsSystem());
        this.addSystem(new RenderSystem());
    }

    public TravelState() {
    }
}

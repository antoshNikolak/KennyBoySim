package Game;

import GameState.StateManager;
import GameState.TravelState;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Game {

    private StateManager stateManager = new StateManager();


    public Game() {


    }

    public void start(){
        init();
        new AnimationTimer() {
            long then = System.nanoTime();

            @Override
            public void handle(long now) {
                update((double) (now - then) / 1000000000f);
                then = now;

            }
        }.start();
    }

    private void update(double delta){
        this.stateManager.updateCurrentState(delta);
    }

    public void handleLogin(){
        //todo use data base to login in, save progress
    }

    private void init(){
        TravelState travelState = new TravelState();
        travelState.init();

//        this.stateManager.pushState(travelState);

    }

    public StateManager getStateManager() {
        return stateManager;
    }
}

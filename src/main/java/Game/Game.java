package Game;

import GameState.StateManager;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Game {

    private StateManager stateManager = new StateManager();

    public Game() {

    }

    public void start(){
        init();
        Canvas canvas = (Canvas) ScreenManager.getNode("game", "GameCanvas");
        GraphicsContext gc = canvas.getGraphicsContext2D();
        long then = System.nanoTime();


        new AnimationTimer() {
            @Override
            public void handle(long now) {
                update((double) (now - then) / 1000000000f);
//                render(gc);

            }
        }.start();
    }

    private void update(double delta){

    }


    private void init(){
        this.stateManager.getCurrentState().handleGame();

    }

}

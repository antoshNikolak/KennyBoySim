package System;

import javafx.scene.canvas.GraphicsContext;

public class RenderSystem extends BaseSystem{
    GraphicsContext gc;
    public RenderSystem(GraphicsContext gc) {
        this.gc = gc;
    }

    @Override
    public void executeTask(double delta) {

    }
}

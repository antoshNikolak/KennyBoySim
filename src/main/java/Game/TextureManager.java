package Game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.HashMap;

public class TextureManager {
    private HashMap<String, Image> images = new HashMap<>();
    private GraphicsContext gc;

    public TextureManager(GraphicsContext gc) {
        this.gc = gc;
    }


    public GraphicsContext getGc() {
        return gc;
    }
}

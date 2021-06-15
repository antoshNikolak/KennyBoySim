package Game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.HashMap;

public class TextureManager {
    private static HashMap<String, Image> images = new HashMap<>();

    public static void init(){
        loadImage("KennyBoi", "CrewMate.png", 50, 50, true);
    }

    private static void loadImage(String name, String fileName,  int width, int height, boolean ratio){
        images.put(name, new Image("Game/"+fileName, width, height, ratio, false));
    }

    public  static Image getImage(String name){
        return images.get(name);
    }
}

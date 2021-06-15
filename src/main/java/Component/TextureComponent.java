package Component;

import Game.TextureManager;
import javafx.scene.image.Image;

public class TextureComponent extends Component {
    private String textureName;
    private Image image;

    private double width, height;

    public TextureComponent(String textureName) {
        this.textureName = textureName;
        this.image = TextureManager.getImage(textureName);
        this.width = image.getWidth();
        this.height = image.getHeight();
    }



    public String getTextureName() {
        return textureName;
    }

    public void setTextureName(String textureName) {
        this.textureName = textureName;
        this.image = TextureManager.getImage(textureName);
        this.width = image.getWidth();
        this.height = image.getHeight();
    }

    public Image getImage() {
        return image;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

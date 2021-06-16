package Game;

import javafx.scene.input.KeyCode;

public class KeyManager {
    private static boolean rightKeyPressed = false;
    private static boolean leftKeyPressed = false;
    private static boolean upKeyPressed = false;
    private static boolean downKeyPressed = false;

    public static void init(){
        ScreenManager.getScene().setOnKeyPressed(event -> {
            KeyCode keyCode = event.getCode();
            if (keyCode == KeyCode.A) {
                leftKeyPressed = true;

            }
            if (keyCode == KeyCode.D) {
                rightKeyPressed = true;
            }
            if (keyCode == KeyCode.W) {
                upKeyPressed = true;
            }
            if (keyCode == KeyCode.S){
                downKeyPressed = true;
            }

        });

        ScreenManager.getScene().setOnKeyReleased(event -> {
            KeyCode keyCode = event.getCode();
            if (keyCode == KeyCode.A) {
                leftKeyPressed = false;
            }
            if (keyCode == KeyCode.D) {
                rightKeyPressed = false;
            }
            if (keyCode == KeyCode.W) {
                upKeyPressed = false;
            }
            if (keyCode == KeyCode.S) {
                downKeyPressed = false;
            }
        });
    }

    public static boolean isRightKeyPressed() {
        return rightKeyPressed;
    }

    public static boolean isLeftKeyPressed() {
        return leftKeyPressed;
    }

    public static boolean isUpKeyPressed() {
        return upKeyPressed;
    }

    public static boolean isDownKeyPressed() {
        return downKeyPressed;
    }
}

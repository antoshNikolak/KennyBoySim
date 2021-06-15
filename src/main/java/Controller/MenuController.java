package Controller;

import Game.App;
import Game.Game;
import Game.ScreenManager;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class MenuController {
    @FXML
    public void startGame(MouseEvent mouseEvent) {
        ScreenManager.activate("game");
        App.game = new Game();
        App.game.handleLogin();
        App.game.start();
    }

}

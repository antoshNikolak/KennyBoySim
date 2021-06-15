package Game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static Game game;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        loadAllPages();
        TextureManager.init();
        ScreenManager.init(stage);

    }

    private void loadAllPages(){
        String[] pages = {"menu", "game"};//pages names we are loading
        for (String name : pages) {
            try {
                loadPage(name); //loads each page and adds it to screen manager
            } catch (IOException e) {
                System.out.println("Error loading page " + name + " game may be unstable");
                System.exit(1);
            }
        }

    }

    private void loadPage(String pageName) throws IOException{
        ClassLoader classLoader= Thread.currentThread().getContextClassLoader();
//                FXMLLoader loader = new FXMLLoader();
//                loader.setLocation(getClass().getResource("/fxml/game.fxml"));
        ScreenManager.addScreen(pageName, new FXMLLoader().load(classLoader.getResourceAsStream("Game/" + pageName+ ".fxml")));




    }

}

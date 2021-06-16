package Game;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.HashMap;

public class ScreenManager {

    private final static HashMap<String, Pane> screenMap = new HashMap<>();
    private static String currentPage;

    private static Stage stage;
    private static Scene scene;



    public static void activate(String name) {
        Pane pane = screenMap.get(name);
        scene.setRoot(pane);
        currentPage = name;

//        stage.setHeight(pane.getPrefHeight());
//        stage.setWidth(pane.getPrefWidth());
//
    }

    public static void init(Stage _stage){
        stage = _stage;
        scene = new Scene(screenMap.get("menu"));
        stage.setScene(scene);
        stage.show();
    }

    public static void addScreen(String pageName, Pane pane) {
        screenMap.put(pageName, pane);
    }

    public static Pane getScreen(String name){
        return screenMap.get(name);
    }

    public static Node getNode(String pageName, String nodeName){
        return screenMap.get(pageName).lookup("#"+ nodeName);
    }

    public static Scene getScene() {
        return scene;
    }
}

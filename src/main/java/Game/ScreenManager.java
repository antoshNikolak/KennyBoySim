package Game;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.HashMap;

public class ScreenManager {

    private static HashMap<String, Pane> screenMap = new HashMap<>();
    private static String currentPage;

    private static Stage stage;
    private static Scene scene;



    public static void activate(String name) {
        Pane pane = screenMap.get(name);
//        main.setRoot(pane);
//        stage.setHeight(pane.getPrefHeight());
//        stage.setWidth(pane.getPrefWidth());
//
//        currentPage = name;
    }

    public static void init(Stage _stage){
        System.out.println(screenMap.size());
        stage = _stage;
        Scene scene = new Scene(screenMap.get("menu"));
        stage.setScene(scene);
        stage.show();



    }

    public static void addScreen(String name, Pane pane) {
        screenMap.put(name, pane);
    }
}

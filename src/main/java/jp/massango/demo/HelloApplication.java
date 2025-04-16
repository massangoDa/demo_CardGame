package jp.massango.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        loadStartMenu();
    }

    private void loadStartMenu() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(StartMenu.class.getResource("start-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1208, 760);
        primaryStage.setTitle("StartMenu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static void loadHelloView() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(StartMenu.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1208, 760);
        primaryStage.setTitle("HelloView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
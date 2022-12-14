package application;

import application.controller.Controller;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) {
    try {
      FXMLLoader fxmlLoader = new FXMLLoader();
      fxmlLoader.setLocation(getClass().getClassLoader().getResource("mainUI.fxml"));
      Pane root = fxmlLoader.load();
      primaryStage.setTitle("Tic Tac Toe");
      primaryStage.setScene(new Scene(root));
      primaryStage.setResizable(false);
      primaryStage.show();
      primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
        @Override
        public void handle(WindowEvent event) {
          Platform.runLater(() -> {
            System.exit(0);
          });
        }
      });
    } catch (Exception e) {
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
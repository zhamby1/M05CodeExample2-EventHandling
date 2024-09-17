package com.example.eventhandling;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class HandleEvent extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");
        btOK.setOnAction(e -> printOK());
        btCancel.setOnAction(e -> printCancel());


        pane.getChildren().addAll(btOK, btCancel);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Event Handling");
        primaryStage.show();

    }
    private void printOK(){
        System.out.println("OK");
    }

    private void printCancel(){
        System.out.println("Cancel");
    }
}


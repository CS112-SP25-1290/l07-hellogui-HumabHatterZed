package edu.miracosta.cs112.lab07;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.event.Event;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)

public class HelloApplication extends Application { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    public Label label1;
    public Label label2;
    public Button button1;
    public Button button2;

    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args); //method from Application class, must be called to setup javafx application
    }

    @java.lang.Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello GUI: Gwen");
        StackPane stack = new StackPane();

        AnchorPane anchor = new AnchorPane();

        label1 = new Label();
        label1.setText("Hello GUI World");
        label2 = new Label();
        label2.setText("Hello GUI World 2");

        button1 = new Button();
        button1.setText("Don't.");
        button1.setOnAction(actionEvent -> label1.setText("New Text!"));
        button1.setStyle("-fx-background-color: transparent");

        button2 = new Button();
        button2.setText("Click Me!");
        button2.setOnAction(actionEvent -> label2.setText("New Text 2!"));

        AnchorPane.setTopAnchor(label1, 10.0);
        AnchorPane.setRightAnchor(label1, 10.0);

        AnchorPane.setTopAnchor(label2, 10.0);
        AnchorPane.setLeftAnchor(label2, 10.0);

        AnchorPane.setBottomAnchor(button1, 10.0);
        AnchorPane.setRightAnchor(button1, 10.0);

        AnchorPane.setBottomAnchor(button2, 10.0);
        AnchorPane.setLeftAnchor(button2, 10.0);

        anchor.getChildren().add(label1);
        anchor.getChildren().add(label2);
        anchor.getChildren().add(button1);
        anchor.getChildren().add(button2);

        stack.getChildren().add(anchor);

        Scene scene = new Scene(stack, 480, 360);
        stage.setScene(scene);
        stage.show();
    }
}
package edu.miracosta.cs112.lab07;//package name here depending on your IDE

import javafx.application.Application;  //abstract class used for JavaFX GUI's
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;              //class for GUI window
import javafx.scene.Scene;              //class for specific view in GUI window
import javafx.scene.layout.VBox;        //class for layout pane, organized top-to-bottom
import javafx.scene.control.Label;      //class for label component
import javafx.scene.control.Button;     //class for button component
import javafx.event.EventHandler;       //interface for handling events
import javafx.event.ActionEvent;        //class for type of event for action (like button or key pressed)

public class HelloApplication extends Application  { //inheriting core functionality + this class will handle events
    /*** GUI COMPONENTS ***/
    // TODO: follow step 25 in README.md to create reference variables

    /*** DRIVER main ***/
    public static void main(String[] args) {
        launch(args); //method from Application class, must be called to setup javafx application
    }

    @java.lang.Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello GUI: Gwen");
        StackPane stack = new StackPane();

        Scene scene = new Scene(stack, 480, 360);
        stage.setScene(scene);

        AnchorPane anchor = new AnchorPane();

        Label label = new Label();
        label.setText("Hello GUI World");
        Label label2 = new Label();
        label2.setText("Hello GUI World 2");

        Button button = new Button();
        button.setText("Don't.");

        Button button2 = new Button();
        button2.setText("Click Me!");

        AnchorPane.setTopAnchor(label, 10.0);
        AnchorPane.setRightAnchor(label, 10.0);

        AnchorPane.setTopAnchor(label2, 10.0);
        AnchorPane.setLeftAnchor(label2, 10.0);

        AnchorPane.setBottomAnchor(button, 10.0);
        AnchorPane.setRightAnchor(button, 10.0);

        AnchorPane.setBottomAnchor(button2, 10.0);
        AnchorPane.setLeftAnchor(button2, 10.0);

        anchor.getChildren().add(label);
        anchor.getChildren().add(label2);
        anchor.getChildren().add(button);
        anchor.getChildren().add(button2);

        stack.getChildren().add(anchor);
        stage.show();
    }

    // TODO: follow steps 10-21 in README.md to add objects to your layout (inside start)

    // TODO: follow steps 22-34 in README.md to create an event handler
}
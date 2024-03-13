import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class wbLaunchApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Button Objs
        Button googleButton = createButton("Google", "https://www.google.com");
        Button githubButton = createButton("GitHub", "https://github.com");
        Button linkedinButton = createButton("Linkedin", "https://www.linkedin.com/");
        Button blackboardButton = createButton("BlackBoard", "https://umb.umassonline.net/");
        Button youtubeButton = createButton("Youtube", "https://www.youtube.com/");
        Button gmailButton = createButton("Gmail", "https://mail.google.com/mail/u/0/#inbox");

        //HBox with 10 pixel spacing. How to get rows and coloums?
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(googleButton, githubButton, linkedinButton,
                                            blackboardButton, youtubeButton, gmailButton);

        // Create Scene
        Scene scene = new Scene(buttonBox, 400, 400);

        // Camera speeds, 3, 2, 1:
        primaryStage.setScene(scene);
        primaryStage.setTitle("Web Launch Start");
        primaryStage.show();
    }

    private Button createButton(String label, String url) {
        Button button = new Button(label);
        button.setOnAction(e -> getHostServices().showDocument(url));
        return button;
    }
}
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class StartGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        // Magisk linje, der hjælper András i nød
        // --module-path /Users/andrasacs/IdeaProjects/_external_libraries/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml


        // Importer giffen
        // Skriv text: connecting
        // Scene
        // Vbox

        primaryStage.setTitle("Join a Meeting");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:///Users/andrasacs/IdeaProjects/Zoom.us_Kopi/src/ZOOMGUI.fxml"));
        VBox vbox = loader.<VBox>load();

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.show();
    }
}

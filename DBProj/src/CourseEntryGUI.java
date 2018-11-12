import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class CourseEntryGUI extends Stage {
    BorderPane borderPane = new BorderPane();
    Scene scene = new Scene( borderPane, 1920, 1080 );
    final Label message = new Label( "" );

    VBox vbProfName = new VBox();
    VBox vbCourseTitle = new VBox();
    HBox hbProfName = new HBox();
    
}

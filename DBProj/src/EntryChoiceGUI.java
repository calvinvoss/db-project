import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EntryChoiceGUI extends Stage {
    GridPane gp = new GridPane();
    Scene scene = new Scene( gp, 1280, 720 );
    final Label message = new Label( "" );

    Button btnPersonEntry = new Button( "Person Entry" );
    Button btnCourseEntry = new Button( "Course Entry" );
    Button btnCancel = new Button( "Cancel" );

    EntryChoiceGUI( ) {
        btnPersonEntry.setPadding( new Insets( 10, 7, 0, 10 ) );
        btnCourseEntry.setPadding( new Insets( 10, 7, 0, 10 ) );
        btnCancel.setPadding( new Insets( 10, 7, 0, 10 ) );

        gp.add( btnPersonEntry, 1, 0 );
        gp.add( btnCourseEntry, 2, 0 );
        gp.add( btnCancel, 3, 0 );

        this.setScene( scene );
        this.show();

        btnPersonEntry.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hide();
                new PersonEntryGUI();
            }
        });

        btnCourseEntry.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hide();
                new CourseEntryGUI();
            }
        });

        btnCancel.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hide();
                new DBMainMenu();
            }
        });
    }
}

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DBMainMenu extends Stage {
    GridPane gp = new GridPane();
    Scene scene = new Scene( gp );
    final Label message = new Label( "" );

    Button btnNewEntry = new Button( "New Entry" );
    Button btnSearch = new Button( "Search" );
    Button btnEdit = new Button( "Edit Entry" );
    Button btnExit = new Button( "Exit" );

    DBMainMenu( ) {
        btnNewEntry.setPadding( new Insets( 10, 7, 0, 10 ) );
        btnSearch.setPadding( new Insets( 10, 7, 0, 10 ) );
        btnEdit.setPadding( new Insets( 10, 7, 0, 10 ) );
        btnExit.setPadding( new Insets( 10, 7, 0, 10 ) );

        gp.add( btnNewEntry, 1, 0 );
        gp.add( btnEdit, 2, 0 );
        gp.add( btnSearch, 3, 0 );
        gp.add( btnExit, 4, 0 );

        this.setScene( scene );
        this.show();
    }
}
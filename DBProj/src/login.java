import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class login extends Stage {
    BorderPane borderPane = new BorderPane( );
    Scene scene = new Scene( borderPane, 1280, 720 );
    final Label message = new Label("");

    VBox vbUser = new VBox( );
    HBox hbUser = new HBox( );

    VBox vb = new VBox( );
    HBox hb = new HBox( );

    Label labelUser = new Label( "Username" );
    Label label = new Label( "Password" );
    final TextField user = new TextField( );
    final PasswordField pb = new PasswordField( );

    login( ){
        vbUser.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbUser.setSpacing( 10 );
        hbUser.setSpacing( 10 );
        hbUser.setAlignment( Pos.CENTER_LEFT );
        vb.setPadding( new Insets( 10, 7, 0, 10 ) );
        vb.setSpacing( 10 );
        hb.setSpacing( 10 );
        hb.setAlignment( Pos.CENTER_LEFT );
        hb.getChildren().addAll( label, pb );
        vb.getChildren().addAll( hb, message );
        hbUser.getChildren().addAll( labelUser, user );
        vbUser.getChildren().addAll( hbUser );
        borderPane.setTop( vbUser );
        borderPane.setLeft( vb );

        this.setScene( scene );
        this.show();
        pb.setOnAction( new EventHandler<ActionEvent>( ) {
            @Override public void handle( ActionEvent e ) {
                if ( !pb.getText( ).equals( "bop" ) || !user.getText( ).equals( "cvoss" ) ) {
                    message.setText( "Your username and/or password are/is incorrect!" );
                    message.setTextFill( Color.rgb( 210, 39, 30 ) );
                } else {
                    hide();
                    new PersonEntryGUI();
                }
                user.clear( );
                pb.clear( );
            }
        });
    }
}

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PersonEntryGUI extends Stage {
    GridPane gp = new GridPane();
    Scene scene = new Scene( gp, 1920, 1080 );
    final Label message = new Label( "" );

    Button btnCancel = new Button( "Cancel" );
    Button btnClear = new Button( "Clear" );
    Button btnDownload = new Button( "Download" );
    Button btnSubmit = new Button( "Submit" );

    VBox vbFirstName = new VBox();
    VBox vbMiddleName = new VBox();
    VBox vbLastName = new VBox();
    VBox vbPhoneNumber = new VBox();
    VBox vbPhoneType = new VBox();
    VBox vbEmail = new VBox();
    VBox vbEmailType = new VBox();
    VBox vbHeightFeet = new VBox();
    VBox vbHeightInches = new VBox();
    VBox vbWeight = new VBox();
    VBox vbGender = new VBox();
    VBox vbEyeColor = new VBox();
    VBox vbHairColor = new VBox();
    VBox vbHairStyle = new VBox();
    VBox vbHairDye = new VBox();
    VBox vbEthnicity = new VBox();
    VBox vbBuild = new VBox();
    VBox vbRelationshipStatus = new VBox();
    VBox vbOrientation = new VBox();
    VBox vbFriends = new VBox();
    VBox vbNotes = new VBox();
    VBox vbUsername = new VBox();
    VBox vbPassword = new VBox();
    VBox vbSocialMedia = new VBox();

    HBox hbFirstName = new HBox();
    HBox hbMiddleName = new HBox();
    HBox hbLastName = new HBox();
    HBox hbPhoneNumber = new HBox();
    HBox hbPhoneType = new HBox();
    HBox hbEmail = new HBox();
    HBox hbEmailType = new HBox();
    HBox hbHeightFeet = new HBox();
    HBox hbHeightInches = new HBox();
    HBox hbWeight = new HBox();
    HBox hbGender = new HBox();
    HBox hbEyeColor = new HBox();
    HBox hbHairColor = new HBox();
    HBox hbHairStyle = new HBox();
    HBox hbHairDye = new HBox();
    HBox hbEthnicity = new HBox();
    HBox hbBuild = new HBox();
    HBox hbRelationshipStatus = new HBox();
    HBox hbOrientation = new HBox();
    HBox hbFriends = new HBox();
    HBox hbNotes = new HBox();
    HBox hbUsername = new HBox();
    HBox hbPassword = new HBox();
    HBox hbSocialMedia = new HBox();

    Label lblFirstName = new Label( "First" );
    Label lblMiddleName = new Label( "Middle" );
    Label lblLastName = new Label( "Last" );
    Label lblPhoneNumber = new Label( "Phone Number" );
    Label lblPhoneType = new Label( "Phone Type" );
    Label lblEmail = new Label( "Email" );
    Label lblEmailType = new Label( "Email Type" );
    Label lblHeightFeet = new Label( "Height (Feet)" );
    Label lblHeightInches = new Label( "Height (Inches)" );
    Label lblWeight = new Label( "Weight (Pounds)" );
    Label lblGender = new Label( "Gender" );
    Label lblEyeColor = new Label( "Eye Color" );
    Label lblHairColor = new Label( "Hair Color" );
    Label lblHairStyle = new Label( "Hair Style" );
    Label lblHairDye = new Label( "Hair Dye" );
    Label lblEthnicity = new Label( "Ethnicity" );
    Label lblBuild = new Label( "Physical Build" );
    Label lblRelationshipStatus = new Label( "Relationship Status" );
    Label lblOrientation = new Label( "Sexual Orientation" );
    Label lblFriends = new Label( "Friends" );
    Label lblNotes = new Label( "Notes" );
    Label lblUsername = new Label( "Username" );
    Label lblPassword = new Label( "Password" );
    Label lblSocialMedia = new Label( "Social Media" );

    final TextField tfFirstName = new TextField( );
    final TextField tfMiddleName = new TextField( );
    final TextField tfLastName = new TextField( );
    final TextField tfPhoneNumber = new TextField( );
    final TextField tfPhoneType = new TextField( );
    final TextField tfEmail = new TextField( );
    final TextField tfEmailType = new TextField( );
    final TextField tfHeightFeet = new TextField( );
    final TextField tfHeightInches = new TextField( );
    final TextField tfWeight = new TextField( );
    final TextField tfGender = new TextField( );
    final TextField tfEyeColor = new TextField( );
    final TextField tfHairColor = new TextField( );
    final TextField tfHairStyle = new TextField( );
    final TextField tfHairDye = new TextField( );
    final TextField tfEthnicity = new TextField( );
    final TextField tfBuild = new TextField( );
    final TextField tfRelationshipStatus = new TextField( );
    final TextField tfOrientation = new TextField( );
    final TextField tfFriends = new TextField( );
    final TextField tfNotes = new TextField( );
    final TextField tfUsername = new TextField( );
    final TextField tfPassword = new TextField( );
    final TextField tfSocialMedia = new TextField( );

    PersonEntryGUI( ) {
        vbFirstName.setPadding( new Insets( 10, 7, 0,10 ) );
        vbFirstName.setSpacing( 10 );
        hbFirstName.setSpacing( 10 );
        hbFirstName.setAlignment(Pos.CENTER_LEFT );
        hbFirstName.getChildren().addAll( lblFirstName, tfFirstName );
        vbFirstName.getChildren().addAll( hbFirstName );

        vbMiddleName.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbMiddleName.setSpacing( 10 );
        hbMiddleName.setSpacing( 10 );
        hbMiddleName.setAlignment( Pos.CENTER_LEFT );
        hbMiddleName.getChildren().addAll( lblMiddleName, tfMiddleName );
        vbMiddleName.getChildren().addAll( hbMiddleName );

        vbLastName.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbLastName.setSpacing( 10 );
        hbLastName.setSpacing( 10 );
        hbLastName.setAlignment( Pos.CENTER_LEFT );
        hbLastName.getChildren().addAll( lblLastName, tfLastName );
        vbLastName.getChildren().addAll( hbLastName );

        vbPhoneNumber.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbPhoneNumber.setSpacing( 10 );
        hbPhoneNumber.setSpacing( 10 );
        hbPhoneNumber.setAlignment( Pos.CENTER_LEFT );
        hbPhoneNumber.getChildren().addAll( lblPhoneNumber, tfPhoneNumber );
        vbPhoneNumber.getChildren().addAll( hbPhoneNumber );

        vbPhoneType.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbPhoneType.setSpacing( 10 );
        hbPhoneType.setSpacing( 10 );
        hbPhoneType.setAlignment( Pos.CENTER_LEFT );
        hbPhoneType.getChildren().addAll( lblPhoneType, tfPhoneType );
        vbPhoneType.getChildren().addAll( hbPhoneType );

        vbEmail.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbEmail.setSpacing( 10 );
        hbEmail.setSpacing( 10 );
        hbEmail.setAlignment( Pos.CENTER_LEFT );
        hbEmail.getChildren().addAll( lblEmail, tfEmail );
        vbEmail.getChildren().addAll( hbEmail );

        vbEmailType.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbEmailType.setSpacing( 10 );
        hbEmailType.setSpacing( 10 );
        hbEmailType.setAlignment( Pos.CENTER_LEFT );
        hbEmailType.getChildren().addAll( lblEmailType, tfEmailType );
        vbEmailType.getChildren().addAll( hbEmailType );

        vbHeightFeet.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbHeightFeet.setSpacing( 10 );
        hbHeightFeet.setSpacing( 10 );
        hbHeightFeet.setAlignment( Pos.CENTER_LEFT );
        hbHeightFeet.getChildren().addAll( lblHeightFeet, tfHeightFeet );
        vbHeightFeet.getChildren().addAll( hbHeightFeet );

        vbHeightInches.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbHeightInches.setSpacing( 10 );
        hbHeightInches.setSpacing( 10 );
        hbHeightInches.setAlignment( Pos.CENTER_LEFT );
        hbHeightInches.getChildren().addAll( lblHeightInches, tfHeightInches );
        vbHeightInches.getChildren().addAll( hbHeightInches );

        vbWeight.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbWeight.setSpacing( 10 );
        hbWeight.setSpacing( 10 );
        hbWeight.setAlignment( Pos.CENTER_LEFT );
        hbWeight.getChildren().addAll( lblWeight, tfWeight );
        vbWeight.getChildren().addAll( hbWeight );

        vbGender.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbGender.setSpacing( 10 );
        hbGender.setSpacing( 10 );
        hbGender.setAlignment( Pos.CENTER_LEFT );
        hbGender.getChildren().addAll( lblGender, tfGender );
        vbGender.getChildren().addAll( hbGender );

        vbEyeColor.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbEyeColor.setSpacing( 10 );
        hbEyeColor.setSpacing( 10 );
        hbEyeColor.setAlignment( Pos.CENTER_LEFT );
        hbEyeColor.getChildren().addAll( lblEyeColor, tfEyeColor );
        vbEyeColor.getChildren().addAll( hbEyeColor );

        vbHairColor.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbHairColor.setSpacing( 10 );
        hbHairColor.setSpacing( 10 );
        hbHairColor.setAlignment( Pos.CENTER_LEFT );
        hbHairColor.getChildren().addAll( lblHairColor, tfHairColor );
        vbHairColor.getChildren().addAll( hbHairColor );

        vbHairStyle.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbHairStyle.setSpacing( 10 );
        hbHairStyle.setSpacing( 10 );
        hbHairStyle.setAlignment( Pos.CENTER_LEFT );
        hbHairStyle.getChildren().addAll( lblHairStyle, tfHairStyle );
        vbHairStyle.getChildren().addAll( hbHairStyle );

        vbHairDye.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbHairDye.setSpacing( 10 );
        hbHairDye.setSpacing( 10 );
        hbHairDye.setAlignment( Pos.CENTER_LEFT );
        hbHairDye.getChildren().addAll( lblHairDye, tfHairDye );
        vbHairDye.getChildren().addAll( hbHairDye );

        vbEthnicity.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbEthnicity.setSpacing( 10 );
        hbEthnicity.setSpacing( 10 );
        hbEthnicity.setAlignment( Pos.CENTER_LEFT );
        hbEthnicity.getChildren().addAll( lblEthnicity, tfEthnicity );
        vbEthnicity.getChildren().addAll( hbEthnicity );

        vbBuild.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbBuild.setSpacing( 10 );
        hbBuild.setSpacing( 10 );
        hbBuild.setAlignment( Pos.CENTER_LEFT );
        hbBuild.getChildren().addAll( lblBuild, tfBuild );
        vbBuild.getChildren().addAll( hbBuild );

        vbRelationshipStatus.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbRelationshipStatus.setSpacing( 10 );
        hbRelationshipStatus.setSpacing( 10 );
        hbRelationshipStatus.setAlignment( Pos.CENTER_LEFT );
        hbRelationshipStatus.getChildren().addAll( lblRelationshipStatus, tfRelationshipStatus );
        vbRelationshipStatus.getChildren().addAll( hbRelationshipStatus );

        vbOrientation.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbOrientation.setSpacing( 10 );
        hbOrientation.setSpacing( 10 );
        hbOrientation.setAlignment( Pos.CENTER_LEFT );
        hbOrientation.getChildren().addAll( lblOrientation, tfOrientation );
        vbOrientation.getChildren().addAll( hbOrientation );

        vbFriends.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbFriends.setSpacing( 10 );
        hbFriends.setSpacing( 10 );
        hbFriends.setAlignment( Pos.CENTER_LEFT );
        hbFriends.getChildren().addAll( lblFriends, tfFriends );
        vbFriends.getChildren().addAll( hbFriends );

        vbNotes.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbNotes.setSpacing( 10 );
        hbNotes.setSpacing( 10 );
        hbNotes.setAlignment( Pos.CENTER_LEFT );
        hbNotes.getChildren().addAll( lblNotes, tfNotes );
        vbNotes.getChildren().addAll( hbNotes );

        vbUsername.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbUsername.setSpacing( 10 );
        hbUsername.setSpacing( 10 );
        hbUsername.setAlignment( Pos.CENTER_LEFT );
        hbUsername.getChildren().addAll( lblUsername, tfUsername );
        vbUsername.getChildren().addAll( hbUsername );

        vbPassword.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbPassword.setSpacing( 10 );
        hbPassword.setSpacing( 10 );
        hbPassword.setAlignment( Pos.CENTER_LEFT );
        hbPassword.getChildren().addAll( lblPassword, tfPassword );
        vbPassword.getChildren().addAll( hbPassword );

        vbSocialMedia.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbSocialMedia.setSpacing( 10 );
        hbSocialMedia.setSpacing( 10 );
        hbSocialMedia.setAlignment( Pos.CENTER_LEFT );
        hbSocialMedia.getChildren().addAll( lblSocialMedia, tfSocialMedia );
        vbSocialMedia.getChildren().addAll( hbSocialMedia );

        gp.add( vbFirstName, 1, 0 );
        gp.add( vbMiddleName, 2, 0 );
        gp.add( vbLastName, 3, 0 );
        gp.add( vbPhoneNumber, 1, 1 );
        gp.add( vbPhoneType, 2, 1 );
        gp.add( vbEmail, 1, 2 );
        gp.add( vbEmailType, 2, 2 );
        gp.add( vbHeightFeet, 1, 3 );
        gp.add( vbHeightInches, 2, 3 );
        gp.add( vbWeight, 3, 3 );
        gp.add( vbGender, 1, 4 );
        gp.add( vbEyeColor, 2, 4 );
        gp.add( vbHairColor, 3, 4 );
        gp.add( vbHairStyle, 4, 4 );
        gp.add( vbHairDye, 5, 4 );
        gp.add( vbEthnicity, 1,5 );
        gp.add( vbBuild, 2, 5 );
        gp.add( vbRelationshipStatus, 3, 5 );
        gp.add( vbOrientation, 4, 5 );
        gp.add( vbFriends, 1, 6 );
        gp.add( vbNotes, 6, 6 );
        gp.add( vbUsername, 1, 7 );
        gp.add( vbPassword, 2, 7 );
        gp.add( vbSocialMedia, 3, 7 );

        gp.add( btnSubmit, 16, 16 );
        gp.add( btnDownload, 17, 16 );
        gp.add( btnClear, 18, 16 );
        gp.add( btnCancel, 19, 16 );

        this.setScene( scene );
        this.show();

        btnClear.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfFirstName.clear();
                tfMiddleName.clear();
                tfLastName.clear();
                tfPhoneNumber.clear();
                tfPhoneType.clear();
                tfEmail.clear();
                tfEmailType.clear();
                tfHeightFeet.clear();
                tfHeightInches.clear();
                tfWeight.clear();
                tfGender.clear();
                tfEyeColor.clear();
                tfHairColor.clear();
                tfHairStyle.clear();
                tfHairDye.clear();
                tfEthnicity.clear();
                tfBuild.clear();
                tfRelationshipStatus.clear();
                tfOrientation.clear();
                tfFriends.clear();
                tfNotes.clear();
                tfUsername.clear();
                tfPassword.clear();
                tfSocialMedia.clear();
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

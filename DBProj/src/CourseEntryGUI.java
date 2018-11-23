import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Label;


public class CourseEntryGUI extends Stage {
    GridPane gp = new GridPane();
    Scene scene = new Scene( gp, 1920, 1080 );
    final Label message = new Label( "" );

    Button btnCancel = new Button( "Cancel" );
    Button btnClear = new Button( "Clear" );
    Button btnDownload = new Button( "Download" );
    Button btnSubmit = new Button( "Submit" );

    VBox vbProfFirstName = new VBox();
    VBox vbProfLastName= new VBox();
    VBox vbProfTitle = new VBox();
    VBox vbCourseTitle = new VBox();
    VBox vbDepartment = new VBox();
    VBox vbCourseNumber = new VBox();
    VBox vbCRN = new VBox();
    VBox vbSemester = new VBox();
    VBox vbYear = new VBox();
    VBox vbNotes = new VBox();

    HBox hbProfFirstName = new HBox();
    HBox hbProfLastName = new HBox();
    HBox hbProfTitle = new HBox();
    HBox hbCourseTitle = new HBox();
    HBox hbDepartment = new HBox();
    HBox hbCourseNumber = new HBox();
    HBox hbCRN = new HBox();
    HBox hbSemester = new HBox();
    HBox hbYear = new HBox();
    HBox hbNotes = new HBox();

    Label lblProfFirstName = new Label( "First Name of Instructor" );
    Label lblProfLastName = new Label( "Last Name of Instructor" );
    Label lblProfTitle = new Label( "Instructor Title" );
    Label lblCourseTitle = new Label( "Official Course Title" );
    Label lblDepartment = new Label( "Department" );
    Label lblCourseNumber = new Label( "Course Number" );
    Label lblCRN = new Label( "CRN" );
    Label lblSemester = new Label( "Semester" );
    Label lblYear = new Label( "Year" );
    Label lblNotes = new Label( "Notes" );

    final TextField tfProfFirstName = new TextField( );
    final TextField tfProfLastName = new TextField( );
    final TextField tfProfTitle = new TextField( );
    final TextField tfCourseTitle = new TextField( );
    final TextField tfDepartment = new TextField( );
    final TextField tfCourseNumber = new TextField( );
    final TextField tfCRN = new TextField( );
    final TextField tfSemester = new TextField( );
    final TextField tfYear = new TextField( );
    final TextField tfNotes = new TextField( );

    CourseEntryGUI( ) {
        vbProfFirstName.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbProfFirstName.setSpacing( 10 );
        hbProfFirstName.setSpacing( 10 );
        hbProfFirstName.setAlignment( Pos.CENTER_LEFT );
        hbProfFirstName.getChildren().addAll(lblProfFirstName, tfProfFirstName);
        vbProfFirstName.getChildren().addAll(hbProfFirstName);

        vbProfLastName.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbProfLastName.setSpacing( 10 );
        hbProfLastName.setSpacing( 10 );
        hbProfLastName.setAlignment( Pos.CENTER_LEFT );
        hbProfLastName.getChildren().addAll( lblProfLastName, tfProfLastName );
        vbProfLastName.getChildren().addAll( hbProfLastName );

        vbProfTitle.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbProfTitle.setSpacing( 10 );
        hbProfTitle.setSpacing( 10 );
        hbProfTitle.setAlignment( Pos.CENTER_LEFT );
        hbProfTitle.getChildren().addAll( lblProfTitle, tfProfTitle );
        vbProfTitle.getChildren().addAll( hbProfTitle );

        vbCourseTitle.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbCourseTitle.setSpacing( 10 );
        hbCourseTitle.setSpacing( 10 );
        hbCourseTitle.setAlignment( Pos.CENTER_LEFT );
        hbCourseTitle.getChildren().addAll( lblCourseTitle, tfCourseTitle );
        vbCourseTitle.getChildren().addAll( hbCourseTitle );

        vbDepartment.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbDepartment.setSpacing( 10 );
        hbDepartment.setSpacing( 10 );
        hbDepartment.setAlignment( Pos.CENTER_LEFT );
        hbDepartment.getChildren().addAll( lblDepartment, tfDepartment );
        vbDepartment.getChildren().addAll( hbDepartment );

        vbCourseNumber.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbCourseNumber.setSpacing( 10 );
        hbCourseNumber.setSpacing( 10 );
        hbCourseNumber.setAlignment( Pos.CENTER_LEFT );
        hbCourseNumber.getChildren().addAll( lblCourseNumber, tfCourseNumber );
        vbCourseNumber.getChildren().addAll( hbCourseNumber );

        vbCRN.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbCRN.setSpacing( 10 );
        hbCRN.setSpacing( 10 );
        hbCRN.setAlignment( Pos.CENTER_LEFT );
        hbCRN.getChildren().addAll( lblCRN, tfCRN );
        vbCRN.getChildren().addAll( hbCRN );

        vbSemester.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbSemester.setSpacing( 10 );
        hbSemester.setSpacing( 10 );
        hbSemester.setAlignment( Pos.CENTER_LEFT );
        hbSemester.getChildren().addAll( lblSemester, tfSemester );
        vbSemester.getChildren().addAll( hbSemester );

        vbYear.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbYear.setSpacing( 10 );
        hbYear.setSpacing( 10 );
        hbYear.setAlignment( Pos.CENTER_LEFT );
        hbYear.getChildren().addAll( lblYear, tfYear );
        vbYear.getChildren().addAll( hbYear );

        vbNotes.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbNotes.setSpacing( 10 );
        hbNotes.setSpacing( 10 );
        hbNotes.setAlignment( Pos.CENTER_LEFT );
        hbNotes.getChildren().addAll( lblNotes, tfNotes );
        vbNotes.getChildren().addAll( hbNotes );

        gp.add( vbProfFirstName, 1, 0 );
        gp.add( vbProfLastName, 1, 1 );
        gp.add( vbProfTitle, 1, 2 );
        gp.add( vbCourseTitle, 1, 3 );
        gp.add( vbDepartment, 1, 4 );
        gp.add( vbCourseNumber, 1, 5 );
        gp.add( vbCRN, 1, 6 );
        gp.add( vbSemester, 1, 7 );
        gp.add( vbYear, 1, 8 );
        gp.add( vbNotes, 1, 9 );

        gp.add( btnSubmit, 16, 16 );
        gp.add( btnDownload, 17, 16 );
        gp.add( btnClear, 18, 16 );
        gp.add( btnCancel, 19, 16 );

        this.setScene( scene );
        this.show();

        btnClear.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfProfFirstName.clear();
                tfProfLastName.clear();
                tfProfTitle.clear();
                tfCourseTitle.clear();
                tfDepartment.clear();
                tfCourseNumber.clear();
                tfCRN.clear();
                tfSemester.clear();
                tfYear.clear();
                tfNotes.clear();
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

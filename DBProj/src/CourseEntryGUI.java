import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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

    VBox vbProfName = new VBox();
    VBox vbCourseTitle = new VBox();
    VBox vbDepartment = new VBox();
    VBox vbCourseNumber = new VBox();
    VBox vbCRN = new VBox();
    VBox vbSemester = new VBox();
    VBox vbYear = new VBox();

    HBox hbProfName = new HBox();
    HBox hbCourseTitle = new HBox();
    HBox hbDepartment = new HBox();
    HBox hbCourseNumber = new HBox();
    HBox hbCRN = new HBox();
    HBox hbSemester = new HBox();
    HBox hbYear = new HBox();

    Label lblProfName = new Label( "Name of Professor" );
    Label lblCourseTitle = new Label( "Official Course Title" );
    Label lblDepartment = new Label( "Department" );
    Label lblCourseNumber = new Label( "Course Number" );
    Label lblCRN = new Label( "CRN" );
    Label lblSemester = new Label( "Semester" );
    Label lblYear = new Label( "Year" );

    final TextField tfProfName = new TextField( );
    final TextField tfCourseTitle = new TextField( );
    final TextField tfDepartment = new TextField( );
    final TextField tfCourseNumber = new TextField( );
    final TextField tfCRN = new TextField( );
    final TextField tfSemester = new TextField( );
    final TextField tfYear = new TextField( );

    CourseEntryGUI( ) {
        vbProfName.setPadding( new Insets( 10, 7, 0, 10 ) );
        vbProfName.setSpacing( 10 );
        hbProfName.setSpacing( 10 );
        hbProfName.setAlignment( Pos.CENTER_LEFT );
        hbProfName.getChildren().addAll( lblProfName, tfProfName );
        vbProfName.getChildren().addAll( hbProfName );

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

        gp.add( vbProfName, 1, 0 );
        gp.add( vbCourseTitle, 1, 1 );
        gp.add( vbDepartment, 1, 2 );
        gp.add( vbCourseNumber, 1, 3 );
        gp.add( vbCRN, 1, 4 );
        gp.add( vbSemester, 1, 5 );
        gp.add( vbYear, 1, 6 );

        this.setScene( scene );
        this.show();
    }

}

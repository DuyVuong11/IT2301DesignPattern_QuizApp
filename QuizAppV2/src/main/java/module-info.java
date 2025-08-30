module com.nldv.quizappv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql; 
    requires lombok; 

    opens com.nldv.quizappv2 to javafx.fxml;
    exports com.nldv.quizappv2;
}

module com.example.first_git_project1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.first_git_project to javafx.fxml;
    exports com.example.first_git_project;
}
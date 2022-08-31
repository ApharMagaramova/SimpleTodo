module sample.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.afar.todolist to javafx.fxml;
    exports com.afar.todolist;
}
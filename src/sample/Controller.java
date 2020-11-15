package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;



import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        datePicker.setValue(LocalDate.now());
    }
    @FXML
    Button addButton;
    @FXML
    TextField descriptionTextField;
    @FXML
    DatePicker datePicker;
    @FXML
    ListView<LocalEvent> eventList;
    ObservableList<LocalEvent> list = FXCollections.observableArrayList();

    @FXML
    private void addEvent(Event e){
        list.add(new LocalEvent(datePicker.getValue(),descriptionTextField.getText()));
        eventList.setItems(list);
        refresh();
    }


    private void refresh(){
        datePicker.setValue(LocalDate.now());
        descriptionTextField.setText(null);
    }
}

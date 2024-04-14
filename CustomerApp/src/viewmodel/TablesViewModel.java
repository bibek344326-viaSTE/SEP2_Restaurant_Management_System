package viewmodel;
import javafx.beans.property.*;
import utility.observer.javaobserver.UnnamedPropertyChangeSubject;
import model.TableList;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.ModelManager;
public class TablesViewModel {
    private StringProperty errorProperty;
    private IntegerProperty tableNumberProperty;
    private IntegerProperty capacityProperty;
    private BooleanProperty occupiedProperty;

    private TableList tableList;

    public TablesViewModel(TableList tableList) {
        this.tableList = tableList;

        errorProperty = new SimpleStringProperty();
        tableNumberProperty = new SimpleIntegerProperty();
        capacityProperty = new SimpleIntegerProperty();
        occupiedProperty = new SimpleBooleanProperty();
    }

    public void deleteTable(int tableNumber) {
        try {
            tableList.deleteTable(tableNumber);
        } catch (IllegalArgumentException e) {
            errorProperty.set(e.getMessage());
        }
    }

    public void createTable() {
        try {
            tableList.createTable(tableNumberProperty.get(), capacityProperty.get());
        } catch (IllegalArgumentException e) {
            errorProperty.set(e.getMessage());
        }
    }

    public void updateTable() {
        try {
            tableList.updateTable(tableNumberProperty.get(), occupiedProperty.get());
        } catch (IllegalArgumentException e) {
            errorProperty.set(e.getMessage());
        }
    }

    public StringProperty getErrorProperty() {
        return errorProperty;
    }

    public IntegerProperty getTableNumberProperty() {
        return tableNumberProperty;
    }

    public IntegerProperty getCapacityProperty() {
        return capacityProperty;
    }

    public BooleanProperty getOccupiedProperty() {
        return occupiedProperty;
    }
}
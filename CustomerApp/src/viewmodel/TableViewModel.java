package viewmodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import model.Table;
import model.TableManagementModel;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TableViewModel implements PropertyChangeListener {
    private ObservableList<Table> tableList;
    private TableManagementModel model;
    private TableView<Table> tableView;

    public TableViewModel(TableManagementModel model) {
        this.model = model;
        this.model.addListener(this);
        tableList = FXCollections.observableArrayList();
        updateTableList();

    }

    public ObservableList<Table> getTableList() {
        return tableList;
    }

    private void updateTableList() {
        tableList.clear();
        tableList.addAll(model.getAllTables());
    }

    public void addNewTable() {
        int nextTableNumber = tableList.size() + 1;
        int capacity = 6;
        model.createTable(nextTableNumber, capacity); // Create a new table
        updateTableList();
    }

    public void updateTableDetails() {
        int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            Table selectedTable = tableList.get(selectedIndex);


            boolean newOccupiedStatus = !selectedTable.isOccupied();
            model.updateTable(selectedTable.getTableNumber(), newOccupiedStatus); // Update the table status in the model

            updateTableList();

            System.out.println("Table " + selectedTable.getTableNumber() + " status updated.");
        } else {
            System.out.println("Please select a table to edit.");
        }
    }

    public void deleteTable() {
        Table selectedTable = tableList.get(tableView.getSelectionModel().getSelectedIndex());
        if (selectedTable != null) {
            model.deleteTable(selectedTable.getTableNumber()); // Delete the selected table
            updateTableList();
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("tableList")) {
            updateTableList();
        }
    }
}




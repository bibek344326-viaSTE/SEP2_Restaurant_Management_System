package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class ModelManager implements TableManagementModel {
    private final TableList tableList;
    private final PropertyChangeSupport property;

    public ModelManager() {
        property = new PropertyChangeSupport(this);
        tableList = new TableList();

        // Add some dummy data for testing
        tableList.createTable(1, 4); // Table 1 with capacity 4
        tableList.createTable(2, 6); // Table 2 with capacity 6
        tableList.createTable(3, 8); // Table 3 with capacity 8
    }

    @Override
    public void createTable(int tableNumber, int capacity) {
        tableList.createTable(tableNumber, capacity);
        property.firePropertyChange("TableCreated", null, tableNumber);
    }

   @Override
   public void deleteTable(int tableNumber) {
        tableList.deleteTable(tableNumber);
        property.firePropertyChange("TableDeleted", tableNumber, null);
    }


    @Override
    public void updateTable(int tableNumber, boolean isOccupied) {
        tableList.updateTable(tableNumber, isOccupied);
        property.firePropertyChange("TableUpdated", tableNumber, isOccupied);
    }

    public int getNumberOfTables() {
        return tableList.getNumberOfTables();
    }

    public ArrayList<Table> getAllTables() {
        return tableList.getAllTables();
    }

    @Override
    public void addListener(PropertyChangeListener listener) {
     property.addPropertyChangeListener(listener);
    }

    @Override
    public void removeListener(PropertyChangeListener listener) {
     property.removePropertyChangeListener(listener);
    }
}
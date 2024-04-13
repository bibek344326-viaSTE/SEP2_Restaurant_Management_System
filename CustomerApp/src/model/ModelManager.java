package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class ModelManager implements TableManagement {
    private final TableList tableList;
    private final PropertyChangeSupport property;

    public ModelManager() {
        property = new PropertyChangeSupport(this);
        tableList = new TableList();
    }
    @Override
    public void addListener(PropertyChangeListener listener) {
        property.addPropertyChangeListener(listener);
    }

    @Override
    public void removeListener(PropertyChangeListener listener) {
        property.removePropertyChangeListener(listener);
    }

    public void createTable(int tableNumber, int capacity) {
        tableList.createTable(tableNumber, capacity);
        property.firePropertyChange("TableCreated", null, tableNumber);
    }

    public void deleteTable(int tableNumber) {
        tableList.deleteTable(tableNumber);
        property.firePropertyChange("TableDeleted", tableNumber, null);
    }

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
    public ArrayList<Table> getVacantTables() {
        return tableList.getVacantTables();
    }
}
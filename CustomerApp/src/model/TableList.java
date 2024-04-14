package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

import utility.observer.javaobserver.UnnamedPropertyChangeSubject;

public class TableList implements TableManagement, UnnamedPropertyChangeSubject {
    private ArrayList<Table> tables;
    private PropertyChangeSupport propertyChangeSupport;

    public TableList() {
        tables = new ArrayList<>();
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    @Override
    public void addListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public void removeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    @Override
    public void createTable(int tableNumber, int capacity) {
        Table newTable = new Table(tableNumber, capacity);
        tables.add(newTable);
    }

    @Override
    public void deleteTable(int tableNumber) {
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i).getTableNumber() == tableNumber) {
                tables.remove(i);
                break;
            }
        }
    }

    @Override
    public void updateTable(int tableNumber, boolean isOccupied) {
        for (Table table : tables) {
            if (table.getTableNumber() == tableNumber) {
                if (isOccupied) {
                    table.occupyTable();
                } else {
                    table.vacateTable();
                }
                break;
            }
        }
    }

    public int getNumberOfTables() {
        return tables.size();
    }

    public ArrayList<Table> getAllTables() {
        return tables;
    }

    public ArrayList<Table> getVacantTables() {
        ArrayList<Table> vacantTables = new ArrayList<>();
        for (Table table : tables) {
            if (!table.isOccupied()) {
                vacantTables.add(table);
            }
        }
        return vacantTables;
    }
}
package model;

import utility.observer.javaobserver.UnnamedPropertyChangeSubject;

import java.util.ArrayList;

public interface TableManagementModel extends UnnamedPropertyChangeSubject {
    void createTable(int tableNumber, int capacity);
    void updateTable(int tableNumber, boolean isOccupied);
    void deleteTable(int tableNumber);
    ArrayList<Table> getAllTables();
}
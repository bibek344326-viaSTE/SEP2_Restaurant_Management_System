package model;

interface TableManagement {
    void createTable(int tableNumber);
    void updateTable(int tableNumber, boolean isOccupied);
    void deleteTable(int tableNumber);
}
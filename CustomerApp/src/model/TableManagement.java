package model;

interface TableManagement {
    void createTable(int tableNumber, int capacity);
    void updateTable(int tableNumber, boolean isOccupied);
    void deleteTable(int tableNumber);
}
package model;
import utility.observer.javaobserver.UnnamedPropertyChangeSubject;
interface TableManagement extends UnnamedPropertyChangeSubject {
    void createTable(int tableNumber, int capacity);
    void updateTable(int tableNumber, boolean isOccupied);
    void deleteTable(int tableNumber);
}
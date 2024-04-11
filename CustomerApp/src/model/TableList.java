package model;
import java.util.ArrayList;

class TableList implements TableManagement {
    private ArrayList<Table> tables;

    public TableList() {
        tables = new ArrayList<>();
    }

    // Method to create a new table
    @Override
    public void createTable(int tableNumber) {
        Table newTable = new Table(tableNumber);
        tables.add(newTable);
    }

    // Method to delete a table
    @Override
    public void deleteTable(int tableNumber) {
        for (int i = 0; i < tables.size(); i++) {
            if (tables.get(i).getTableNumber() == tableNumber) {
                tables.remove(i);
                break;
            }
        }
    }

    // Method to update the status of a table
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

    // Method to get the number of tables
    public int getNumberOfTables() {
        return tables.size();
    }
}



package model;

public class Main {
    public static void main(String[] args) {
        // Creating a table manager
        TableList tableList = new TableList();

        // Adding tables with capacity
        tableList.createTable(1, 4);
        tableList.createTable(2, 6);
        tableList.createTable(3, 2);
        tableList.createTable(5, 8);

        // Deleting a table
        tableList.deleteTable(2);

        // Updating table status
        tableList.updateTable(1, true);

        // Displaying number of tables
        System.out.println("Number of tables: " + tableList.getNumberOfTables());

        // Displaying table details
        for (Table table : tableList.getAllTables()) {
            System.out.println("Table number: " + table.getTableNumber() +
                    ", Capacity: " + table.getCapacity() +
                    ", Occupied: " + table.isOccupied());
        }
    }
}
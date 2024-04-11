package model;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a table manager
        TableList tableList = new TableList();

        // Adding tables
        tableList.createTable(1);
        tableList.createTable(2);
        tableList.createTable(3);
        tableList.createTable(5);

        // Deleting a table
        tableList.deleteTable(2);

        // Updating table status
        tableList.updateTable(1, true);

        // Displaying number of tables
        System.out.println("Number of tables: " + tableList.getNumberOfTables());
    }
}
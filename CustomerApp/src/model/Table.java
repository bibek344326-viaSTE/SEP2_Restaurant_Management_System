package model;

class Table {
    private int tableNumber;
    private boolean isOccupied;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
        this.isOccupied = false;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupyTable() {
        isOccupied = true;
    }

    public void vacateTable() {
        isOccupied = false;
    }
}


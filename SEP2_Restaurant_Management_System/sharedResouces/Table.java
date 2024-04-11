package sharedResouces;

import java.io.Serializable;
import java.util.Objects;

public class Table implements Serializable {
    private String tableName;
    private int tableCapacity;

    public Table(String tableName, int tableCapacity) {
        this.tableName = tableName;
        this.tableCapacity = tableCapacity;
    }

    public String getTableName() {
        return tableName;
    }

    public int getTableCapacity() {
        return tableCapacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Table table = (Table) obj;
        return tableCapacity == table.tableCapacity && Objects.equals(tableName, table.tableName);
    }

    @Override
    public String toString() {
        return "sharedResouces.utils.Table{" +
                "sharedResouces.utils.Table Name: '" + tableName + "'" +
                ", sharedResouces.utils.Table Capacity: '" + tableCapacity + "'" + "}";
    }
}

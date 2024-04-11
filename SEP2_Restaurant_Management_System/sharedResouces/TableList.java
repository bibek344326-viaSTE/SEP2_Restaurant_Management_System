package sharedResouces;

import java.util.ArrayList;

public class TableList {
    private ArrayList<Table> tableArrayList;
    public TableList(){
        tableArrayList = new ArrayList<>();
    }
    public boolean contains(Table table){
        for(int i=0;i<tableArrayList.size();i++){
            if(table.equals(tableArrayList.get(i))){
                return true;
            }
        }
        return false;
    }
    public void addTable(Table table){
        if(!contains(table)){
            tableArrayList.add(table);
        }
        else {
            System.out.println("sharedResouces.utils.Table name already exists. Please give a new name");
        }
    }
    public void removeTable(Table table){
        tableArrayList.remove(table);
    }
    public int tableSize(){
        return tableArrayList.size();
    }
    public Table get(int index){
        return tableArrayList.get(index);
    }
}

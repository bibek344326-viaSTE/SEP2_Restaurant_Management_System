package serverInterfaces;

import sharedResouces.Table;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface TableManagerServer extends Remote, Serializable {
    List<Table> getTables() throws RemoteException;
    void addTable(Table table) throws RemoteException;
}

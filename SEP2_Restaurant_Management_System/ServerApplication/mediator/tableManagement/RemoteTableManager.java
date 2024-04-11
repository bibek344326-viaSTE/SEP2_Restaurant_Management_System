package tableManagement;

import serverInterfaces.TableManagerServer;
import sharedResouces.Table;

import java.rmi.RemoteException;
import java.util.List;

public class RemoteTableManager implements TableManagerServer {
    @Override
    public List<Table> getTables() throws RemoteException {
        return null;
    }

    @Override
    public void addTable(Table table) throws RemoteException {

    }
}

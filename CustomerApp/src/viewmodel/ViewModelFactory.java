package viewmodel;


import model.TableManagementModel;
import view.ViewHandler;

public class ViewModelFactory {
    private TableViewModel tableViewModel;

    public ViewModelFactory(TableManagementModel model) {
        this.tableViewModel = new TableViewModel(model);
    }
    public TableViewModel getTableViewModel() {
        return tableViewModel;
    }
}


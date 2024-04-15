import javafx.application.Application;
import javafx.stage.Stage;
import model.ModelManager;
import model.TableManagementModel;
import view.ViewHandler;
import viewmodel.ViewModelFactory;

public class StaffApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        TableManagementModel model = new ModelManager();
        ViewModelFactory viewModelFactory = new ViewModelFactory(model);
        ViewHandler view = new ViewHandler(viewModelFactory);
        view.start(primaryStage);
    }
}

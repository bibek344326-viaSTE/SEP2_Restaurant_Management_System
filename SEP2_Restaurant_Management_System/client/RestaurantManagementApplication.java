package client;

import client.core.ClientFactory;
import client.core.ModelFactory;
import client.core.ViewModelFactory;
import client.view.ViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;

public class RestaurantManagementApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ClientFactory client = new ClientFactory();
        ModelFactory modelFactory = new ModelFactory(client);
        ViewModelFactory viewModelFactory = new ViewModelFactory(modelFactory);
        ViewHandler viewHandler = new ViewHandler(viewModelFactory);
        viewHandler.start();
    }
}

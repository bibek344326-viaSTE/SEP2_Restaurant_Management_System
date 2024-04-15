package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import viewmodel.ViewModelFactory;
import java.io.IOException;

public class ViewHandler {
    private Scene currentScene;
    private Stage primaryStage;
    private ViewModelFactory viewModelFactory;
    private TableViewController tableViewController;

    public ViewHandler(ViewModelFactory viewModelFactory) {
        this.viewModelFactory = viewModelFactory;
        this.currentScene = new Scene(new Region());
    }

    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        openTableView("Table");
    }

    public void openTableView(String tableView) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Table.fxml"));
            Region root = loader.load();

            tableViewController = loader.getController();
            tableViewController.init(this, viewModelFactory.getTableViewModel(), root);

            currentScene.setRoot(root);
            primaryStage.setScene(currentScene);
            primaryStage.setTitle("Restaurant Management System");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


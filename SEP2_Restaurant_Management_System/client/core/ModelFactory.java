package client.core;

import client.model.LoginModel;
import client.model.LoginModelManager;

public class ModelFactory {

    private final ClientFactory client;
    private LoginModel  loginModel;

    public ModelFactory (ClientFactory client) {
        this.client = client;
    }

    public LoginModel getLoginModel(){
       if (loginModel == null){
           loginModel = new LoginModelManager(client.getClient());
       }
       return loginModel;
    }
}

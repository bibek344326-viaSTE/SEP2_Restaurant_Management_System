package client.view.login;

import client.core.ModelFactory;
import client.model.LoginModel;

public class LoginViewModel {
    private final LoginModel loginModel;

    public LoginViewModel(ModelFactory modelFactory) {
        this.loginModel = modelFactory.getLoginModel();
    }

    public void login(String hi) {
        loginModel.login(hi);
    }
}

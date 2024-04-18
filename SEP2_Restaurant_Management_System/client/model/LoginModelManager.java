package client.model;

import client.mediator.Client;

public class LoginModelManager implements LoginModel{
    private final Client client;

    public LoginModelManager(Client client) {
        this.client = client;
    }

    @Override
    public void login(String hi) {
        client.login(hi);
    }
}

package sharedResources.utils.user;

import java.io.Serializable;

public abstract class User implements Serializable {
    private String userName;
    private String password;

    public User(String userName, String password) {
        validateUsername(userName);
        validatePassword(password);
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {

        return password;
    }

    public abstract String getUserType();

    private void validateUsername(String username) {
        if (username.length() < 4) {
            throw new IllegalStateException("Username should consist more than 3 characters");
        } else if (username.length() > 14) {
            throw new IllegalStateException("Username should consist less than 15 characters");
        }
        char[] chars = username.toCharArray();
        boolean hasDigits = false;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                hasDigits = true;
                break;
            }
        }
        if (!hasDigits) {
            throw new IllegalStateException("Username should have at least one digit..");
        }
    }

    private void validatePassword(String password) {
        if (password.length() < 4) {
            throw new IllegalStateException("Password should consist more than 3 characters");
        } else if (password.length() > 14) {
            throw new IllegalStateException("Password should consist less than 15 characters");
        }
        char[] chars = password.toCharArray();
        boolean hasDigits = false;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                hasDigits = true;
                break;
            }
        }
        if (!hasDigits) {
            throw new IllegalStateException("Password should have at least one digit..");
        }
    }
}

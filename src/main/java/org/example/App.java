package org.example;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App {
    public Boolean login_test(String uname, String pass) {
        ResourceBundle r = ResourceBundle.getBundle("Config");
        String username = r.getString("username");
        String password = r.getString("password");

        if (username.equals(uname) && password.equals(pass)) {
            return true;
        } else {
            return false;

        }


    }
}

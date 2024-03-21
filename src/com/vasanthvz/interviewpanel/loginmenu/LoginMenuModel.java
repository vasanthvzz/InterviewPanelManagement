package com.vasanthvz.interviewpanel.loginmenu;

public class LoginMenuModel {
    private LoginMenuView loginMenuView;

    LoginMenuModel(LoginMenuView loginMenuView) {
        this.loginMenuView = loginMenuView;
    }


    public void redirectChoice(String choice) {
        switch (choice) {
            case "1": {
                loginMenuView.loginAdmin();
                break;
            }
            case "2": {
                loginMenuView.loginInterviewer();
                break;
            }
            case "3": {
                loginMenuView.onExit();
                break;
            }
            default: {
                loginMenuView.onFail();
                break;
            }
        }
    }
}

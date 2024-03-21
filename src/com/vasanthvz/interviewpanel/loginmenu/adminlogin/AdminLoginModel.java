package com.vasanthvz.interviewpanel.loginmenu.adminlogin;

public class AdminLoginModel {
    private AdminLoginView adminLoginView;

    AdminLoginModel(AdminLoginView adminLoginView) {
        this.adminLoginView = adminLoginView;
    }

    void validate(String userName, String password) {
        if (userName.equals("123")) {
            if (password.equals(("123"))) {
                adminLoginView.onSucesslogin();
            } else {
                adminLoginView.showAlert("wrong password");
            }
        } else {
            adminLoginView.showAlert("username not found");
        }
    }


}

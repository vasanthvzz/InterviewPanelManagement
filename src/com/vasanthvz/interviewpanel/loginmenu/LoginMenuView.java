package com.vasanthvz.interviewpanel.loginmenu;

import com.vasanthvz.interviewpanel.InterviewPanel;
import com.vasanthvz.interviewpanel.View;
import com.vasanthvz.interviewpanel.loginmenu.adminlogin.AdminLoginView;
import com.vasanthvz.interviewpanel.loginmenu.interviewerlogin.InterviewerLoginView;

public class LoginMenuView extends View {
    private LoginMenuModel loginMenuModel;

    public LoginMenuView() {
        loginMenuModel = new LoginMenuModel(this);
    }

    public void init() {
        System.out.println("---------" + InterviewPanel.getInstance().getAppName()
                + "--------\n version " + InterviewPanel.getInstance().getAppVersion());
        showLoginMenu();
    }

    private void showLoginMenu() {
        System.out.println("1. Login Admin");
        System.out.println("2. Login User");
        System.out.println("3. Exit");
        System.out.println("Please enter an option to proceed");
        String choice = sc.next();
        loginMenuModel.redirectChoice(choice);
    }


    public void loginAdmin() {
        new AdminLoginView().init();
    }

    public void loginInterviewer() {
        new InterviewerLoginView().init();
    }

    public void onExit() {
        System.out.println("Exiting............");
    }

    public void onFail() {
        System.out.println("Please enter a valid option!");
        showLoginMenu();
    }
}

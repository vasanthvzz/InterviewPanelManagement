package com.vasanthvz.interviewpanel.loginmenu.adminlogin;

import com.vasanthvz.interviewpanel.View;
import com.vasanthvz.interviewpanel.createinterview.CreateInterviewView;

import java.util.Scanner;

public class AdminLoginView extends View {
    private AdminLoginModel adminLoginModel;

    public AdminLoginView() {
        adminLoginModel = new AdminLoginModel(this);
    }

    public void init() {
        showTitle("Admin login menu");
        loginAccount();
    }

    public void loginAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user name : ");
        String username = sc.next();
        System.out.println("Enter your password : ");
        String password = sc.next();
        adminLoginModel.validate(username, password);
    }

    void onSucesslogin() {
        showAlert("Logged in successfully");
        CreateInterviewView createMeetingView = new CreateInterviewView();
        createMeetingView.init();
    }


}

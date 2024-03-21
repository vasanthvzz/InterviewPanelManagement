package com.vasanthvz.interviewpanel;

import com.vasanthvz.interviewpanel.loginmenu.LoginMenuView;

public class InterviewPanel {
    private static InterviewPanel interviewPanel;

    private String appName = "Interview Panel Application";
    private String appVersion = "0.0.1";

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    InterviewPanel() {

    }

    public static InterviewPanel getInstance() {
        if (interviewPanel == null) {
            interviewPanel = new InterviewPanel();
        }
        return interviewPanel;
    }

    private void create() {
        LoginMenuView loginMenuView = new LoginMenuView();
        loginMenuView.init();
    }

    public static void main(String[] args) {
        InterviewPanel.getInstance().create();
    }
}

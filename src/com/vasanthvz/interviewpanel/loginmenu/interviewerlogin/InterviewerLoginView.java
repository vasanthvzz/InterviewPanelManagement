package com.vasanthvz.interviewpanel.loginmenu.interviewerlogin;

import com.vasanthvz.interviewpanel.View;
import com.vasanthvz.interviewpanel.interviewermenu.InterviewerMenuView;

public class InterviewerLoginView extends View {
    private InterviewerLoginModel interviewerLoginModel;

    public InterviewerLoginView() {
        this.interviewerLoginModel = new InterviewerLoginModel(this);
    }

    public void init() {
        showTitle("Interviewer Login Menu");
        loginInterviewer();
    }

    public void loginInterviewer() {
        showText("Enter user name : ");
        String name = sc.next();
        showText("Enter password : ");
        String password = sc.next();
        interviewerLoginModel.validateInterviewer(name, password);
    }

    public void onSuccess() {
        showText("Logging in........");
        new InterviewerMenuView().init();
    }
}

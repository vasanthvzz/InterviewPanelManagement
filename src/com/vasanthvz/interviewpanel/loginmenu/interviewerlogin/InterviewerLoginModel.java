package com.vasanthvz.interviewpanel.loginmenu.interviewerlogin;

public class InterviewerLoginModel {
    private InterviewerLoginView interviewerLoginView;

    public InterviewerLoginModel(InterviewerLoginView interviewerLoginView) {
        this.interviewerLoginView = interviewerLoginView;
    }

    public void validateInterviewer(String name, String password) {
        if (name.equals("12")) {
            if (password.equals("12")) {
                interviewerLoginView.onSuccess();
            } else {
                interviewerLoginView.showAlert("Invalid password");
            }
        } else {
            interviewerLoginView.showAlert("Invalid user name");
        }
    }
}

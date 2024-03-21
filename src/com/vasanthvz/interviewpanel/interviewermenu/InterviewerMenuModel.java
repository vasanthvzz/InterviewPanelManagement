package com.vasanthvz.interviewpanel.interviewermenu;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;

public class InterviewerMenuModel {
    private InterviewerMenuView interviewerMenuView;

    public InterviewerMenuModel(InterviewerMenuView interviewerMenuView) {
        this.interviewerMenuView = interviewerMenuView;
    }

    public void getInterviewStatus() {
        InterviewDatabase currentDb = InterviewDatabase.getInstance();
        if (currentDb.isInterviewCreated()) {
            interviewerMenuView.redirectInterviewerPanel();
        } else {
            interviewerMenuView.onFail();
        }
    }
}

package com.vasanthvz.interviewpanel.interviewermenu;

import com.vasanthvz.interviewpanel.View;
import com.vasanthvz.interviewpanel.interviewermenu.interviewerpanel.InterviewerPanelView;

public class InterviewerMenuView extends View {
    private InterviewerMenuModel interviewerMenuModel;

    public InterviewerMenuView() {
        interviewerMenuModel = new InterviewerMenuModel(this);
    }

    public void init() {
        showText("Fetching interviews...........");
        interviewerMenuModel.getInterviewStatus();
    }

    public void onFail() {
        showAlert("There is no interview to show. Please create a new interview");
    }

    public void redirectInterviewerPanel() {
        new InterviewerPanelView().init();

    }
}

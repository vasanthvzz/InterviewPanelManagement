package com.vasanthvz.interviewpanel.manageinterviewer.viewinterviewer;

import com.vasanthvz.interviewpanel.manageinterviewer.ManageInterviewerView;

public class ViewInterviewerView {
    private ViewInterviewerModel viewInterviewerModel;

    public ViewInterviewerView() {
        viewInterviewerModel = new ViewInterviewerModel(this);
    }

    public void init() {
        System.out.println("Showing all the interviewers....");
        showInterviewers();
        goBack();
    }

    private void showInterviewers() {
        viewInterviewerModel.getInterviewerDetail();
    }

    private void goBack() {
        new ManageInterviewerView().init();
    }
}

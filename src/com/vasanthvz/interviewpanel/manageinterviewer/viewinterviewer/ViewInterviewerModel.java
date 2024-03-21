package com.vasanthvz.interviewpanel.manageinterviewer.viewinterviewer;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;

public class ViewInterviewerModel {
    private ViewInterviewerView viewInterviewerView;

    ViewInterviewerModel(ViewInterviewerView viewInterviewerView) {
        this.viewInterviewerView = viewInterviewerView;
    }

    public void getInterviewerDetail() {
        InterviewDatabase.getInstance().viewAllInterviewer();
    }
}

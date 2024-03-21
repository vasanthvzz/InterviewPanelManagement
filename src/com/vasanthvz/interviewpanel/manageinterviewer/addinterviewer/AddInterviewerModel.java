package com.vasanthvz.interviewpanel.manageinterviewer.addinterviewer;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;

public class AddInterviewerModel {
    private AddInterviewerView addInterviewerView;

    AddInterviewerModel(AddInterviewerView addInterviewerView) {
        this.addInterviewerView = addInterviewerView;
    }

    public void addInterviewer(String name, int id) {
        boolean isAdded = InterviewDatabase.getInstance().addInterviewer(name, id);
        if (isAdded) {
            addInterviewerView.onSuccess();
        } else {
            addInterviewerView.onFail();
        }
    }
}

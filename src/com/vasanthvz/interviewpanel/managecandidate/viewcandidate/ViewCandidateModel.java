package com.vasanthvz.interviewpanel.managecandidate.viewcandidate;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;

public class ViewCandidateModel {
    private ViewCandidateView viewCandidateView;

    ViewCandidateModel(ViewCandidateView viewCandidateView) {
        this.viewCandidateView = viewCandidateView;
    }

    public void getCandidateDetail() {
        InterviewDatabase.getInstance().viewAllCandidate();
    }
}

package com.vasanthvz.interviewpanel.managecandidate.viewcandidate;

import com.vasanthvz.interviewpanel.managecandidate.ManageCandidateView;

public class ViewCandidateView {

    private ViewCandidateModel viewCandidateModel;

    public ViewCandidateView() {
        viewCandidateModel = new ViewCandidateModel(this);
    }

    public void init() {
        System.out.println("Showing all the candidates ------------------");
        showCandidate();
        goBack();
    }

    public void showCandidate() {
        viewCandidateModel.getCandidateDetail();
    }

    private void goBack() {
        new ManageCandidateView().init();
    }
}

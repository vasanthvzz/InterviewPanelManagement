package com.vasanthvz.interviewpanel.managecandidate.findcandidate;

import com.vasanthvz.interviewpanel.managecandidate.ManageCandidateView;

import java.util.Scanner;

public class FindCandidateView {
    private FindCandidateModel findCandidateModel;

    public FindCandidateView() {
        this.findCandidateModel = new FindCandidateModel(this);
    }

    public void init() {
        System.out.println("Finding the candidate ...............");
        getCandidateDetail();
        goBack();
    }

    private void goBack() {
        new ManageCandidateView().init();
    }

    public void getCandidateDetail() {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        findCandidateModel.searchCandidateDetail(id);
    }

    public void showAlert(String alert) {
        System.out.println(alert);
    }

}

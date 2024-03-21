package com.vasanthvz.interviewpanel.managemeeting;

import com.vasanthvz.interviewpanel.managecandidate.ManageCandidateView;

import java.util.Scanner;

public class ManageMeetingView {
    private ManageMeetingModel manageMeetingModel;

    public ManageMeetingView() {
        manageMeetingModel = new ManageMeetingModel(this);
    }

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please set an option to proceed");
        System.out.println("1.Manage Candidates");
        System.out.println("2.Manage Interviewers");
        System.out.println("0.Exit");
        String choice = sc.next();
        manageMeetingModel.redirectChoice(choice);

    }

    public void goManageCandidate() {
        new ManageCandidateView().init();
    }

    public void goManageInterviewer() {
    }

    void showAlert(String alert) {
        System.out.println(alert);
    }
}

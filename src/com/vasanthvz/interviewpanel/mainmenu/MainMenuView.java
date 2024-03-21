package com.vasanthvz.interviewpanel.mainmenu;

import com.vasanthvz.interviewpanel.managecandidate.ManageCandidateView;
import com.vasanthvz.interviewpanel.manageinterviewer.ManageInterviewerView;
import com.vasanthvz.interviewpanel.startinterview.StartInterviewView;

import java.util.Scanner;

public class MainMenuView {
    private MainMenuModel mainMenuModel;

    public MainMenuView() {
        mainMenuModel = new MainMenuModel(this);
    }

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please set an option to proceed");
        System.out.println("1.Manage Candidates");
        System.out.println("2.Manage Interviewers");
        System.out.println("3.Start Interview");
        System.out.println("0.Exit");
        String choice = sc.next();
        mainMenuModel.redirectChoice(choice);

    }

    public void goManageCandidate() {
        new ManageCandidateView().init();
    }

    public void goManageInterviewer() {
        new ManageInterviewerView().init();
    }

    void showAlert(String alert) {
        System.out.println(alert);
    }


    public void goStartInterview() {
        new StartInterviewView().init();
    }
}

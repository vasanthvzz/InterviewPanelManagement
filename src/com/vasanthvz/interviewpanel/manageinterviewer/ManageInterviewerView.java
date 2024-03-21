package com.vasanthvz.interviewpanel.manageinterviewer;

import com.vasanthvz.interviewpanel.mainmenu.MainMenuView;
import com.vasanthvz.interviewpanel.manageinterviewer.addinterviewer.AddInterviewerView;

import java.util.Scanner;

public class ManageInterviewerView {
    public ManageInterviewerModel manageInterviewerModel;

    public ManageInterviewerView() {
        manageInterviewerModel = new ManageInterviewerModel(this);
    }

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Interviewer");
        System.out.println("2.View all interviewer");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        manageInterviewerModel.redirectOption(choice);
        goBack();
    }

    void addInterviewer() {
        new AddInterviewerView().init();
    }

    void viewAllInterviewer() {

    }

    private void goBack() {
        new MainMenuView().init();
    }

    public void showAlert(String s) {
        System.out.println(s);
    }
}

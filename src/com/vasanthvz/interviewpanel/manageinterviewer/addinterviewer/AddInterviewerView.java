package com.vasanthvz.interviewpanel.manageinterviewer.addinterviewer;

import com.vasanthvz.interviewpanel.manageinterviewer.ManageInterviewerView;

import java.util.Scanner;

public class AddInterviewerView {
    private AddInterviewerModel addInterviewerModel;

    public AddInterviewerView() {
        addInterviewerModel = new AddInterviewerModel(this);
    }

    public void init() {
        getInterviewerDetail();
        goBack();
    }

    private void goBack() {
        new ManageInterviewerView().init();
    }

    private void getInterviewerDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interviewer name : ");
        String name = sc.next();
        System.out.println("Enter the id : ");
        int id = sc.nextInt();
        addInterviewerModel.addInterviewer(name, id);
    }

    public void onSuccess() {
        System.out.println("Interviewer added successfully");
    }

    public void onFail() {
        System.out.println("unable to add interviewer. Please try again!");
    }
}

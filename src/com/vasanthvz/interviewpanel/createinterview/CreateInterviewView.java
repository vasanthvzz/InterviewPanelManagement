package com.vasanthvz.interviewpanel.createmeeting;

import com.vasanthvz.interviewpanel.managemeeting.ManageMeetingView;

import java.util.Scanner;

public class CreateMeetingView {
    private CreateMeetingModel createMeetingModel;

    public CreateMeetingView() {
        createMeetingModel = new CreateMeetingModel(this);
    }

    public void init() {
        System.out.println("Creating new meeting..........\n Please Enter the Details below");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the meeting : ");
        String name = sc.nextLine();
        System.out.println("Enter the number of candidates : ");
        int candidateCount = sc.nextInt();
        System.out.println("Enter the number of interviewers : ");
        int interviewerCount = sc.nextInt();
        createMeetingModel.createNewMeeting(name, candidateCount, interviewerCount);
    }

    void showAlert(String alert) {
        System.out.println(alert);
    }

    void onSuccessCreation() {
        showAlert("Meeting created successfully");
        ManageMeetingView manageMeetingView = new ManageMeetingView();
        manageMeetingView.init();
    }
}

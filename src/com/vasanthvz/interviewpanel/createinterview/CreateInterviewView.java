package com.vasanthvz.interviewpanel.createinterview;

import com.vasanthvz.interviewpanel.mainmenu.MainMenuView;

import java.util.Scanner;

public class CreateInterviewView {
    private CreateInterviewModel createInterviewModel;

    public CreateInterviewView() {
        createInterviewModel = new CreateInterviewModel(this);
    }

    public void init() {
        System.out.println("Creating new meeting..........\n Please Enter the Details below");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the meeting : ");
        String name = sc.nextLine();
        System.out.println("Enter the number of candidates : ");
        int candidateCount = sc.nextInt();
        System.out.println("Enter the number of candidates at a time : ");
        int candidateForOneCycle = sc.nextInt();
        createInterviewModel.createNewMeeting(name, candidateCount, candidateForOneCycle);
    }

    void showAlert(String alert) {
        System.out.println(alert);
    }

    void onSuccessCreation() {
        showAlert("Meeting created successfully");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.init();
    }
}

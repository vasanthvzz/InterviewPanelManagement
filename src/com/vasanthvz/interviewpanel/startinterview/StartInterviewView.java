package com.vasanthvz.interviewpanel.startinterview;

import com.vasanthvz.interviewpanel.managecandidate.addcandidate.AddCandidateView;
import com.vasanthvz.interviewpanel.managecandidate.deletecandidate.DeleteCandidateView;
import com.vasanthvz.interviewpanel.managecandidate.viewcandidate.ViewCandidateView;
import com.vasanthvz.interviewpanel.startinterview.assigninterviewer.AssignInterviewerView;
import com.vasanthvz.interviewpanel.startinterview.currentstatus.CurrentStatusView;

import java.util.Scanner;

public class StartInterviewView {
    private StartInterviewModel startInterviewModel;

    public StartInterviewView() {
        startInterviewModel = new StartInterviewModel(this);
    }

    public void init() {
        System.out.println("Starting the interview.........");
        interviewMenu();
    }

    public void interviewMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tThe interview has been started \n");
        System.out.println("1.Add Candidate");
        System.out.println("2.Remove Candidate");
        System.out.println("3.View Candidates");
        System.out.println("4.Assign Interviewer");
        System.out.println("5.Get current status");
        System.out.println("0.Finish Interview");
        int choice = sc.nextInt();
    }

    public void setAlert(String alert) {
        System.out.println(alert);
    }

    public void addCandidate() {
        new AddCandidateView().init();
    }

    public void removeCandidate() {
        new DeleteCandidateView().init();
    }

    public void viewCandidate() {
        new ViewCandidateView().init();
    }

    public void assignInterviewer() {
        new AssignInterviewerView().init();
    }

    public void getCurrentStatus() {
        new CurrentStatusView().init();
    }
}

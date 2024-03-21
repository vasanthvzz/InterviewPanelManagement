package com.vasanthvz.interviewpanel.startinterview.assigninterviewer;

import com.vasanthvz.interviewpanel.model.Candidate;
import com.vasanthvz.interviewpanel.startinterview.StartInterviewView;

import java.util.Scanner;

public class AssignInterviewerView {
    private AssignInterviewerModel assignInterviewerModel;

    public AssignInterviewerView() {
        assignInterviewerModel = new AssignInterviewerModel(this);
    }

    public void init() {
        assignInterviewerMenu();
        goBack();
    }

    public void assignInterviewerMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Assigning Interviewer......");
        System.out.println("Enter the Interview id : ");
        int interviewerId = sc.nextInt();
        System.out.println("Enter the candidateId : ");
        int candidateId = sc.nextInt();
        assignInterviewerModel.assignInterviewer(interviewerId, candidateId);
    }

    public static void onSuccessAssign(String candidateName, String interviewerName) {
        System.out.println(candidateName + " has been assigned to " + interviewerName);
    }

    public void onFailAssign() {
        System.out.println("Unable to assign ! Please recheck the candidate id and interviewer id");
    }

    public void printCandidate(Candidate candidate) {
        System.out.println("Name : ");
    }


    private void goBack() {
        new StartInterviewView().init();
    }


}

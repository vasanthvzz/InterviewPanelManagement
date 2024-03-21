package com.vasanthvz.interviewpanel.managecandidate.addcandidate;

import com.vasanthvz.interviewpanel.managecandidate.ManageCandidateView;

import java.util.Scanner;

public class AddCandidateView {
    private AddCandidateModel addCandidateModel;

    public AddCandidateView() {
        addCandidateModel = new AddCandidateModel(this);
    }

    public void init() {
        getCandidateDetail();
        goBack();
    }

    public void getCandidateDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the candidate name : ");
        String name = sc.next();
        System.out.println("Enter the candidate id : ");
        int id = sc.nextInt();
        System.out.print("Available slots : ");
        addCandidateModel.getCurrentSlot();
        System.out.println("Enter the candidate number : (press 0 to append)");
        int candidateNumber = sc.nextInt();
        addCandidateModel.addCandidate(name, id, candidateNumber);
    }

    public void onSuccessAdd() {
        System.out.println("Candidate added successfully");
    }

    public void onFailAdd() {
        System.out.println("Unable to create candidate ! Please try again");
    }

    void goBack() {
        new ManageCandidateView().init();
    }


}


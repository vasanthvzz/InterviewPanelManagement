package com.vasanthvz.interviewpanel.managecandidate.deletecandidate;

import com.vasanthvz.interviewpanel.managecandidate.ManageCandidateView;

import java.util.Scanner;

public class DeleteCandidateView {
    private DeleteCandidateModel deleteCandidateModel;

    public DeleteCandidateView() {
        deleteCandidateModel = new DeleteCandidateModel(this);
    }

    public void init() {
        System.out.println("Deleting candidate menu");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the candidate id : ");
        int candidateId = sc.nextInt();
        deleteCandidateModel.deleteCandidate(candidateId);
        goBack();
    }

    public void onSuccess() {
        System.out.println("Candidate deleted successfully");
        goBack();
    }

    public void onFail() {
        System.out.println("Cannot find the candidate ! ");
        goBack();
    }

    public void goBack() {
        new ManageCandidateView().init();
    }
}

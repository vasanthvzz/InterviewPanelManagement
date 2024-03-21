package com.vasanthvz.interviewpanel.managecandidate;

public class ManageCandidateModel {
    private ManageCandidateView manageCandidateView;

    ManageCandidateModel(ManageCandidateView manageCandidateView) {
        this.manageCandidateView = manageCandidateView;
    }

    void redirectOption(int choice) {
        switch (choice) {
            case 1: {
                manageCandidateView.addingCandidate();
                break;
            }
            case 2: {
                manageCandidateView.findCandidate();
                break;
            }
            case 3: {
                manageCandidateView.viewAllCandidate();
                break;
            }
            case 4: {
                manageCandidateView.deleteCandidate();
                break;
            }
            case 0: {
                manageCandidateView.showAlert("Exiting.............");
                break;
            }
            default: {
                System.out.println("Please enter a valid option ");
                manageCandidateView.init();
                break;
            }
        }
    }
}

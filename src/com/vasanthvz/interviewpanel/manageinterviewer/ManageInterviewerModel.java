package com.vasanthvz.interviewpanel.manageinterviewer;

public class ManageInterviewerModel {
    private ManageInterviewerView manageInterviewerView;

    ManageInterviewerModel(ManageInterviewerView manageInterviewerView) {
        this.manageInterviewerView = manageInterviewerView;
    }

    public void redirectOption(int choice) {
        switch (choice) {
            case 1: {
                manageInterviewerView.addInterviewer();
                break;
            }
            case 2: {
                manageInterviewerView.viewAllInterviewer();
                break;
            }
            case 0: {
                manageInterviewerView.showAlert("Exiting.............");
                break;
            }
            default: {
                System.out.println("Please enter a valid option ");
                manageInterviewerView.init();
                break;
            }
        }
    }
}

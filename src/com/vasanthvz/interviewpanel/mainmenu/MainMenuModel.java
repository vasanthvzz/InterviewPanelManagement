package com.vasanthvz.interviewpanel.managemeeting;

public class ManageMeetingModel {
    private ManageMeetingView manageMeetingView;

    public ManageMeetingModel(ManageMeetingView manageMeetingView) {
        this.manageMeetingView = manageMeetingView;
    }

    public void redirectChoice(String choice) {
        switch (choice) {
            case "1": {
                manageMeetingView.goManageCandidate();
                break;
            }
            case "2": {
                manageMeetingView.goManageInterviewer();
                break;
            }
            case "0": {
                manageMeetingView.showAlert("Exiting.......");
                break;
            }

            default:
                manageMeetingView.showAlert("Please set a proper option");
                manageMeetingView.init();
                break;
        }
    }
}

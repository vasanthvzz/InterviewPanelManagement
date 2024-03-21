package com.vasanthvz.interviewpanel.startinterview;

public class StartInterviewModel {
    private StartInterviewView startInterviewView;

    StartInterviewModel(StartInterviewView startInterviewView) {
        this.startInterviewView = startInterviewView;
    }

    public void redirectChoice(int choice) {
        switch (choice) {
            case 1: {
                startInterviewView.addCandidate();
                break;
            }
            case 2: {
                startInterviewView.removeCandidate();
                break;
            }
            case 3: {
                startInterviewView.viewCandidate();
                break;
            }
            case 4: {
                startInterviewView.assignInterviewer();
                break;
            }
            case 5: {
                startInterviewView.getCurrentStatus();
            }
            case 0: {
                break;
            }
            default:
                startInterviewView.setAlert("Invalid option");
        }
    }
}

package com.vasanthvz.interviewpanel.startinterview.currentstatus;

import com.vasanthvz.interviewpanel.startinterview.StartInterviewView;

public class CurrentStatusView {
    private CurrentStatusModel currentStatusModel;

    public CurrentStatusView() {
        this.currentStatusModel = new CurrentStatusModel(this);
    }

    public void init() {
        System.out.println("Retrieving current interview information");
        currentStatusModel.getCurrentInfo();
        new StartInterviewView().init();
    }

    public void showCandidates(String candidateName, String interviewerName) {
        System.out.println(candidateName + " is being interviewed by " + interviewerName);
    }

    public void onFail(int id) {
        System.out.println("Please assign a interviewer for the candidate with id - " + id);
    }
}

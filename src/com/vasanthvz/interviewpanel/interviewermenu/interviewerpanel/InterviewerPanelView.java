package com.vasanthvz.interviewpanel.interviewermenu.interviewerpanel;

import com.vasanthvz.interviewpanel.View;
import com.vasanthvz.interviewpanel.model.Candidate;

import java.util.List;

public class InterviewerPanelView extends View {
    private InterviewerPanelModel interviewerPanelModel;

    public InterviewerPanelView() {
        interviewerPanelModel = new InterviewerPanelModel(this);
    }

    public void init() {
        showTitle("Interviewer Panel");
        getInterviewerId();
    }

    public void getInterviewerId() {
        showText("Please enter your id : ");
        int interviewerId = sc.nextInt();
        interviewerPanelModel.retrieveInterviewerData(interviewerId);
    }

    public void onFail() {
        showAlert("Interviewer id is not present. Please register!");
    }

    public void onSuccessLogin(String name) {
        showText("Welcome " + name + " !");

    }

    public void showCandidates(List<Candidate> candidates) {
        for (Candidate candidate : candidates) {
            System.out.println("Name : " + candidate.getName() + "\tCandidate number : " + candidate.getCandidateNumber());
        }
    }

    public int getCandidateId() {
        showText("Enter the candidate id you want to add marks or remarks");
        return sc.nextInt();
    }

    public String getChoice() {
        showTitle("Edit Candidate marks and remark here");
        showText("1.Edit mark");
        showText("2.Edit remarks");
        showText("3.Logout");
        return sc.next();
    }
}

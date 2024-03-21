package com.vasanthvz.interviewpanel.interviewermenu.interviewerpanel;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;
import com.vasanthvz.interviewpanel.loginmenu.LoginMenuView;
import com.vasanthvz.interviewpanel.model.Candidate;
import com.vasanthvz.interviewpanel.model.Interviewer;

import java.util.List;
import java.util.Scanner;

public class InterviewerPanelModel {
    private InterviewerPanelView interviewerPanelView;
    private List<Candidate> candidateList;
    private Interviewer interviewer;
    private InterviewDatabase currentDb;

    public InterviewerPanelModel(InterviewerPanelView interviewerPanelView) {
        this.interviewerPanelView = interviewerPanelView;
    }

    public void retrieveInterviewerData(int interviewerId) {
        InterviewDatabase currentDb = InterviewDatabase.getInstance();
        boolean isInterviewerFound = currentDb.isInterviewerPresent(interviewerId);
        if (isInterviewerFound) {
            interviewer = currentDb.getInterviewer(interviewerId);
            interviewerPanelView.onSuccessLogin(interviewer.getName());
            candidateList = interviewer.getCandidates();
            interviewerPanelView.showCandidates(candidateList);
            int candidateId = interviewerPanelView.getCandidateId();
            if (getCandidate(candidateList, candidateId) != null) {
                Candidate candidate = getCandidate(candidateList, candidateId);
                interviewerPanelView.getChoice();
                String choice = interviewerPanelView.getChoice();
            } else {

            }


        } else {
            interviewerPanelView.onFail();
        }
    }

    public Candidate getCandidate(List<Candidate> candidateList, int id) {
        for (Candidate candidate : candidateList) {
            if (candidate.getId() == id) {
                return candidate;
            }
        }
        return null;
    }

    public void redirectChoice(String choice, Candidate candidate) {
        switch (choice) {
            case "1": {
                editMark(candidate);
                break;
            }
            case "2": {
                editRemark(candidate);
                break;
            }
            case "3": {
                new LoginMenuView().init();
            }
            default: {
                interviewerPanelView.showAlert("Please select a valid option");
            }
        }
    }

    void editMark(Candidate candidate) {
        Scanner sc = new Scanner(System.in);
        interviewerPanelView.showText("Enter the mark you want to add :");
        candidate.setMark(sc.nextInt());
    }

    void editRemark(Candidate candidate) {
        Scanner sc = new Scanner(System.in);
        interviewerPanelView.showText("Enter the remark for the candidate :");
        candidate.setRemarks(sc.next());
    }
}

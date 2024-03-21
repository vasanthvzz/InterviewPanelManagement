package com.vasanthvz.interviewpanel.managecandidate.addcandidate;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;

public class AddCandidateModel {
    private AddCandidateView addCandidateView;

    AddCandidateModel(AddCandidateView addCandidateView) {
        this.addCandidateView = addCandidateView;
    }

    void getCurrentSlot() {
        InterviewDatabase.getInstance().getAvailableSlot();
    }

    public void addCandidate(String name, int id, int candidateNumber) {
        boolean isAdded = InterviewDatabase.interviewDatabase.addCandidate(name, id, candidateNumber);
        if (isAdded) {
            addCandidateView.onSuccessAdd();
        } else {
            addCandidateView.onFailAdd();
        }
    }
}

package com.vasanthvz.interviewpanel.managecandidate.findcandidate;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;
import com.vasanthvz.interviewpanel.model.Candidate;

public class FindCandidateModel {
    private FindCandidateView findCandidateView;

    FindCandidateModel(FindCandidateView findCandidateView) {
        this.findCandidateView = findCandidateView;
    }

    public void searchCandidateDetail(int id) {
        boolean isPresent = InterviewDatabase.getInstance().isCandidatePresent(id);
        if (isPresent) {
            Candidate candidate = InterviewDatabase.getInstance().searchCandidate(id);
            findCandidateView.showAlert(candidate.getName() + "  " + candidate.getId() + "  " + candidate.getCandidateNumber());
        } else {
            findCandidateView.showAlert("candidate not found ! ");
        }
    }
}

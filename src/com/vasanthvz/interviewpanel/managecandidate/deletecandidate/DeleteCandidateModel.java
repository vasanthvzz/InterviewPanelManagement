package com.vasanthvz.interviewpanel.managecandidate.deletecandidate;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;

public class DeleteCandidateModel {
    private DeleteCandidateView deleteCandidateView;

    DeleteCandidateModel(DeleteCandidateView deleteCandidateView) {
        this.deleteCandidateView = deleteCandidateView;
    }

    public void deleteCandidate(int candidateId) {
        boolean deleted = InterviewDatabase.getInstance().deleteCandidate(candidateId);
        if (deleted) {
            deleteCandidateView.onSuccess();
        } else {
            deleteCandidateView.onFail();
        }
    }
}

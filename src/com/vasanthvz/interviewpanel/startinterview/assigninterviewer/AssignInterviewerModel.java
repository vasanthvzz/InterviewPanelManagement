package com.vasanthvz.interviewpanel.startinterview.assigninterviewer;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;
import com.vasanthvz.interviewpanel.model.Candidate;
import com.vasanthvz.interviewpanel.model.Interviewer;

public class AssignInterviewerModel {
    private AssignInterviewerView assignInterviewerView;

    AssignInterviewerModel(AssignInterviewerView assignInterviewerView) {
        this.assignInterviewerView = assignInterviewerView;
    }

    public void assignInterviewer(int interviewerId, int candidateId) {
        InterviewDatabase currentDb = InterviewDatabase.getInstance();
        if (!currentDb.isInterviewerPresent(interviewerId) || !currentDb.isCandidatePresent(candidateId)) {
            assignInterviewerView.onFailAssign();
        } else {
            Interviewer interviewer = currentDb.getInterviewer(interviewerId);
            Candidate candidate = currentDb.searchCandidate(candidateId);
            interviewer.addCandidate(candidate);
            candidate.setInterviewerId(interviewer.getId());
            AssignInterviewerView.onSuccessAssign(candidate.getName(), interviewer.getName());
        }

    }
}

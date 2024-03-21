package com.vasanthvz.interviewpanel.startinterview.currentstatus;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;
import com.vasanthvz.interviewpanel.model.Candidate;
import com.vasanthvz.interviewpanel.model.Interview;

import java.util.List;

public class CurrentStatusModel {
    private CurrentStatusView currentStatusView;

    public CurrentStatusModel(CurrentStatusView currentStatusView) {
        this.currentStatusView = currentStatusView;
    }

    public void getCurrentInfo() {
        InterviewDatabase currentDb = InterviewDatabase.getInstance();
        Interview interview = currentDb.getInterview();
        List<Candidate> candidateList = currentDb.getTopCandidate(interview.getCandidateForOneCycle());
        getCandidates(candidateList);
    }

    public void getCandidates(List<Candidate> candidateList) {
        InterviewDatabase currentDb = InterviewDatabase.getInstance();
        for (Candidate candidate : candidateList) {
            if (candidate.getInterviewerId() == 0) {
                currentStatusView.onFail(candidate.getId());
            }
            currentStatusView.showCandidates(candidate.getName(),
                    currentDb.getInterviewer(candidate.getInterviewerId()).getName());
        }
    }
}

package com.vasanthvz.interviewpanel.createinterview;

import com.vasanthvz.interviewpanel.datalayer.InterviewDatabase;
import com.vasanthvz.interviewpanel.model.Interview;

public class CreateInterviewModel {
    private CreateInterviewView createInterviewView;

    CreateInterviewModel(CreateInterviewView createMeetingView) {
        this.createInterviewView = createMeetingView;
    }

    void createNewMeeting(String name, int candidateCount, int candidateForOneCycle) {
        Interview interview = new Interview();
        interview.setName(name);
        interview.setTotalCandidateCount(candidateCount);
        interview.setCandidateForOneCycle(candidateForOneCycle);
        InterviewDatabase.getInstance().addInterview(interview);
        createInterviewView.onSuccessCreation();
    }

}

package com.vasanthvz.interviewpanel.createmeeting;

import com.vasanthvz.interviewpanel.model.Interview;

public class CreateMeetingModel {
    private CreateMeetingView createMeetingView;

    CreateMeetingModel(CreateMeetingView createMeetingView) {
        this.createMeetingView = createMeetingView;
    }

    void createNewMeeting(String name, int candidateCount, int interviewerCount) {
        Interview interview = new Interview();
        interview.setName(name);
        interview.setTotalCandidateCount(candidateCount);
        interview.setInterviewerCount(interviewerCount);
        createMeetingView.onSuccessCreation();
    }

}

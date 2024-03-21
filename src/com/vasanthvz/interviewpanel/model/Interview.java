package com.vasanthvz.interviewpanel.model;

import java.util.List;

public class Meeting {
    private String name;
    private int totalCandidateCount;
    private int currentCandidateCount;
    private int interviewerCount;
    private List<Interviewer> interviewerList;
    private List<Candidate> candidateList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCandidateCount() {
        return totalCandidateCount;
    }

    public void setTotalCandidateCount(int totalCandidateCount) {
        this.totalCandidateCount = totalCandidateCount;
    }

    public int getInterviewerCount() {
        return interviewerCount;
    }

    public void setInterviewerCount(int interviewerCount) {
        this.interviewerCount = interviewerCount;
    }


    public int getCurrentCandidateCount() {
        return currentCandidateCount;
    }

    public void setCurrentCandidateCount(int currentCandidateCount) {
        this.currentCandidateCount = currentCandidateCount;
    }

}

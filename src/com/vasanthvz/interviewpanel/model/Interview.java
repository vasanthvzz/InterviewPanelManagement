package com.vasanthvz.interviewpanel.model;

import java.util.List;

public class Interview {
    private String name;
    private int totalCandidateCount;
    private int candidateForOneCycle;
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

    public int getCandidateForOneCycle() {
        return candidateForOneCycle;
    }

    public void setCandidateForOneCycle(int candidateForOneCycle) {
        this.candidateForOneCycle = candidateForOneCycle;
    }

}

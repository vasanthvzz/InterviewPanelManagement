package com.vasanthvz.interviewpanel.model;

import java.util.ArrayList;
import java.util.List;

public class Interviewer {
    private String name;

    private int id;


    private List<Candidate> candidates = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void addCandidate(Candidate candidate) {
        this.candidates.add(candidate);
    }
}

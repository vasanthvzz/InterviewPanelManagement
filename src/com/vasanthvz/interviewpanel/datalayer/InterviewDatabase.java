package com.vasanthvz.interviewpanel.datalayer;

import com.vasanthvz.interviewpanel.model.Candidate;
import com.vasanthvz.interviewpanel.model.Interview;
import com.vasanthvz.interviewpanel.model.Interviewer;

import java.util.*;

public class InterviewDatabase {
    public static InterviewDatabase interviewDatabase;
    private Interview interview;
    List<Candidate> candidateList;
    List<Interviewer> interviewerList;
    HashSet<Integer> positionCounter;

    public static InterviewDatabase getInstance() {
        if (interviewDatabase == null) {
            interviewDatabase = new InterviewDatabase();
        }
        return interviewDatabase;
    }

    public Interview getInterview() {
        return interview;
    }

    public List<Candidate> getCandidateList() {
        return candidateList;
    }

    public List<Interviewer> getInterviewerList() {
        return interviewerList;
    }

    public boolean isCandidatePresent(int id) {
        for (Interviewer interviewer : interviewerList) {
            if (interviewer.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void initialiseCounter(int count) {
        positionCounter = new HashSet<>();
        for (int i = 1; i <= count; i++) {
            this.positionCounter.add(i);
        }
    }

    public int getCandidateNumber() {
        int num = Collections.min(positionCounter);
        positionCounter.remove(num);
        return num;
    }

    public boolean isCandidateNumberAvailable(int candidateNumber) {
        return positionCounter.contains(candidateNumber);
    }

    public void getAvailableSlot() {
        System.out.println(positionCounter);
    }

    public void viewAllCandidate() {
        System.out.println("Name        CandidateNumber          ");
        for (Candidate candidate : candidateList) {
            System.out.println(candidate.getName() + "   " + candidate.getCandidateNumber() + "  " + candidate.getId());
        }
    }

    public List<Candidate> getTopCandidate(int count) {
        candidateList.sort(Comparator.comparingInt(Candidate::getCandidateNumber));
        List<Candidate> result = new ArrayList<>();
        for (Candidate candidate : candidateList) {
            result.add(candidate);
            count--;
            if (count == 0) {
                break;
            }
        }
        return result;
    }

    public boolean addCandidate(String name, int id, int candidateNumber) {
        if (isCandidatePresent(id)) {
            System.out.println("Candidate id not present");
            return false;
        }
        if (!(candidateNumber == 0) && !isCandidateNumberAvailable(candidateNumber)) {
            System.out.println("Candidate slot is not available");
            return false;
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setId(id);
            if (candidateNumber == 0) candidate.setCandidateNumber(getCandidateNumber());
            else {
                candidate.setCandidateNumber(candidateNumber);
                positionCounter.remove(candidateNumber);
            }
            candidateList.add(candidate);
            return true;
        }
    }


    public Candidate searchCandidate(int id) {
        if (!isCandidatePresent(id)) return null;
        else {
            for (Candidate candidate : candidateList) {
                if (candidate.getId() == id) {
                    return candidate;
                }
            }
        }
        return null;
    }

    public boolean deleteCandidate(int id) {
        return candidateList.remove(searchCandidate(id));
    }

    public boolean isInterviewCreated() {
        return interview != null;
    }

    public void addInterview(Interview interview) {
        this.interview = interview;
        this.candidateList = new ArrayList<>(interview.getTotalCandidateCount());
        this.interviewerList = new ArrayList<>();
        initialiseCounter(interview.getTotalCandidateCount());
    }

    public boolean addInterviewer(String name, int id) {
        if (isInterviewerPresent(id)) {
            System.out.println("Interviewer id present");
            return false;
        }
        Interviewer interviewer = new Interviewer();
        interviewer.setName(name);
        interviewer.setId(id);
        interviewerList.add(interviewer);
        return true;
    }

    public boolean isInterviewerPresent(int id) {
        for (Interviewer interviewer : getInterviewerList()) {
            if (interviewer.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void viewAllInterviewer() {
        System.out.println("Name        ID");
        for (Interviewer interviewer : interviewerList) {
            System.out.println(interviewer.getName() + "   " + interviewer.getId() + "  ");
        }

    }

    public Interviewer getInterviewer(int id) {
        for (Interviewer interviewer : interviewerList) {
            if (interviewer.getId() == id) {
                return interviewer;
            }
        }
        return null;
    }
}

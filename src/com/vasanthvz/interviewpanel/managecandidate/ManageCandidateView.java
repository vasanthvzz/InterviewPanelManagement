package com.vasanthvz.interviewpanel.managecandidate;

import com.vasanthvz.interviewpanel.mainmenu.MainMenuView;
import com.vasanthvz.interviewpanel.managecandidate.addcandidate.AddCandidateView;
import com.vasanthvz.interviewpanel.managecandidate.deletecandidate.DeleteCandidateView;
import com.vasanthvz.interviewpanel.managecandidate.findcandidate.FindCandidateView;
import com.vasanthvz.interviewpanel.managecandidate.viewcandidate.ViewCandidateView;

import java.util.Scanner;

public class ManageCandidateView {
    private ManageCandidateModel manageCandidateModel;

    public ManageCandidateView() {
        manageCandidateModel = new ManageCandidateModel(this);
    }

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add candidate");
        System.out.println("2.Find candidate");
        System.out.println("3.View all  candidate");
        System.out.println("4.Delete candidate");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        manageCandidateModel.redirectOption(choice);
        goBack();
    }

    private void goBack() {
        new MainMenuView().init();
    }

    void showAlert(String alert) {
        System.out.println(alert);
    }

    void addingCandidate() {
        System.out.println("-----------Adding candidate-----------");
        new AddCandidateView().init();
    }

    void deleteCandidate() {
        new DeleteCandidateView().init();
    }

    public void viewAllCandidate() {
        new ViewCandidateView().init();
    }

    public void findCandidate() {
        new FindCandidateView().init();
    }
}

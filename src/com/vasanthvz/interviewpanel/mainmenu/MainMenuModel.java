package com.vasanthvz.interviewpanel.mainmenu;

public class MainMenuModel {
    private MainMenuView mainMenuView;

    public MainMenuModel(MainMenuView mainMenuView) {
        this.mainMenuView = mainMenuView;
    }

    public void redirectChoice(String choice) {
        switch (choice) {
            case "1": {
                mainMenuView.goManageCandidate();
                break;
            }
            case "2": {
                mainMenuView.goManageInterviewer();
                break;
            }
            case "3": {
                mainMenuView.goStartInterview();
                break;
            }
            case "0": {
                mainMenuView.showAlert("Exiting.......");
                break;
            }

            default:
                mainMenuView.showAlert("Please set a proper option");
                mainMenuView.init();
                break;
        }
    }
}

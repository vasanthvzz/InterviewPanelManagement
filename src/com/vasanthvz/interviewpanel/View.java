package com.vasanthvz.interviewpanel;

import java.util.Scanner;

public class View {
    public void showAlert(String s) {
        System.out.println("ALERT : " + s);
    }

    public void showText(String text) {
        System.out.println(text);
    }

    public void showTitle(String s) {
        System.out.println("\t \t ----" + s + "---");
    }

    public Scanner sc = new Scanner(System.in);
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class TheAdmissoinsCommitee implements Observable{
    private List<Observer> applicant = new ArrayList<>();

    @Override
    public void addApplicant(Observer observer) {
        applicant.add(observer);
    }

    @Override
    public void removeApplicant(Observer observer) {
        applicant.remove(observer);
    }

    @Override
    public void notifyApplicant() {
        System.out.println("There is new Notification");

        for (Observer observer: applicant) {
          observer.update("Verification");
        }
    }
}

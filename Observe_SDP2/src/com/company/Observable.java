package com.company;

public interface Observable {

    public void addApplicant(Observer observer);
    public void removeApplicant(Observer observer);
    public void notifyApplicant();
}

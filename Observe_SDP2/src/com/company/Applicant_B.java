package com.company;

public class Applicant_B implements Observer{


    @Override
    public void update(String message) {
        System.out.println("Applicant B is about to Enroll");
    }
}

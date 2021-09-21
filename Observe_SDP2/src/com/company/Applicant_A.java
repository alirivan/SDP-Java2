package com.company;

public class Applicant_A implements Observer{


    @Override
    public void update(String message) {
        processMessage(message);
    }

    private void processMessage(String message) {
        System.out.println("Applicant A is ready to Enroll");
    }
}

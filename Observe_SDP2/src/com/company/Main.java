package com.company;

public class Main {
    public static void main(String[] args) {
        Observable theAdmissonsComitee = new TheAdmissoinsCommitee();
        Observer applicant1 = new Applicant_A();
        Observer applicant2 = new Applicant_B();
        Observer applicant3 = new Applicant_A();

        theAdmissonsComitee.addApplicant(applicant1);
        theAdmissonsComitee.addApplicant(applicant2);

        theAdmissonsComitee.notifyApplicant();

        theAdmissonsComitee.removeApplicant(applicant2);

        theAdmissonsComitee.addApplicant(applicant3);

        theAdmissonsComitee.notifyApplicant();
    }
}

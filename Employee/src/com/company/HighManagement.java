package com.company;

public class HighManagement implements Observer {

    private Employee emp;

    public HighManagement (Employee employee){

        this.emp = employee;
        this.emp.addObserver(this);
    }

    @Override
    public void sendMessage() {
        System.out.println( "High Management is informed about the new salary ("+ emp.getSalary()+ ") of " + emp.getName() + "老师" );
    }
}

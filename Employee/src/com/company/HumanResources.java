package com.company;

public class HumanResources implements Observer {

    private Employee emp;

    public HumanResources(Employee employee){

        this.emp = employee;
        this.emp.addObserver(this);
    }

    @Override
    public void sendMessage() {
        System.out.println( "Human Resources are informed about the new salary ("+ emp.getSalary()+ ") of " + emp.getName() + "老师");
    }
}

package com.company.Howell;

/**
 * Created by 026654 on 2/25/2020.
 */
public class BusinessContacts extends Person{
    String number;

    public BusinessContacts() {
    }

    public BusinessContacts(String name, String eMail, String number) {
        super(name, eMail);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" their phone number is " +number);
    }
}

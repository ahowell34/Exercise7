package com.company.Howell;

/**
 * Created by 026654 on 2/25/2020.
 */
public class Person {
    String name;
    String eMail;


    public Person() {
    }

    public Person(String name, String eMail) {
        this.name = name;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void display(){
        System.out.println("This contacts name is "+name+" their e-mail address is "+eMail);
    }
}

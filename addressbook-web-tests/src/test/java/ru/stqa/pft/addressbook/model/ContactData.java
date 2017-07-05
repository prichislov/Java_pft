package ru.stqa.pft.addressbook.model;

/**
 * Created by Roman on 26.06.2017.
 */
public class ContactData {

    private String firstName;
    private String lastName;
    private String company;
    private String telephoneHome;
    private String telephoneWork;
    private String group;

    public ContactData(){}

    public ContactData(String firstName, String lastName, String telephoneHome, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneHome = telephoneHome;
        this.group = group;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTelephoneHome() {
        return telephoneHome;
    }

    public void setTelephoneHome(String telephoneHome) {
        this.telephoneHome = telephoneHome;
    }

    public String getTelephoneWork() {
        return telephoneWork;
    }

    public void setTelephoneWork(String telephoneWork) {
        this.telephoneWork = telephoneWork;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

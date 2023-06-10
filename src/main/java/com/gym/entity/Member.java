package com.gym.entity;

public class Member implements SuperEntity{
    private int ID;
    private String FullName;
    private String Address;
    private String Age;
    private String Membership;
    private String NIC;
    private String Contact;
    private String JoinedDate;

    @Override
    public String toString() {
        return "Member{" +
                "ID=" + ID +
                ", FullName='" + FullName + '\'' +
                ", Address='" + Address + '\'' +
                ", Age='" + Age + '\'' +
                ", Membership='" + Membership + '\'' +
                ", NIC='" + NIC + '\'' +
                ", Contact='" + Contact + '\'' +
                ", JoinedDate='" + JoinedDate + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getMembership() {
        return Membership;
    }

    public void setMembership(String membership) {
        Membership = membership;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getJoinedDate() {
        return JoinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        JoinedDate = joinedDate;
    }

    public Member(int ID, String fullName, String address, String age, String membership, String NIC, String contact, String joinedDate) {
        this.ID = ID;
        FullName = fullName;
        Address = address;
        Age = age;
        Membership = membership;
        this.NIC = NIC;
        Contact = contact;
        JoinedDate = joinedDate;
    }

    public Member() {
    }
}

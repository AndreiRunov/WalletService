package Models;

import Constants.Role;
import Constants.Status;


import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private Role role;

    public void setStatus(Status status) {
        this.status = status;
    }

    private Status status;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private long balance;
    private List<Transaction> debetList;
    private List<Transaction> creditList;

    @Override
    public String toString(){
        return ("UserID: " + this.id +
                "; Role: " + this.role +
                "; Last Name: " +  this.lastName +
                "; First Name: " + this.firstName +
                "; Balance: " + this.balance);
    }

    public UUID getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public Status getStatus() {
        return status;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getBalance() {
        return balance;
    }

    public List<Transaction> getDebetList() {
        return debetList;
    }

    public List<Transaction> getCreditList() {
        return creditList;
    }

//    private User(Builder builder) {
//        id = builder.id;
//        role = builder.role;
//        status = builder.status;
//        firstName = builder.firstName;
//    };
//
//    public static class Builder{
//        private UUID id;
//        private Role role;
//        private Status status;
//        private String firstName;
//        private String sirName;
//        private long balance;
//        private List<Transaction> debetList;
//        private List<Transaction> creditList;
//        public Builder build(){
//            return this;
//        }
//    };

}

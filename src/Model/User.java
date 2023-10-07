package Model;

import Constants.Role;
import Constants.Status;


import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private Role role;
    private Status status;
    private String firstName;
    private String sirName;
    private long balance;
    private List<Transaction> debetList;
    private List<Transaction> creditList;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
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

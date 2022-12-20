package com.example.project_pharmacy;

public class SignedIn {
    String newUsername;
    String newPassword;

    public SignedIn(String newUsername, String newPassword) {
        this.newUsername = newUsername;
        this.newPassword = newPassword;
    }

    public String getNewUsername() {
        return newUsername;
    }

    public void setNewUsername(String newUsername) {
        this.newUsername = newUsername;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public String toString() {
        return "SignedIn{" +
                "newUsername='" + newUsername + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }
}
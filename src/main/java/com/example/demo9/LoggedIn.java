package com.example.demo9;

public class LoggedIn {
    public static String[] userName={"ezza","laiba","marleen","saba"};
    public static String[] passWord={"1234","1234","1234","1234"};

    public LoggedIn(String[] userName,String[] passWord) {
        this.userName=userName;
        this.passWord=passWord;
    }

    public static String[] getUserName() {
        return userName;
    }

    public static void setUserName(String[] userName) {
        LoggedIn.userName = userName;
    }

    public static String[] getPassWord() {
        return passWord;
    }

    public static void setPassWord(String[] passWord) {
        LoggedIn.passWord = passWord;
    }
}
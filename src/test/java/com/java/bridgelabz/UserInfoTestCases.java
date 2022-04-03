package com.java.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserInfoTestCases {
    UserInfo userInfo = new UserInfo();
    @Test
    public void whenFirstName_ShouldProper_ShouldReturnTrue() {
        boolean result = userInfo.userFirstName("Rohit");
        Assert.assertTrue(result);
    }

    @Test
    public void whenFirstName_ShouldProper_ShouldReturnFalse() {
        boolean result = userInfo.userFirstName("rohit");
        Assert.assertFalse(result);
    }

    @Test
    public void whenLastName_ShouldProper_ShouldReturnTrue() {
        boolean result = userInfo.userLastName("Bansod");
        Assert.assertTrue(result);
    }

    @Test
    public void  whenLastName_ShouldProper_ShouldReturnFalse() {
        boolean result = userInfo.userLastName("Bansod");
        Assert.assertFalse(result);
    }

    @Test
    public void whenEmailId_ShouldProper_ShouldReturnTrue() {
        boolean result = userInfo.userEmailId("rohitb333@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void whenEmailId_ShouldProper_ShouldReturnFalse() {
        boolean result = userInfo.userEmailId("Rohib333gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void whenPhoneNo_ShouldProper_ShouldReturnTrue() {
        boolean result = userInfo.userPhoneNumber("8329522845");
        Assert.assertTrue(result);
    }

    @Test
    public void whenPhoneNo_ShouldProper_ShouldReturnFalse() {
        boolean result = userInfo.userPhoneNumber("8329522@12");
        Assert.assertFalse(result);
    }

    @Test
    public void whenPassWord_ShouldProper_ShouldReturnTrue() {
        boolean result = userInfo.userPassword("Pass@123");
        Assert.assertTrue(result);
    }

    @Test
    public void whenPassWord_ShouldProper_ShouldReturnFalse() {
        boolean result = userInfo.userPassword("Pass123");
        Assert.assertFalse(result);
    }
}

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


}

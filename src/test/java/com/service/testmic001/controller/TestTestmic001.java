package com.service.testmic001.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestmic001 {

        Testmic001Delegate testmic001Delegate = new Testmic001Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testmic001Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
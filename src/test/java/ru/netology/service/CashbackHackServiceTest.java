package ru.netology.service;

//import org.testng.annotations.Test;

import static junit.framework.TestCase.assertEquals;
//import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();
    @org.junit.Test
    public void testRemain() {

        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testBoundary() {

        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}
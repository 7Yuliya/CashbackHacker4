package ru.netology.service;

//import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import org.testng.annotations.Test;

//import static org.testng.AssertJUnit.assertEquals;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calculateCashback() {


        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void calculateCashback800() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }
    @Test
    public void calculateCashback1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}

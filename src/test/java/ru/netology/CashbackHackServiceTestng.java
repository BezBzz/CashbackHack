package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTestng {

    @Test
    public void testRemain() {
        int amount =1000;
        int expected =1;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
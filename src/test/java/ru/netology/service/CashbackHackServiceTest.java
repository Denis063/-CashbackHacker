package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {


    @Test
    public void shouldGetRemainIfZero() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        Assert.assertEquals(actual, 1000);
    }

    @Test
    public void shouldGetRemainIfLessOneBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(950);
        Assert.assertEquals(actual, 50);
    }

    @Test
    public void shouldGetRemainIfMoreOneBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1700);
        Assert.assertEquals(actual, 300);
    }

    @Test
    public void shouldGetRemainIf1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(actual, 0);
    }
}
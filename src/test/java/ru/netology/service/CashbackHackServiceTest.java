package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

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
        int actual = service.remain(1400);
        Assert.assertEquals(actual, 600);
    }

    @Test
    public void shouldGetRemainIfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void shouldGetRemainIfHugeAmount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(15500);
        Assert.assertEquals(actual, 500);
    }

    @Test
    public void shouldGetRemainIf1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(actual, 0);
    }
}
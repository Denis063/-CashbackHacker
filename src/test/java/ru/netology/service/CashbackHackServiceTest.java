package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {


    @Test
    public void shouldGetRemainIfZero() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        Assert.assertEquals(1000, actual);
    }

    @Test
    public void shouldGetRemainIfLessOneBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(950);
        Assert.assertEquals(50, actual);
    }

    @Test
    public void shouldGetRemainIfMoreOneBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1700);
        Assert.assertEquals(300, actual);;
    }

    @Test
    public void shouldGetRemainIf1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(0, actual);
    }
}
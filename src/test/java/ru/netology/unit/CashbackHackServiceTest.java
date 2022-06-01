package ru.netology.service;

import org.junit.Test;
import ru.netology.unit.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfAmountTrue() {
        int amount = 4800;
        assertEquals(service.remain(amount),200);
    }

    @Test
    public void shouldCalculateIfAmountFalse() {
        int amount = 1000;
        assertEquals(service.remain(amount),0);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        assertEquals(service.remain(amount),1000);
    }
}
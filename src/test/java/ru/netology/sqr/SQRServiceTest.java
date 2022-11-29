package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void testСountingSquares() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.countingSquares(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testСountingSquaresUnderLimit() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.countingSquares(50, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testСountingSquaresOverLimit() {
        SQRService service = new SQRService();

        int expected = 9;
        int actual = service.countingSquares(400, 800);

        Assertions.assertEquals(expected, actual);
    }
}

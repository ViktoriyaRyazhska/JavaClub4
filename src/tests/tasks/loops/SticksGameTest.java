package tests.tasks.loops;

import application.tasks.loops.SticksGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SticksGameTest {
    SticksGame sticksGame =  new SticksGame();

    @Test
    void sticksGameTest() {
        assertEquals(18,sticksGame.getSticksLeft(sticksGame,3));
    }
}
package JUnitTests.Basics.BeginnerSeries2Clock;

import Tasks.Basics.BeginnerSeries2Clock.BeginnerSeries2ClockImpl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerSeries2ClockImplTest {

    @Test
    @DisplayName("Should check If hours >= 0 && hours <= 12, then hours = input hours")
    public void Should_CheckHoursSetter_If() {
        final int hours = 5;
        final BeginnerSeries2ClockImpl beginnerSeries2Clock = new BeginnerSeries2ClockImpl(hours, 17, 30);
        assertEquals(hours, beginnerSeries2Clock.getHours());
    }

    @Test
    @DisplayName("Should check If !(hours >= 0 && hours <= 12), then hours != input hours, but = [0-12]")
    void Should_CheckHoursSetter_Else() {
        final int hours = -5;
        final BeginnerSeries2ClockImpl beginnerSeries2Clock = new BeginnerSeries2ClockImpl(hours, 34, 55);
        assertNotEquals(hours, beginnerSeries2Clock.getHours());
        assertTrue(beginnerSeries2Clock.getHours() >= 0 && beginnerSeries2Clock.getHours() <= 12);
    }

    @Test
    @DisplayName("Should check If hours == 12, then minutes = 0")
    void Should_CheckMinutesSetter_Else() {
        final BeginnerSeries2ClockImpl beginnerSeries2Clock = new BeginnerSeries2ClockImpl(12, 33, 22);
        assertEquals(0, beginnerSeries2Clock.getSeconds());
    }

    @Test
    @DisplayName("Should check If hours != 12, then minutes = minutes")
    void Should_CheckMinutesSetter_If_HoursNot_12_If() {
        final int minutes = 32;
        final BeginnerSeries2ClockImpl beginnerSeries2Clock = new BeginnerSeries2ClockImpl(9, minutes, 0);
        assertEquals(minutes, beginnerSeries2Clock.getMinutes());
    }

    @Test
    @DisplayName("Should check If hours != 12, then minutes != input minutes, but = [0-59]")
    void Should_CheckMinutesSetter_If_HoursNot_12_Else() {
        final int minutes = -3;
        final BeginnerSeries2ClockImpl beginnerSeries2Clock = new BeginnerSeries2ClockImpl(6, minutes, 0);
        assertNotEquals(minutes, beginnerSeries2Clock.getMinutes());
        assertTrue(beginnerSeries2Clock.getMinutes() >= 0 && beginnerSeries2Clock.getMinutes() <= 59);
    }

    @Test
    @DisplayName("Should check If hours == 12, then seconds = 0")
    void Should_CheckSecondsSetter_Else() {
        final BeginnerSeries2ClockImpl beginnerSeries2Clock = new BeginnerSeries2ClockImpl(12, 33, 22);
        assertEquals(0, beginnerSeries2Clock.getSeconds());
    }

    @Test
    @DisplayName("Should check If hours != 12, then seconds = seconds")
    void shouldCheckSecondsSetter_If_Hours_Not_12_If() {
        final int seconds = 32;
        final BeginnerSeries2ClockImpl beginnerSeries2Clock = new BeginnerSeries2ClockImpl(9, 0, seconds);
        assertEquals(seconds, beginnerSeries2Clock.getSeconds());
    }

    @Test
    @DisplayName("Should check If hours != 12, then seconds != input seconds, but = [0-59]")
    void Should_CheckSecondsSetter_If_HoursNot_12_Else() {
        final int seconds = -3;
        final BeginnerSeries2ClockImpl beginnerSeries2Clock = new BeginnerSeries2ClockImpl(6, 0, seconds);
        assertNotEquals(seconds, beginnerSeries2Clock.getSeconds());
        assertTrue(beginnerSeries2Clock.getSeconds() >= 0 && beginnerSeries2Clock.getSeconds() <= 59);
    }

    @Test
    @DisplayName("Should check If method return correct time")
    void Should_CheckPassedTime() {
        final BeginnerSeries2ClockImpl beginnerSeries2Clock = new BeginnerSeries2ClockImpl(10, 25, 27);
        assertEquals(361527000, beginnerSeries2Clock.passedTime());
    }
}
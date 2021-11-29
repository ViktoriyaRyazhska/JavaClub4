package test_conditions;


import conditions.Conditions_task_5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.runners.JUnit4;

public class Test_Conditions_Task_5 {

    Conditions_task_5 age = new Conditions_task_5();

    @Test
    public void testAge() {

        assertEquals("You are 4 years old.", age.CalculateAge(2012, 2016));
        assertEquals("You are 27 years old.", age.CalculateAge(1989, 2016));
        assertEquals("You are 90 years old.", age.CalculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", age.CalculateAge(2000, 1990));
        assertEquals("You were born this very year!", age.CalculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", age.CalculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", age.CalculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", age.CalculateAge(2010, 1500));
        assertEquals("You are 1 year old.", age.CalculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", age.CalculateAge(2000, 1999));
        assertNotEquals("You will be born in 2 year.", age.CalculateAge(2000, 1999));
        assertNotEquals("You will be born in 87 years.", age.CalculateAge(3400, 3400));

    }
}
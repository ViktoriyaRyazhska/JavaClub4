package com.company1;
import java.util.*;
public class FilteringEvenNumbersBugFixes {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = 0; i < listOfNumbers.size(); i++)
        {
            if (listOfNumbers.get(i)%2 == 0)
            {
                listOfNumbers.remove(i);
                i--;
            }
        }
        return listOfNumbers;
    }
}

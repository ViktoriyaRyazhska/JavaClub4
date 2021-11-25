package Collections.Filtering;

import java.util.List;

/**
 * You are trying to put a hash in ruby or an object in javascript or java into an array,
 * but it always returns error, solve it and keep it as simple as possible!
 */
public class FilteringEvenimpl {
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

package Conditions;

public class TransportationVacation{
        public static int rentalCarCost(int d) {
            return d < 3 ?  d*40 :
                    d >=3 && d <7 ?  (d*40)-20 :
                            d >= 7 ?  (d*40) - 50 :  0;
        }
}

//  1. გვაქვს მთელი რიცხვების ჩამონათვალი სადაც  ერთის გარდა ყველა რიცხვი  მეორდება, იპოვეთ ის რიცხვი რომელიც არ მეორდება.
//  int singleNumber(int[] numbs)

public class singleNumber {

    public static void main (String[] args) {
        System.out.printf(String.valueOf(singleNumbers(new int[]{44, 44, 55})));
    }

    public static int singleNumbers(int[] numbs) {
        int result = 0;
        for (int i = 0; i < numbs.length; i++) {
            result ^= numbs[i];
        }
        return result;
    }
}

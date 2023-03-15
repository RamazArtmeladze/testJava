//  2. გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა (თეთრებში)
//  და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.
//  Int minSplit(Int amount);
public class minSplit {

    public static void main (String[] args) {
        System.out.printf(String.valueOf(minSplits(150)));
    }

    public static int minSplits(int amount) {
        int[] coins = {50, 20, 10, 5, 1}; // coins in descending order
        int numCoins = 0;
        int i = 0;
        while (amount > 0) {
            if (amount >= coins[i]) {
                amount -= coins[i];
                numCoins++;
            } else {
                i++;
            }
        }
        return numCoins;
    }
}

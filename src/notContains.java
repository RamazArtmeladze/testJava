import java.util.HashSet;

//  3. მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია რომელსაც გადაეცემა ეს მასივი
//  და აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში არ შედის.
//  Int notContains(Int[] array);

public class notContains {

    public static void main (String[] args) {
        System.out.printf(String.valueOf(notContain(new int[]{1, 44, 44, 55})));
    }
    public static int notContain(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        int num = 1;
        while (set.contains(num)) {
            num++;
        }
        return num;
    }
}

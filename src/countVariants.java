//  5. გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით.
//  დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
//  Int countVariants(Int stearsCount);
public class countVariants {

    public static void main (String[] args) {
        System.out.printf(String.valueOf(countVariant(6)));
}
    public static int countVariant(int stairsCount) {
        if (stairsCount <= 1) {
            return 1;
        }
        int[] count = new int[stairsCount + 1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i <= stairsCount; i++) {
            count[i] = count[i-1] + count[i-2];
        }
        return count[stairsCount];
    }
}

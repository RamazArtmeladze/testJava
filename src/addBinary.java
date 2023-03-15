//  4.მოცემულია ორი binary string a და b, დააბრუნეთ მათი ჯამი, როგორც binary string.
//  მაგ: a = "1010" b = "1011" , მათი ჯამი იქნება "10101"

public class addBinary {
    public static void main (String[] args) {
        System.out.printf(Binary("1010","1011"));
    }

    public static String Binary(String a, String b) {
        // პირველი ეტაპი
        int a_int = Integer.parseInt(a, 2);
        int b_int = Integer.parseInt(b, 2);
        // მეორე ეტაპი
        int sum_int = a_int + b_int;
        // მესამე ეტაპი
        String sum_bin = Integer.toBinaryString(sum_int);
        // მეოთხე ეტაპი
        return sum_bin;
    }

}

public class FizzBuzz {
    private static char[] fizz = {0b1000110, 0b1110101, 0b1100011, 0b1101011};
    private static char[] buzz = {0b1010100, 0b1101000, 0b1101001, 0b1110011};

    public static void main(String[] args) {
        int limit = 100;
        for (int i = 0; i < limit; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }

    static String getFizzBuzz(int n){
        String out = "";
        int test1 = 3;
        int test2 = 5;

        if(n % test1 == 0) out += new String(fizz);
        if(n % test2 == 0) out += new String(buzz);

        if(out.isEmpty()) out = "" + n;

        return out;
    }
}
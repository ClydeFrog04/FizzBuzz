using System;

namespace FizzBuzz {
    class Program {
        static int[] fizz = { 0b1000110, 0b1110101, 0b1100011, 0b1101011 };
        static int[] buzz = { 0b1010100, 0b1101000, 0b1101001, 0b1110011 };
        static void Main(string[] args) {
            int limit = 100;

            for(int i = 0; i < limit; i++) {
                Console.WriteLine(getFizzBuzz(i + 1));
            }
        }


        static String charArrToString(int[] input) {
            String output = "";
            for(int i = 0; i < input.Length; i++) {
                output += (char)input[i];
            }
            return output;
        }

        static String getFizzBuzz(int n) {
            String output = "";
            int test1 = 3;
            int test2 = 5;

            if (n % test1 == 0) output += charArrToString(fizz);
            if (n % test2 == 0) output += charArrToString(buzz);

            if (output.Length == 0) output = "" + n;

            return output;
        }
    }
}
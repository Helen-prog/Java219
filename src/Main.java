import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] a = new int[4];
//        double[] b = new double[4];
//        String st;
//        float f;
//        int in;
////        String st = "5.2";
////        float s = Float.parseFloat(st);
////        System.out.println(s);
//
//        int i = 0;
//        int j = 0;
//        do{
//            System.out.print("Введите число: ");
//            if (i != a.length && j != b.length){
//                st = input.nextLine();
//                try{
//                    f = Float.parseFloat(st);
//                    b[j] = f;
//                    System.out.println("b[j] = " + Arrays.toString(b));
//                    j++;
//                } catch (NumberFormatException e){
//                    System.out.println(e);
//                    try {
//                        in = Integer.parseInt(st);
//                        a[i] = in;
//                        System.out.println("a[i]" + Arrays.toString(a));
//                        i++;
//                    }
//                    catch (NumberFormatException ex){
//                        System.out.println(ex);
//                    }
//                }
//            }
//        }while (input.hasNextInt() || input.hasNextDouble());
//        while (i != a.length && j != b.length) {
//        System.out.print("Введите число: ");
//            if (i < a.length) {
//            do{
//
//                if (input.hasNextInt()) {
//                    a[i] = input.nextInt();
//                    System.out.println("a[i]" + Arrays.toString(a));
//                    i++;
//                }
////                }
////            input.nextLine();
////            while (input.hasNextDouble() && j < b.length){
//                if (input.hasNextDouble()) {
//                    b[j] = input.nextDouble();
//                    System.out.println("b[j] = " + Arrays.toString(b));
//                    j++;
//                }
////            }
////            input.nextLine();
////            } else if (j < b.length) {
//
//            //}
//        }while ((input.hasNextInt() || input.hasNextDouble()) && (i < a.length && j < b.length));
//        for (int c : a) {
//            System.out.print(c + " ");
//        }
//        System.out.println();
//        for (double c : b) {
//            System.out.print(c + " ");
//        }


//        int a;
//        double b;
////        input.nextLine();
//        System.out.print("Введите вещественное число: ");
//        b = input.nextDouble();
//        System.out.print("Введите целое число: ");
//        a = input.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);

//        String input = "";
//
////Creating a Scanner for keyboard
//        Scanner keyboard = new Scanner(System.in);
//
////...and for user's input
//        Scanner answer = new Scanner(input);
//
////Variable for validity check
//        boolean loanTerm_check = false;
//
//        double loanTerm = 0;
//
//        while (loanTerm_check != true) {
//            try {
//                System.out.print("\nВведите срок кредита в месяцах       : ");
//                input = keyboard.nextLine();
//                loanTerm = Double.parseDouble(input);
//
//                //Negative or null term exception
//                if (loanTerm <= 0) {
//                    System.out.println("Невозможно рассчитать выплаты на отрицательные, нулевые и дробные члены. " +
//                            "Нажмите Enter, чтобы повторить попытку.");
//                    keyboard.nextLine();
//                    input = "";
//                } else {
//                    loanTerm_check = true;
//                    input = "";
//                }
//            } catch (NumberFormatException e) {
//                if (answer.hasNextDouble()) {
//                    System.out.println("Невозможно рассчитать выплаты на отрицательные, нулевые и дробные члены. " +
//                            "Нажмите Enter, чтобы повторить попытку.");
//                } else {
//                    System.out.println("Вы не ввели действительный срок кредита. Вы вошли: " + input + ". " +
//                            "Нажмите Enter, чтобы повторить попытку.");
//                }
//                keyboard.nextLine();
//                input = "";
//                continue;
//            }
//        }


//        Scanner input = new Scanner(System.in);
//
//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, ch, count = 0, sum = 0;
//        do {
//            System.out.print("Введите число: ");
//            do {
//                ch = input.nextInt();
//                if (ch < 0) {
//                    System.out.println("Вы ввели отрицательное число.");
//                    System.out.print("Введите положительное число: ");
//                }
//            } while (ch < 0);
//            if (ch != 0 && ch < min) min = ch;
//            if (ch > max) max = ch;
//            sum += ch;
//            if (ch != 0) count++;
//        } while (ch != 0);
//        if (sum != 0) {
//            System.out.printf("Среднее арифметическое: %.2f%n", (double) sum / count);
//            System.out.println("Минимальное число: " + min);
//            System.out.println("Максимальное число: " + max);
//        } else {
//            System.out.println("Вы, вводили только отрицательные числа");
//        }

//        Scanner input = new Scanner(System.in);
//        String name, city;
//        int age;
//        System.out.print("What is your name? ");
//        name = input.next();
//        System.out.print("Hou old are you? ");
//        age = input.nextInt();
////        input.nextLine();
//        System.out.print("Where are you live? ");
//        city = input.next();
//        System.out.println("This is " + name);
//        System.out.println("It is " + age );
//        System.out.println("He lives in " + city );

//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите размер треугольника (целое положительно число: ");
//        if (input.hasNextInt()) {
//            int count = input.nextInt();
//            if (count <= 0) {
//                System.out.println("Ошибка ввода данных!");
//            } else {
//                int x = 0;
//                while (x < count) {
//                    System.out.print("*");
//                    int y = 1;
//                    while (y <= x) {
//                        if (y == x) {
//                            System.out.print("*");
//                            break;
//                        } else if (x == count - 1) {
//                            System.out.print("*");
//                        } else {
//                            System.out.print(" ");
//                        }
//                        y++;
//                    }
//                    x++;
//                    System.out.println();
//                }
//
//                input.close();
//            }
//        } else {
//            System.out.println("Ошибка ввода данных!");
//        }

//        int a = 60;	/* 60 = 0011 1100 */
//        int b = 13;	/* 13 = 0000 1101 */
//        int c = 0;
//
//        c = a & b;       /* 12 = 0000 1100 */
//        System.out.println("a & b = " + c );
//
//        c = a | b;       /* 61 = 0011 1101 */
//        System.out.println("a | b = " + c );
//
//        c = a ^ b;       /* 49 = 0011 0001 */
//        System.out.println("a ^ b = " + c );
//
//        c = ~a;          /*-61 = 1100 0011 */
//        System.out.println("~a = " + c );
//
//        c = a << 2;     /* 240 = 1111 0000 */
//        System.out.println("a << 2 = " + c );
//
//        c = a >> 2;     /* 215 = 1111 */
//        System.out.println("a >> 2  = " + c );
//
//        c = a >>> 2;     /* 215 = 0000 1111 */
//        System.out.println("a >>> 2 = " + c );

//        printBinaryString(1);
//        printBinaryString(1 << 2);  // Смещаем биты числа '1' влево на 2 позиции
//        printBinaryString(4 << 29); // Смещаем биты числа '4' влево на 29 позиций


        // Скопировать один массив в другой
//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length + 5];
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1[i];
//        }
//        for (int i = 0; i < a2.length; i++) {
//            System.out.println(a2[i]);
//        }

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Введите число: ");
//        int num = input.nextInt();  // 14
//        int count = 0;
//        while (num != 0) {
//            if ((num & 1) == 1) {
//                count++;
//            }
//            num = num >> 1;
//        }
//        System.out.println(count);

//        int x = 5, y = 7;
//        System.out.println("x = " + x + ", y = " + y);
//
//        y ^= (x ^= y);
//        x ^= y;
//        System.out.println("x = " + x + ", y = " + y);
//        byte[] str = encode("Съешь ещё этих мягких французских булок, да выпей чаю." , "хабра");
//        System.out.println(str);
//        String hex_s = "653cae8da8edb426052";
//
//        // Plain text variable
//        String plain = "";
//
//        // variable to store the XOR
//        // of previous digits
//        int x = 0;
//
//        int l = hex_s.length();
//
//        // Loop for loop from the end to
//        // the mid section of the string
//        for (int i = l - 1; i > (l / 2) - 1; i--)
//        {
//            // calculation of the plaintext digit
//            int y = x ^ Integer.parseInt(Character.toString(hex_s.charAt(i)), 16);
//
//            // calculation of XOR chain
//            x = x ^ y;
//            String z = Integer.toString(y, 16);
//            plain = z.charAt(z.length() - 1) + plain;
//        }
//
//        System.out.println(plain);
//        System.out.println("Hello");
        System.out.println("Вносим изменения");
    }

//    public static byte[] encode(String pText, String pKey) {
//        byte[] txt = pText.getBytes();
//        byte[] key = pKey.getBytes();
//        byte[] res = new byte[pText.length()];
//
//        for (int i = 0; i < txt.length; i++) {
//            res[i] = (byte) (txt[i] ^ key[i % key.length]);
//        }
//
//        return res;
//    }


//    public static final String reverseWithXOR(String string) {
//        char[] array = string.toCharArray();
//        int length = array.length;
//        int half = (int) Math.floor(array.length / 2);
//        for (int i = 0; i < half; i++) {
//            array[i] ^= array[length - i - 1];
//            array[length - i - 1] ^= array[i];
//            array[i] ^= array[length - i - 1];
//        }
//        return String.valueOf(array);
//    }


//    public static void printBinaryString(int hexNumber){
//        String bits = Integer.toBinaryString(hexNumber);
//        String allBits = "00000000000000000000000000000000"
//                .substring(0, 32 - bits.length()) + bits;
//
//        System.out.printf("%11d : %s\n", hexNumber, allBits);
//    }
}
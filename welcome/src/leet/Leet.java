import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leet {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the sentence that you would like to translate in l337:");
        String toL557 = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> l33t7 = new ArrayList<>();
        System.out.println(toL557.length());
        for (int i = 0; i < toL557.length(); i++) {
            switch (toL557.substring(i, i + 1)) {
                case " ":
                    System.out.println("A");
                    l33t7.add(" ");
                case "A":
                    l33t7.add("4");
                case "C":
                    l33t7.add("8");
                case "D":
                    l33t7.add("[)");
                case "E":
                    l33t7.add("3");
                case "F":
                    l33t7.add("/=");
                case "G":
                    l33t7.add("6");
                case "H":
                    l33t7.add("|-|");
                case "I":
                    l33t7.add("1");
                case "J":
                    l33t7.add("J_|");
                case "K":
                    l33t7.add("|<");
                case "L":
                    l33t7.add("|_");
                case "M":
                    l33t7.add("|v|");
                case "N":
                    l33t7.add("|\\||");
                case "O":
                    l33t7.add("0");
                case "P":
                    l33t7.add("|*");
                case "Q":
                    l33t7.add("()_");
                case "R":
                    l33t7.add("12");
                case "S":
                    l33t7.add("5");
                case "T":
                    l33t7.add("7");
                case "U":
                    l33t7.add("|_|");
                case "V":
                    l33t7.add("\\/");
                case "W":
                    l33t7.add("\\/\\/");
                case "X":
                    l33t7.add("><");
                case "Y":
                    l33t7.add("`/");
                case "Z":
                    l33t7.add("2 ");
            }
        }
        l33t7.forEach(System.out::print);
    }
}

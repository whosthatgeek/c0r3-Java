import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leet {


    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the sentence that you would like to translate in l337:");
        String toL557 = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> l33t7 = new ArrayList<>();

        for (int i = 0; i < toL557.length(); i++) {
            switch (toL557.substring(i, i + 1)) {
                case " ":
                    l33t7.add(" ");
                    break;
                case "A":
                    l33t7.add("4");
                    break;
                case "B":
                    l33t7.add("8");
                    break;
                case "C":
                    l33t7.add("(");
                    break;
                case "D":
                    l33t7.add("[)");
                    break;
                case "E":
                    l33t7.add("3");
                    break;
                case "F":
                    l33t7.add("/=");
                    break;
                case "G":
                    l33t7.add("6");
                    break;
                case "H":
                    l33t7.add("|-|");
                    break;
                case "I":
                    l33t7.add("1");
                    break;
                case "J":
                    l33t7.add("J_|");
                    break;
                case "K":
                    l33t7.add("|<");
                    break;
                case "L":
                    l33t7.add("|_");
                    break;
                case "M":
                    l33t7.add("|v|");
                    break;
                case "N":
                    l33t7.add("|\\||");
                    break;
                case "O":
                    l33t7.add("0");
                    break;
                case "P":
                    l33t7.add("|*");
                    break;
                case "Q":
                    l33t7.add("()_");
                    break;
                case "R":
                    l33t7.add("12");
                    break;
                case "S":
                    l33t7.add("5");
                    break;
                case "T":
                    l33t7.add("7");
                    break;
                case "U":
                    l33t7.add("|_|");
                    break;
                case "V":
                    l33t7.add("\\/");
                    break;
                case "W":
                    l33t7.add("\\/\\/");
                    break;
                case "X":
                    l33t7.add("><");
                    break;
                case "Y":
                    l33t7.add("`/");
                    break;
                case "Z":
                    l33t7.add("2 ");
                    break;
                default:
                    throw new IllegalAccessException(("You entered a character that is not supported yet"));
            }
        }
        l33t7.forEach(System.out::print);
    }
}

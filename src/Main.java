import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to translate to string:");
        int n = scanner.nextInt();
        String alert = "";
        int hundreds = n /100;
        int tens = n %100/10;
        int ones = n %10;

        if (n==0) alert="zero";

        if (hundreds >9 || hundreds<0){
            alert = "out of ability";
        }else {
            switch (hundreds){
                case 1:
                    alert += "one";
                    break;
                case 2:
                    alert += "Two";
                    break;
                case 3:
                    alert += "Three";
                    break;
                case 4:
                    alert += "Four";
                    break;
                case 5:
                    alert += "Five";
                    break;
                case 6:
                    alert += "Six";
                    break;
                case 7:
                    alert +="Seven";
                    break;
                case 8:
                    alert +="Eight";
                    break;
                case 9:
                    alert += "Nine";
                    break;
            }
            if (hundreds!=0) alert += "hundreds and";
            switch (tens) {
                case 1:
                    switch (ones) {
                        case 0:
                            alert += "ten";
                            break;
                        case 1:
                            alert += "eleven";
                            break;
                        case 2:
                            alert += "twelve";
                            break;
                        case 3:
                            alert += "thirteen";
                            break;
                        case 4:
                            alert += "fourteen";
                            break;
                        case 5:
                            alert += "fifteen";
                            break;
                        case 6:
                            alert += "sixteen";
                            break;
                        case 7:
                            alert += "seventeen";
                            break;
                        case 8:
                            alert += "eightteen";
                            break;
                        case 9:
                            alert += "nineteen";
                            break;
                    }
                    if (tens != 1) {
                        switch (ones) {
                            case 2:
                                alert += "twenty";
                                break;
                            case 3:
                                alert += "thirty";
                                break;
                            case 4:
                                alert += "forty";
                                break;
                            case 5:
                                alert += "fitty";
                                break;
                            case 6:
                                alert += "sixty";
                                break;
                            case 7:
                                alert += "seventy";
                                break;
                            case 8:
                                alert += "eight";
                            case 9:
                                alert += "ninety";
                                break;
                        }
                        switch (ones) {
                            case 1:
                                alert += "one";
                                break;
                            case 2:
                                alert += "two";
                                break;
                            case 3:
                                alert += "three";
                                break;
                            case 4:
                                alert += "four";
                                break;
                            case 5:
                                alert += "five";
                                break;
                            case 6:
                                alert += "six";
                                break;
                            case 7:
                                alert += "seven";
                                break;
                            case 8:
                                alert += "eight";
                                break;
                            case 9:
                                alert += "nine";
                                break;
                        }
                    }
            }
        }
        String output = alert.substring(0,1).toLowerCase() + alert.substring(1)+".";
        System.out.println(output);
    }
}
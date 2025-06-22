import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a = 4;
//        switch (a) {
//            case 1 -> System.out.println("wer");
//            case 2 -> System.out.println("wer");
//            case 3 -> System.out.println("wer");
//
//        }
//        switch (a) {
//            case 1, 2, 3, 4, 5 -> System.out.println("hello");
//            case 6, 7, 8, 9 -> System.out.println("hai");
//
//        }
        Scanner sc = new Scanner(System.in);

        switch (a) {
            case 1, 2, 3 -> {
                System.out.println("hai");
            }
            case 4, 5, 6 -> {
                System.out.print("enter id=");
                String id = sc.nextLine();
                switch (id) {
                    case "it":
                        System.out.println("it");
                        break;
                    case "cse":
                        System.out.println("cse");
                        break;
                    default:
                        System.out.println("invalid");
                }
            }
            default -> System.out.println("invalid");
        }
    }
}
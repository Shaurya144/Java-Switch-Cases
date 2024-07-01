public class Main {
    public static void main(String[] args) {
        // switch case saves time as you don't have to write many if else
        int day_of_the_week = 6;
        switch (day_of_the_week) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wendnesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default: // This runs if none of the others work
                System.out.println("It is no day?");
                break;
        }
    }
}
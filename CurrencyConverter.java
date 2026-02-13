public class CurrencyConverter {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("If I give you £1, how many dollars will you give me? ");
        double dollarOverPoundRatio = scan.nextDouble();
        System.out.print("If I give you $1, how many Sterling pounds will you give me? ");
        double poundOverDollarRatio = scan.nextDouble();
        System.out.println("OK, now I know enough.");
        boolean finished = false;
        while (!finished) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("   1 - Exchange pounds into dollars");
            System.out.println("   2 - Exchange dollars into pounds");
            System.out.println("   0 - Exit the program");
            System.out.println();
            System.out.print(  "> ");
            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                System.out.print("How many pounds would you like to convert? ");
                double pounds = scan.nextDouble();
                double dollars   = pounds * dollarOverPoundRatio;
				String dollars2Dp = String.format("%.2f", dollars);
                System.out.println("£" + pounds + " will give you $" + dollars2Dp);
                break;
            case 2:
                System.out.print("How many dollars would you like to convert? ");
                dollars   = scan.nextDouble();
                pounds = dollars * poundOverDollarRatio;
				String pounds2Dp = String.format("%.2f", pounds);
                System.out.println("$"+ dollars + " will give you £" + pounds2Dp);
                break;
            case 0:
                finished = true;
                break;
            default:
                System.out.println("Sorry, that is not a valid option");
            }
        }
        System.out.println("Exiting the program");
    }
}

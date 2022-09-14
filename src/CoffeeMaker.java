import java.util.Scanner;

public class CoffeeMaker {

    static Scanner in;
    static int SelectedOption = 0; // Initial value set to 0

    public static void main(String[] args) {

        in = new Scanner(System.in); // creating object of scanner class to take user input
        DisplayMenu(); // calling display menu
    }

    // Will provide the initial options which can be performed by user/admin
    // Like Buy, refill, check remaining , exit.
    private static void DisplayMenu() {

        do {
            System.out.println("\n===================== Welcome to the Coffee Shop ================");
            System.out.print("""
                    1:- Buy any Coffee
                    2:- Refill/Add Ingredients
                    3:- Check Remaining Ingredients
                    4:- Exit the coffee shop
                    Which action you want to perform ? :\s""");

            do {
                SelectedOption = in.nextInt();
                System.out.println((SelectedOption < 1 || SelectedOption > 4) ? "Enter valid option" : " ");

            }while (SelectedOption < 1 || SelectedOption > 4);

            switch (SelectedOption) {
                case 1 -> {
                    Select_Beverage();
                }
                case 2 -> {
                    Refill_Ingredients();
                }
                case 3 -> {
                    LeftIngredients();
                }
                case 4 -> {
                    System.out.println("Thanks for visiting the coffee shop, Have a nice day!!");
                    System.exit(0);
                }
                default -> System.out.println("\nEnter valid option");
            }

        }while (SelectedOption != 4);
    }

    // As per choice selected, firstly user input will be taken for No. of outlets to be used simultaneously.
    // Then it will call methods from Beverages class as per the choice selected.
    // And check if sufficient amount of ingredients are present or not
    public static void Select_Beverage() {
        
        System.out.println
                ("""

                        ============  Select any choice among the Beverages =============
                        1:- Hot Tea
                        2:- Hot Coffee
                        3:- Black Tea
                        4:- Green Tea
                        5:- Main Menu""");

        int input = CoffeeMaker.in.nextInt();
        int OutletsNo;
        
        if (input==1) {
            System.out.print("Number of Outlets you want to use simultaneously? \n");
            OutletsNo = CoffeeMaker.in.nextInt();
            Beverages.HotTea(OutletsNo);
        }
        else if (input==2) {
            System.out.print("Number of Outlets you want to use simultaneously? \n");
            OutletsNo = CoffeeMaker.in.nextInt();
            Beverages.HotCoffee(OutletsNo);
        }
        else if (input==3) {
            System.out.print("Number of Outlets you want to use simultaneously? \n");
            OutletsNo = CoffeeMaker.in.nextInt();
            Beverages.BlackTea(OutletsNo);
        }
        else if (input==4) {
            System.out.print("Number of Outlets you want to use simultaneously? \n");
            OutletsNo = CoffeeMaker.in.nextInt();
            Beverages.GreenTea(OutletsNo);
        }
        else if (input==5) {
            System.out.println("\n Back to Main Menu");
            DisplayMenu();
        }
        else {
            System.out.println("\nInvalid selection\n");
        }
    }

    // Will add on the quantity with the existing amount of respective ingredients.
    // And display the respective amount at last.
    public static void Refill_Ingredients(){
        System.out.println("Enter the Quantity to be added");
        System.out.print("Water : "); Ingredients.Total_Water += in.nextInt();
        System.out.print("Milk : "); Ingredients.Total_Milk += in.nextInt();
        System.out.print("Ginger syrup : "); Ingredients.Total_GingerSyrup += in.nextInt();
        System.out.print("Sugar syrup : "); Ingredients.Total_SugarSyrup += in.nextInt();
        System.out.print("Tea-leaves syrup : "); Ingredients.Total_TeaLeavesSyrup += in.nextInt();
        System.out.print("Green mixture : "); Ingredients.Total_GreenMixture += in.nextInt();

        LeftIngredients();

    }

    // This will display the current amount of Ingredients which is present in the Coffee Maker.
    public static void LeftIngredients(){
        System.out.println("************* Quantity of Ingredients Present in a Coffee Maker *********\n"
                + "Quantity of Water : " +Ingredients.Total_Water +"\n"
                + "Quantity of Milk :  " +Ingredients.Total_Milk +"\n"
                + "Quantity of Ginger syrup : " +Ingredients.Total_GingerSyrup + "\n"
                + "Quantity of Sugar syrup : " +Ingredients.Total_SugarSyrup + "\n"
                + "Quantity of Tea-leaves syrup : " +Ingredients.Total_TeaLeavesSyrup + "\n"
                + "Quantity of Green mixture : " +Ingredients.Total_GreenMixture);
    }

}

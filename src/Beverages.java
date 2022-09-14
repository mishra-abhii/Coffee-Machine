
public class Beverages {

    public static void HotTea(int Outlets_No) {

        // checking if any of the ingredients are in less amount as per requirement.
        if (Ingredients.HT_water * Outlets_No > Ingredients.Total_Water) {
            System.out.println("Quantity of water is not sufficient!!");
        }
        else if (Ingredients.HT_milk * Outlets_No > Ingredients.Total_Milk) {
            System.out.println("Quantity of milk is not sufficient!!");
        }
        else if (Ingredients.HT_gingerSyrup * Outlets_No > Ingredients.Total_GingerSyrup) {
            System.out.println("Quantity of Ginger-syrup is not sufficient!!");
        }
        else if (Ingredients.HT_sugarSyrup * Outlets_No > Ingredients.Total_SugarSyrup) {
            System.out.println("Quantity of Sugar-syrup is not sufficient!!");
        }
        else if (Ingredients.HT_teaLeavesSyrup * Outlets_No > Ingredients.Total_TeaLeavesSyrup) {
            System.out.println("Quantity of Tea-leaves syrup is not sufficient!!");
        }

        // If all the ingredients are in sufficient amount then else condition will execute.
        else {
            DisplayMessage("Hot Tea", Outlets_No);

            // Updating the quantity of ingredients
            Ingredients.Total_Water -= Ingredients.HT_water * Outlets_No;
            Ingredients.Total_Milk -= Ingredients.HT_milk * Outlets_No;
            Ingredients.Total_GingerSyrup -= Ingredients.HT_gingerSyrup * Outlets_No;
            Ingredients.Total_SugarSyrup -= Ingredients.HT_sugarSyrup * Outlets_No;
            Ingredients.Total_TeaLeavesSyrup -= Ingredients.HT_teaLeavesSyrup * Outlets_No;
        }
    }

    public static void HotCoffee(int Outlets_No) {

        // checking if any of the ingredients are in less amount as per requirement.
        if (Ingredients.HC_water * Outlets_No > Ingredients.Total_Water) {
            System.out.println("Quantity of water is not sufficient!!");
        }
        else if (Ingredients.HC_milk * Outlets_No > Ingredients.Total_Milk) {
            System.out.println("Quantity of milk is not sufficient!!");
        }
        else if (Ingredients.HC_gingerSyrup * Outlets_No > Ingredients.Total_GingerSyrup) {
            System.out.println("Quantity of Ginger syrup is not sufficient!!");
        }
        else if (Ingredients.HC_sugarSyrup * Outlets_No > Ingredients.Total_SugarSyrup) {
            System.out.println("Quantity of Sugar syrup is not sufficient!!");
        }
        else if (Ingredients.HC_teaLeavesSyrup * Outlets_No > Ingredients.Total_TeaLeavesSyrup) {
            System.out.println("Quantity of Tea-leaves syrup is not sufficient!!");
        }

        // If all the ingredients are in sufficient amount then else condition will execute.
        else {
            DisplayMessage("Hot Coffee", Outlets_No);

            //Updating the quantity of ingredients
            Ingredients.Total_Water -= Ingredients.HC_water * Outlets_No;
            Ingredients.Total_Milk -= Ingredients.HC_milk * Outlets_No;
            Ingredients.Total_GingerSyrup -= Ingredients.HC_gingerSyrup * Outlets_No;
            Ingredients.Total_SugarSyrup -= Ingredients.HC_sugarSyrup * Outlets_No;
            Ingredients.Total_TeaLeavesSyrup -= Ingredients.HC_teaLeavesSyrup * Outlets_No;
        }
    }

    public static void BlackTea(int Outlets_No) {

        // checking if any of the ingredients are in less amount as per requirement.
        if (Ingredients.BT_water * Outlets_No > Ingredients.Total_Water) {
            System.out.println("Quantity of water is not sufficient!!");
        }
        else if (Ingredients.BT_gingerSyrup * Outlets_No > Ingredients.Total_GingerSyrup) {
            System.out.println("Quantity of Ginger syrup is not sufficient!!");
        }
        else if (Ingredients.BT_sugarSyrup * Outlets_No > Ingredients.Total_SugarSyrup) {
            System.out.println("Quantity of Sugar syrup is not sufficient!!");
        }
        else if (Ingredients.BT_teaLeavesSyrup * Outlets_No > Ingredients.Total_TeaLeavesSyrup) {
            System.out.println("Quantity of Tea-leaves syrup is not sufficient!!");
        }
        else {
            DisplayMessage("Black Tea", Outlets_No);

            // Updating the quantity of ingredients
            Ingredients.Total_Water -= Ingredients.BT_water * Outlets_No;
            Ingredients.Total_GingerSyrup -= Ingredients.BT_gingerSyrup * Outlets_No;
            Ingredients.Total_SugarSyrup -= Ingredients.BT_sugarSyrup * Outlets_No;
            Ingredients.Total_TeaLeavesSyrup -= Ingredients.BT_teaLeavesSyrup * Outlets_No;
        }
    }

    public static void GreenTea(int Outlets_No) {

        // checking if any of the ingredients are in less amount as per requirement.
        if (Ingredients.GT_water * Outlets_No > Ingredients.Total_Water) {
            System.out.println("Quantity of water is not sufficient!!");
        }
        else if (Ingredients.GT_gingerSyrup * Outlets_No > Ingredients.Total_GingerSyrup) {
            System.out.println("Quantity of Ginger syrup is not sufficient!!");
        }
        else if (Ingredients.GT_sugarSyrup * Outlets_No > Ingredients.Total_SugarSyrup) {
            System.out.println("Quantity of Sugar syrup is not sufficient!!");
        }
        else if (Ingredients.GT_greenMixture * Outlets_No > Ingredients.Total_GreenMixture) {
            System.out.println("Quantity of Green mixture is not sufficient!!");
        }
        else {
            DisplayMessage("Green Tea", Outlets_No);

            //Updating the quantity of ingredients
            Ingredients.Total_Water -= Ingredients.GT_water * Outlets_No;
            Ingredients.Total_GingerSyrup -= Ingredients.GT_gingerSyrup * Outlets_No;
            Ingredients.Total_SugarSyrup -= Ingredients.GT_sugarSyrup * Outlets_No;
            Ingredients.Total_GreenMixture -= Ingredients.GT_greenMixture * Outlets_No;
        }
    }

    public static void DisplayMessage (String itemName, int Outlets) {
        System.out.println("\nPlease wait your " + itemName + " is getting ready for "+ Outlets+ " Outlet !!");
    }
}

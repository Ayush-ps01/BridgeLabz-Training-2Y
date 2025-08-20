import java.util.Scanner;

public class cm_to_feet {
   public cm_to_feet() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      double var3 = (double)var2 / 2.54;
      double var5 = var3 / 12.0;
      System.out.print("Your Height in cm is " + var2 + " while in feet is " + var5 + " and inches is " + var3);
   }
}

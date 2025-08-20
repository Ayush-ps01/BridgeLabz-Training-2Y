import java.time.LocalDate;

public class harry_age {
   public harry_age() {
   }

   public static void main(String[] var0) {
      short var1 = 2000;
      int var2 = LocalDate.now().getYear();
      int var3 = var2 - var1;
      System.out.println("Age " + var3);
   }
}

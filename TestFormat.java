import java.util.Calendar;
import java.util.Locale;
import java.text.NumberFormat;

public class TestFormat {

    public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
      long n = 461012;
      double dd = 123456.123;
      System.out.println(nf.format(dd) + "; ");
      System.out.format("%d%n", ++n);      //  -->  "461012"
      System.out.format("%08d%n", ++n);    //  -->  "00461012"
      System.out.format("%+8d%n", ++n);    //  -->  " +461012"
      System.out.format("%,8d%n", ++n);    // -->  " 461,012"
      System.out.format("%+,8d%n%n", ++n); //  -->  "+461,012"
      System.out.format(Locale.FRANCE,"%+,8d%n%n", ++n); //xx  -->  "+461,012"

      double pi = Math.PI;

      System.out.format("%f%n", pi);       // -->  "3.141593"
      System.out.format("%.3f%n", ++pi);     // -->  "3.142"
      System.out.format("%10.3f%n", ++pi);   // -->  "     3.142"
      System.out.format("%-10.3f%n", ++pi);  // -->  "3.142"
      System.out.format(Locale.FRANCE,
                        "%-10.4f%n%n", ++pi); // -->  "3,1416"

      Calendar c = Calendar.getInstance();
      System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

      System.out.format("%tD%n", c);    // -->  "05/29/06"
      double d = 2996.123;
       for (int x = 996 ; x < 1004 ; x++) {
		//   NumberFormat
		   nf = NumberFormat.getInstance(Locale.UK );
		   System.out.format(nf.format(d) + "xx");
            System.out.format(Locale.FRANCE,"%+,8d %+,8d%n", x, -x); //xx  -->  "+461,012"
            System.out.format(Locale.UK,"%+,8d %+,8d%n", x, -x); //xx  -->  "+461,012"
            System.out.format(Locale.US,"%+,8d %+,8d%n", x, -x); //xx  -->  "+461,012"
            System.out.format(Locale.GERMANY,"%+,8d %+,8d%n", x, -x); //xx  -->  "+461,012"
			}
    }
}

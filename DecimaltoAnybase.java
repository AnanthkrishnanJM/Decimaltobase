package decimalToanybase;

import java.util.Scanner;

public class DecimaltoAnybase {
    
    public static String DecimaltoAnybase(int decimal,int base)
    {
      
        String result="";
		while(decimal>0)
        {
            int remainder=decimal%base;
            result = remainder+result;
            decimal/=base;
        }
        return result.toString();
    }

public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int decimal = n.nextInt();
    int base = n.nextInt();

    System.out.println(DecimaltoAnybase(decimal,base));
}
}
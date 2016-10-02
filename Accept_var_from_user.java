/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accept_var_from_user;
import java.util.Scanner;
/**
 *
 * @author Divay Mohan
 */
public class Accept_var_from_user {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("my_int:: ");
        int my_int=scan.nextInt();
        System.out.println("my_String:: ");
        String my_string=scan.next();
        System.out.println("my_byte:: ");
        byte my_byte=scan.nextByte();
        System.out.println("my_short:: ");
        short my_short=scan.nextShort();
        System.out.println("my_long:: ");
        long my_long=scan.nextLong();
        System.out.println("my_double:: ");
        double my_double=scan.nextDouble();
        System.out.println("my_Float:: ");
        float my_float=scan.nextFloat();
        
        System.out.println("my_int:"+my_int);
         System.out.println("my_string:"+my_string);
          System.out.println("my_byte:"+my_byte);
           System.out.println("my_short:"+my_short);
            System.out.println("my_long:"+my_long);
             System.out.println("my_double:"+my_double);
              System.out.println("my_float:"+my_float);
               
            
        
        // TODO code application logic here
    }
    
}

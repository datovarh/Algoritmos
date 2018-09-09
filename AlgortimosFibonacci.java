/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algortimosfibonacci;
import java.math.BigInteger;
/**
 *
 * @author diegg
 */
public class AlgortimosFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        intFibonacci();
        shortFibonacci();
        longFibonacci();
        //bigIntegerFibonacci();
        
        
    }    
    public static void intFibonacci(){
        int auxiliar= 0;
        int primero = 0;
        int segundo = 1;
        int cuenta = 2;
        System.out.printf("0 %s\n",primero);
        System.out.printf("1 %s\n",segundo);
        while(segundo > 0){
          auxiliar = primero;
          primero = segundo;
          segundo = auxiliar + primero;
          System.out.printf("%s %s\n",cuenta, segundo);
          cuenta++;
        }
        System.out.print("Para int se produce un overflow para n = " );
        System.out.println(cuenta-1);
        
    }
    public static void shortFibonacci(){
        short auxiliar= 0;
        short primero = 0;
        short segundo = 1;
        short cuenta = 2;
        System.out.printf("0 %s\n",primero);
        System.out.printf("1 %s\n",segundo);
        while(segundo > 0){
          auxiliar = primero;
          primero = segundo;
          segundo =  (short) (auxiliar + primero);
          System.out.printf("%s %s\n",cuenta, segundo);
          cuenta++;
        }
        System.out.print("Para short se produce un overflow para n = " );
        System.out.println(cuenta-1);
        
    }
    public static void longFibonacci(){
        long auxiliar= 0;
        long primero = 0;
        long segundo = 1;
        long cuenta = 2;
        System.out.printf("0 %s\n",primero);
        System.out.printf("1 %s\n",segundo);
        while(segundo > 0){
          auxiliar = primero;
          primero = segundo;
          segundo = (auxiliar + primero);
          System.out.printf("%s %s\n",cuenta, segundo);
          cuenta++;
        }
        System.out.print("Para long se produce un overflow para n = " );
        System.out.println(cuenta-1);
        
    }
    public static void bigIntegerFibonacci(){
        BigInteger cero = new BigInteger("0");
        BigInteger uno = new BigInteger("1");
        BigInteger auxiliar = new BigInteger("0");
        BigInteger primero = new BigInteger("0");
        BigInteger segundo = new BigInteger("1");
        BigInteger cuenta = new BigInteger("2");
        System.out.printf("0 %s\n",primero);
        System.out.printf("1 %s\n",segundo);
        while(segundo.compareTo(cero)>0){
          auxiliar = primero;
          primero = segundo;
          segundo = auxiliar.add(primero);
          System.out.printf("%s %s\n",cuenta, segundo);
          cuenta=cuenta.add(uno);
        }
        System.out.print("Para bigInteger se produce un overflow para n = " );
        System.out.println(cuenta.subtract(uno));
        
    }
    
}

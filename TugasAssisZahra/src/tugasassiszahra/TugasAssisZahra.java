/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasassiszahra;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class TugasAssisZahra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                System.out.println("Sebuah Polinomial");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        if (a==0){System.out.println("Nilai a tidak boleh 0" );
        }
        if(a!=0){
            System.out.println(a + "x^2 +" + b + "x+" + c + " memiliki: ");}
        double D = (b*b) - (4 * a * c);
        System.out.println("1. Diskriminan                    :" + D );
        
        double x1;
        double x2;
        x1 = (-1*b + (Math.sqrt(D)))/(2*a);
        x2 = (-1*b - (Math.sqrt(D)))/(2*a);
        System.out.println("2. Akar akar dari polinomial       :" + x1 + " dan " + x2);
        
        double x_stasioner;
        double y_stasioner;
        x_stasioner = (-b)/(2*a);
        y_stasioner = (-D)/(4*a);
        System.out.println("3. Titik Stasioner             :(" + x_stasioner + "," + y_stasioner +")");
        
        if(a>0){System.out.println("4. Kecekungan kurva             : Atas" );}
        if(a<0){System.out.println("4. Kecekungan kurva             : Bawah" );}
        
        System.out.println("5. Nilai minimum lokal              :" + y_stasioner );
        }

    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcircle;

/**
 *
 * @author cui
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1=new Circle();
        c1.SetRadius(4.5);
        //c1.GetRadius();
        //c1.GetArea();
        //c1.GetCircumference();
        Circle c2=new Circle();
        c2.SetRadius(3.5);
        //c2.GetRadius();
        //c2.GetArea();
        //c2.GetCircumference();
        Circle c3=new Circle();
        c3.SetRadius(6.5);
       // c3.GetRadius();
        //c3.GetArea();
        //c3.GetCircumference();
        System.out.printf("--------------------------\n");
        System.out.printf("%.2f\n",c1.GetArea());
           System.out.printf("%.2f\n",c1.GetCircumference());
            System.out.printf("--------------------------");
            System.out.printf("--------------------------\n");
        System.out.printf("%.2f\n",c2.GetArea());
           System.out.printf("%.2f\n",c2.GetCircumference());
            System.out.printf("--------------------------");
            System.out.printf("--------------------------\n");
        System.out.printf("%.2f\n",c3.GetArea());
           System.out.printf("%.2f\n",c3.GetCircumference());
            System.out.printf("--------------------------\n");


    }
    
}

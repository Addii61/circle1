/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcircle;

/**
 *
 * @author cui
 */
    import java.lang.Math;
public class Circle {
    private double radius;
    public void SetRadius(double a){
        this.radius=a;}
    public double GetRadius(){
        return this.radius;}
    public double GetArea(){
        return Math.PI*radius*radius;}
    public double GetCircumference(){
        return this.radius*radius;
    }
}



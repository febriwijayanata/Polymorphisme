/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author febri
 */
public class aeroplan extends vehicle{
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    public static void main(String[]args){
        aeroplan garuda = new aeroplan();
        garuda.function();
        garuda.vehicle();
        garuda.walk();
    }
}

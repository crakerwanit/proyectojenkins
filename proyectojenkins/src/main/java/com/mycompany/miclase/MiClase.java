/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
/**
 * @author David Catena
 */
package com.mycompany.miclase;

public class MiClase {

    public static boolean dia_laboral(String dia) {
        switch (dia) {
            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                return true;
            case "Sábado":
            case "Domingo":
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(dia_laboral("Lunes"));
    }
}

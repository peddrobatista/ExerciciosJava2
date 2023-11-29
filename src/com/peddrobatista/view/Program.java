package com.peddrobatista.view;

import com.peddrobatista.classes.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Triangle x = new Triangle();

        System.out.println("Digite as medidas do triângulo X: ");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();

        double areaX = x.area();

        System.out.println("Área do triângulo X: " + areaX);

    }
}

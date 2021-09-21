package com.company;
import java.util.Scanner;
public class Main {


     static void wallsmethod() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the width of all of the walls in the room added(in meters)?");

        float width = myObj.nextFloat();

        System.out.println("What is the height of the room(in meters)?");

        float height = myObj.nextFloat();


        System.out.println("How much paint is in the container?(in litres)");

        float litres = myObj.nextFloat();
        float area = width * height;
        float arealitres = area / litres;
        float numberoflitres = arealitres / 12;
        float numberofpaintcans = numberoflitres / litres;
        double rounded = Math.ceil(numberofpaintcans / 100);
        if (rounded == 1) {
            System.out.println(rounded);
            System.out.println("paint can");
        }else {
            System.out.println(rounded);
            System.out.println("paint cans");
        }
        switch (rounded){
            case 0:
                System.out.println("Looks like you won't need any paint stop wasting my time!!");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rounded);
        }
    }




    public static void main(String[] args)
            {
                wallsmethod();

            }


















    }


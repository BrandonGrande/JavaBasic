package com.basicjava;

import com.basicjava.abstractexample.MountainBike;
import com.basicjava.constructorexample.Task;
import com.basicjava.staticexample.StaticExample;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        /*lesson1();*/

        lesson2();
        /**/

        /*lesson3();*/

    }

    public static void lesson1(){
        /*Lesson: Tipos de datos primitivos y no primitivos.s*/

        /* Primitive types */
        int myNum = 5;               /* 32 bit (Stores whole numbers from -2,147,483,648 to 2,147,483,647)*/
        byte myByte = 127;           /* 8 bit (Stores whole numbers from -128 to 127)*/
        short myShort = 32767;       /* 16 bit (Stores whole numbers from -32,768 to 32,767) */
        long myLong = 123;           /* 32 bit*/
        float myFloatNum = 5.99f;    /* 32 bit (Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits)*/
        Double myDouble = 5.888d;    /* 64 bit*/
        char myLetter = 'D';         /* 16 bit unicode character*/
        boolean myBool = true;       /* 1 bit true and false */

        /* Non primitive types */
        String myText = "Hello";     /* Object for string */

        /* Big decimal es muy utilizado para sumas de dinero en sistemas financieros
        (Por los decimales ya que los float pueden ser imprecisos)*/
        BigDecimal myDecimal = new BigDecimal(0.125);

        System.out.println(myNum);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myFloatNum);
        System.out.println(myDouble);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(myDecimal);
    }

    public static void lesson2(){
        /*Lesson: Modificadores de acceso
        *
        *          Class   Package  Subclass  World
        * Public     Yes      Yes      Yes      Yes
        * Protected  Yes      Yes      Yes      No
        * Default    Yes      Yes      No       No
        * Private    Yes      No       No       No
        * * */
    }

    public static void lesson3(){
        /*Lesson : Clases abstractas
         * 1.Tienen metodos abstractos: Son metodos que no tienen implementacion.
         * 2.Tienen metodos no abstractos: Son metodos que sí tienen implementacion.
         * 3.Metodos publicos,privados,default y protegidos.
         * 4.Pueden implementar clases o interfaces.
         * */

        MountainBike mountainBike = new MountainBike();

        /*Metodo no abstracto. (Implementado dentro de la clase abstracta)*/
        mountainBike.run();

        /*Metodo abstracto. (Implementado en otra clase que herada de la clase abstracta.)*/
        mountainBike.brake();
    }

    public static void lesson4(){
        StaticExample staticExample = new StaticExample();
        staticExample.executeExample();
    }

    public static void lesson5(){
        Task task = new Task();
    }
}
package com.Kashika;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // milkshake
        System.out.println("Milkshake Flavors\n" +
                "Vanilla - $3.00\n" +
                "Chocolate - $3.25\n" +
                "Strawberry - $3.50\n" +
                "Enter milkshake flavor (vanilla, chocolate, or strawberry):\n");

        String flav;

        double m_amt=0;double f_amt = 0;
        do {
            Scanner sc = new Scanner(System.in);
            String flavour = sc.nextLine();
            flav = flavour.toLowerCase();


            switch (flav) {
                case ("vanilla") -> m_amt = 3.00;
                case ("chocolate") -> m_amt = 3.25;
                case ("strawberry") -> m_amt = 3.50;
                default -> System.out.println("Your order is invalid. Enter a valid order.");
            }
        } while (!(flav.equals("vanilla") || flav.equals("chocolate") || flav.equals("strawberry")));

        //fries
        System.out.println("Choice of Fries\n" +
                "Cajun - $2.50\n" +
                "Normal - $2.00\n" +
                "Curly - $2.25\n" +
                "Enter choice of fries (cajun, normal, or curly): \n");

        String fri;

        do {
            Scanner scc = new Scanner(System.in);
            String fr = scc.nextLine();
            fri = fr.toLowerCase();

            switch (fri) {
                case "cajun" -> f_amt = 2.50;
                case ("normal") -> f_amt = 2.00;
                case ("curly") -> f_amt = 2.25;
                default -> System.out.println("Your order is invalid. Enter a valid order.");
            }
        }
        while (!(fri.equals("cajun") || fri.equals("normal") || fri.equals("curly")));

        double t_amt = m_amt + f_amt;
        System.out.println("Your order of a " +flav + " milkshake and " +fri + " fries costs $" +t_amt);
    }}

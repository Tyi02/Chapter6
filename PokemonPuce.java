package com.CSCI185;

public class PokemonPuce {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Fire", "Charizard", 100,
                150, 25);

        Pokemon p2 = new Pokemon("Normal", "Snorlax", 100,
                250, 25);

        Pokemon p3 = new Pokemon("Electric", "Jolteon", 100,
                100, 25);
        fight(p2, p3);
        fight(p3, p1);
        fight(p1,p2);

        boolean done = false;
        while(!done)
        {
            p1.doAttack(p2);
            p2.doAttack(p1);
            System.out.println("------------\n");
            if(p2.getHealth() <= 0 || p1.getHealth() <= 0)

                done = true;
            }
        }

        public static void fight(Pokemon one, Pokemon two)
        {
            boolean done = false;
            while(!done)
            {
                one.doAttack(two);
                two.doAttack(one);
                System.out.println("------------\n");
                if(two.getHealth() <= 0 || one.getHealth() <= 0)

                    done = true;
                }
             }
        }

    
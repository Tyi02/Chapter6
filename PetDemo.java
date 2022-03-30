package com.CSCI185;

import com.CSCI185.Pet;

public class PetDemo {
    public static void main(String[] args) {
        Pet p1 = new Pet("Thor", 9,60);
        p1.writeOutput();

        Pet p2 = new Pet("Loki", 1, 42);
        p2.writeOutput();

        Pet p3 = new Pet("Ajax",4,40);
        p3.writeOutput();
    }
}

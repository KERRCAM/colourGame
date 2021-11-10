package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<String> colours = new ArrayList<>();
    String colour[] = {"red","blue","green","orange","purple","gray","black","white","cyan","lime","magenta","yellow","brown","violet","pacific ocean blue-green"};
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
    int randomColour = random.nextInt(15);
    colours.add(colour[randomColour]);
    }

    int score = 0;
    int life = 0;
    while (life < 3 && score < 10) {
        int startScore = score;
        int startLife = life;
        System.out.println("guess a colour");
        String guess = input.next();
        for (int i = 0; i < colours.size(); i++) {
            if (guess.equals(colours.get(i))) {
                score = score + 1;
                colours.remove(colours.get(i));
            }
        }

        if (score == startScore) {
            System.out.println("-1 life");
            life = life +1;
        }
        if (score != startScore) {
            System.out.println("+1 life");
        }
        if (life == 3) {
            System.out.println("you have run out of lives smh");
        }if (score == 10) {
            System.out.println("well done you guessed every colour");
        }



    }











    }
}

package ru.geekbrains.lessons;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Ваша задача угадать слово!");

        int indexWord = (int)(Math.random() * words.length);
        String word = words[indexWord];

        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.print("Угадайте слово: ");
            String userWord = sc.nextLine();
            if (userWord.equals(word))
            {   System.out.println("Вы угадали!");
                break;
            }
            else
                System.out.println("Попробуйте ещё раз! " + getMatches(word, userWord));
        }
        multiplicity(4);
        multiplicity(5);
        multiplicity(6);
        multiplicity(15);
    }

    static String getMatches(String word, String userWord)
    {
        StringBuilder matches = new StringBuilder("");
        int length = 15;
        int wordLength = word.length();
        if (userWord.length() < wordLength)
            wordLength = userWord.length();
        for (int i = 0; i < wordLength; i++){
            char c = word.charAt(i);
            matches.append(c == userWord.charAt(i) ? c : '*');
        }
        for (int i = 0; i < length - wordLength; i++)
            matches.append('*');
        return matches.toString();
    }

    static void multiplicity(int i){
        if (i % 3 == 0)
            System.out.println("Число " + i + " делится на 3");
        if (i % 5 == 0)
            System.out.println("Число " + i + " делится на 5");
    }
}

import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    String fname = keyboard.nextLine();
    String lname = keyboard.nextLine();
    String favoriteAnimal = keyboard.nextLine();
    String favoriteFood = keyboard.nextLine();
    String favoriteSong = keyboard.nextLine();

    System.out.println("My name is " + fname + lname);
    System.out.println("My favorite animal is " + favoriteAnimal);
    System.out.println("My favorite food is " + favoriteFood);
    System.out.println("My favorite song is " + favoriteSong);

  }
} 
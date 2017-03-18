//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Terepasztal
//  @ File Name : Main.java
//  @ Date : 2017. 03. 17.
//  @ Author : 
//
//

package project;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int tabs = 0;

    public static void main(String[] args) {
        int b=0;
        while (b!=7){
        b = menuWrite();
        while (b < 1 || b > 7) {
            System.out.println("Ilyen parancs nem létezik");
            b = menuWrite();
        }
        runSkeleton(b);
        }
    }

    public static int menuWrite() {
        System.out.print("\n \nMenü:" + "\n" +
                "1. Váltó állítása" + "\n" +
                "2. Alagút létrehozása" + "\n" +
                "3. Alagút törlése" + "\n" +
                "4. Vonat mozgatása" + "\n" +
                "5. Leszállás" + "\n" +
                "6. Játék kimenete" + "\n" +
                "7. Kilépés" + "\n" +"\n" +
                "? Adja meg a parancs kódját: "
        );
        Scanner sc = new Scanner(System.in);
        int a = 0;
        try {
            a = sc.nextInt();
        } catch (Exception e) {
        }
        return a;
    }

    public static void runSkeleton(int b) {
        switch (b) {
            case 1:
                System.out.println(b + ". Váltó állítása");
                changeSwitch();
                break;
            case 2:
                System.out.println(b + ". Alagút létrehozása");
                break;
            case 3:
                System.out.println(b + ". Alagút törlése");
                break;
            case 4:
                System.out.println(b + ". Vonat mozgatása");
                moveTrains();
                break;
            case 5:
                System.out.println(b + ". Leszállás");
                getOffPass();
                break;
            case 6:
                System.out.println(b + ". Játék kimenete");
                gameEnding(); tabs++;
                break;
            case 7:
                System.out.println(b + ". Kilépés");
                break;
        }
    }

    public static void changeSwitch() {
        System.out.print("? 1.1. Szeretné átállítani a váltó kimenetét? I/N: ");
        char c = 0;
        try {
            c = (char) System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (c == 'I' || c == 'i') {
            Switch s = new Switch(1, 1, null, null, null);
            s.changeOutput();
        }
    }

	private static void gameEnding(){
		  System.out.println("- 6. Játék kimenete");

		  Model m = new Model();
		  m.moveEngines();
	}
  
  public static void moveTrains() {
        Model map = new Model();
        map.moveEngines();
  }

  public static void getOffPass() {
        Car c1 = new Car();
        Car c2 = new Car();
        c2.setPrevTrain(c1);
        Station st = new Station();
        st.addTrain(c2);
  }
}

package project;

import java.util.Scanner;

public class Station extends Node {

	public Station(int x, int y, Node n, Node p) {}
	
	public String getColor(){
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Station].getColor()\n");

            System.out.print("?");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("5.2. Milyen színű az állomás? R/Green/B/Y/Gray :");

            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Station].getColor()\n");

            Main.tabs--;
            return s;
	}
        
    @Override
	public void addTrain(Train t) {
            Main.tabs++;
            System.out.print(">");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("->[:Station].addTrain()\n");

            t.setOnNode(this);
            if (t.getColor().equals(getColor()))
                ((Car)t).getOffPassengers();

            System.out.print("<");
            for(int i = 0; i < Main.tabs; i++) {
                System.out.print("\t");
            }
            System.out.print("<-[:Station].addTrain()\n");

            Main.tabs--;
	}

}

/*
5.Define a class whose objects are records on animal species. 
The class should have instance variables for the species name, population, and growth rate. The growth rate is a percentage that can be positive or 
negative and can exceed 100%. Include a suitable collection of constructors, mutator methods, and accessor methods. Include a toString method and an 
equals method. Include a boolean valued method named endangered that returns true when the growth rate is negative and returns false otherwise. 
Write a test program (or programs) that tests each method in your class definition.

*/
import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Animal sp1 = new Animal("Tiger", 3762, 32.5);
        Animal sp2 = new Animal("Whale", 1474, -2.4);
        Animal sp3 = new Animal("Chimpanzee", 1500, -8.3);
        Animal sp4 = new Animal("Penguin", 580000, 140);
        Animal sp5 = new Animal("Butterfly", 120000, 160);

        String n;
        double g;
        int po;

        //using mutator and accessor methods

        sp1.setGrowthRate(38.4);
        sp3.setName("Red Panda");
        sp5.setPopul(130000);

        n = sp1.getName();
        g = sp1.getGrowthRate();
        po = sp1.getPopul();

        //For object 1 using accessor method
        System.out.println("Animal Specie: " + n);
        System.out.println("Population: " + po);
        System.out.println("Growth Rate: " + g);


        System.out.println(sp2.toString());
        System.out.println(sp3.toString());
        System.out.println(sp4.toString());
        System.out.println(sp5.toString());


        //Endagered method
        System.out.println("\nGrowth Status: \n");
        System.out.println(sp1.getName() +": " + sp1.endangered());
        System.out.println(sp2.getName() +": " + sp2.endangered());
        System.out.println(sp3.getName() +": " + sp3.endangered());
        System.out.println(sp4.getName() +": " + sp4.endangered());
        System.out.println(sp5.getName() +": " + sp5.endangered());

        System.out.println("\nEqual Status: \n");
        System.out.println("Specie 1 is equal to Specie 2: " + sp1.equals(sp2));
        System.out.println("Specie 3 is equal to Specie 4: " + sp3.equals(sp4));
        System.out.println("Specie 2 is equal to Specie 2: " + sp2.equals(sp2));
        System.out.println("Specie 5 is equal to Specie 4: " + sp5.equals(sp4));
    }
}

import java.util.Objects;

public class Animal {
    private String name;
    private int Popul;
    private double growthRate;


    //Parametrized Constructor
    public Animal(String Aname, int po, double gr) {
        this.name = Aname;
        this.Popul = po;
        this.growthRate = gr;
    }

    //Mutator
    public void setName(String name) {
        this.name = name;
    }

    public void setPopul(int popul) {
        Popul = popul;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    //Accessor
    public String getName() {
        return name;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public int getPopul() {
        return Popul;
    }

    //toString Method
    public String toString() {
        return "\nAnimal Specie: " + name + "\nPopulation: " + Popul + "\nGrowth Rate: " + growthRate;
        }

        public boolean equals(Object o){
        if(this == o){
            return true;
        }
        else return false;
        }

        //boolean valued method
    public boolean endangered() {
        if(this.growthRate < 0)
            return true;
        else
            return false;
    }
    
}

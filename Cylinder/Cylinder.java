public class Cylinder {
    private double radius;
    private double height;

    //Constructor
    //No argument
    public Cylinder() {
        radius = 3.4;
        height = 4.2;
    }
    //one argument height and set radius to 1.5
    public Cylinder(double h){
        this.height = h;
        radius = 1.5;
    }

    //one argument height and set radius to 1.5
    public Cylinder(float r){
        this.radius = r;
        height = 2;
    }

    //two argument
    public Cylinder(double he, double ra){
        this.height = he;
        this.radius = ra;
    }


    //two argument
    public Cylinder(float ra, double he){
        this.height = he;
        this.radius = ra;
    }

    //Overload Methods
    public void setCylinderData(){
        height = 2.1;
        radius = 1.8;
    }

    public void setCylinderData(double he){
        height = he;
        radius = 1.2;
    }
    public void setCylinderData(double he, double ra){
        height = he;
        radius = ra;
    }


    //Setter Functions
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

    //Getter Functions
    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public double computeArea(){
        double A;
        A = 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        return A;
    }

    public double computeVolume(){
        double V;
        V = Math.PI * radius * radius * height;
        return V;

    }

    public void displayInfo(){
        System.out.println("--------Showing Cylinder's Information---------");
        System.out.printf("Height: %2.2f \nRadius: %2.2f\nArea: %2.2f\nVolume: %2.2f",height, radius, computeArea(), computeVolume() );
    }

}

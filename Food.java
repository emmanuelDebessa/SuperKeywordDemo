public class Food {
    protected double calories;
    protected String name;

    public Food(double calories, String name){
        this.calories = calories;
        this.name = name;
    }

    public String toString(){
        return this.name + ": " + this.calories + " Cal; ";
    }
}

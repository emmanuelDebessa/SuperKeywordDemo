import java.time.LocalDate;

public class Hamburger extends Food {
    protected LocalDate produced_date;
    protected String brand;

    public Hamburger(String brand){
        super(500, "Hamburger");
        this.produced_date = LocalDate.now();
        this.brand = brand;
    }

    public String toString(){
        return super.toString() + " produced on: " + this.produced_date
                + " by: " + this.brand;
    }
}

package bsu.rfe.java.group7.lab1.nazarenko.varA2;

public class Pie extends Food{
    private String filling;
    
    public Pie(String filling) {
        super("Пирог");
        this.filling = filling;
    }
    
    public void consume() {
        System.out.println(this + " съедено");
    }
    
    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String toString() {
        return super.toString() + " способа приготовления '" + filling.toUpperCase() + "'";
    }
}

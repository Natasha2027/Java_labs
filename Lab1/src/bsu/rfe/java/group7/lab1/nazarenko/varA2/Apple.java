package bsu.rfe.java.group7.lab1.nazarenko.varA2;

public class Apple extends Food {
    private String type;
    public Apple(String type) {
        super("Яблоко");
        this.type = type;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    public String gettipe() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return type.equals(((Apple)arg0).type);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " размера '" + type.toUpperCase() + "'";
    }
}
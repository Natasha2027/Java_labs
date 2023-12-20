package bsu.rfe.java.group7.lab1.nazarenko.varA2;

public class Product {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese(parts[1]);;
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            } else
            if (parts[0].equals("Pie")) {
                breakfast[itemsSoFar] = new Pie(parts[1]);
            }
            itemsSoFar++;
        }

        int Pie_CHERRY = 0;
        Pie pie_CHERRY = new Pie("Cherry");
        for (Food pie : breakfast) {
            if (pie instanceof Pie) {
                if ((pie).equals(pie_CHERRY))
                    Pie_CHERRY++;
            }
        }
        System.out.println("Количество " + pie_CHERRY + " всего " + Pie_CHERRY);

        for (Food item: breakfast)
            if (item!=null)
                item.consume();
            else
                break;
    }
}
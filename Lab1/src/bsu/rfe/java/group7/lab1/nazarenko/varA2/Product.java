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

        int counterApple = 0;
        int counterCheese = 0;
        int counterPie = 0;
        for (Food food : breakfast) {
            if (food instanceof Apple) {
            	counterApple++;
            } else
            if (food instanceof Cheese) {
            	counterCheese++;
            } else
            if (food instanceof Pie) {
            	counterPie++;
            }
        }
        System.out.println("Количество яблок всего " + counterApple);
        System.out.println("Количество сыров всего " + counterCheese);
        System.out.println("Количество пирогов всего " + counterPie);
        
        for (Food item: breakfast)
            if (item!=null)
                item.consume();
            else
                break;
    }
}

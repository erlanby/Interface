package interfaceLesson;

public class Main {
    public static void main(String[] args) {
        Deliverable pizza = new Pizza("Dodo Pizza", "Margarito", 3, 700);

        Deliverable fridge = new Fridge("China", "LG", 1, 41000);

        Deliverable cellPhone = new CellPhone("China", "Samsung", 1, 45000);

        printPrice(pizza );
        printPrice(fridge);
        printPrice(cellPhone);

        pizza.calc1();
    }

    public static void printPrice(Deliverable deliverable){
        System.out.println(" Цена " + deliverable.calcDeliveryPrice());

    }
}
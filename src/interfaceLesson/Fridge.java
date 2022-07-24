package interfaceLesson;

public class Fridge extends Electronic{
    public Fridge(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if (getPrice() > 25000){
            return 0;
        }
        return 500;
    }
}

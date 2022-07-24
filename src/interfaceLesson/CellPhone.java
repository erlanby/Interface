package interfaceLesson;

public class CellPhone extends Electronic{
    public CellPhone(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
        if (getPrice() > 20000){
            return 0;
        }
        return 400;
    }
}

package interfaceLesson;

public class Pizza implements Deliverable, Interface1{
    private String make;
    private String name;
    private  int quantity;
    private int price;

    public Pizza(String make, String name, int quantity, int price) {
        this.make = make;
        this.name = name;
        this.quantity = quantity; // количество
        this.price = price; // цена
    }

    @Override
    public int calcDeliveryPrice() {
        if (quantity >= 2){
            return 0;
        }
        return 300;
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    public String getMake() {
        return make;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "make='" + make + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }


}

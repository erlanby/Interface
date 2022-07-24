package interfaceLesson;

public interface Deliverable {
   static final int quantity = 5;
    int calcDeliveryPrice(); // бул метод

    private void calc(){

    }
    default void calc1(){
        System.out.println("Default");
    }
}

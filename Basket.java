public class Basket<T> {
    
    private T item;
    public T getItem() {
        return this.item;
    }

    public Basket(T f) {
        this.item = f;
    }
}

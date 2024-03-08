public class Caixa<T> {
    T item;

    public void set(T item) { this.item = item; }
    public T get() { return item; }

    public void imprimir(){
        System.out.println(item);
    }
}

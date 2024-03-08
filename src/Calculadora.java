public class Calculadora<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T maximo(T x, T y) {
        return (x.compareTo(y) > 0) ? x : y;
    }
}

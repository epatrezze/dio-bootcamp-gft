package interfacefuncional;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        Consumer<String> imprimirUmaFrase = System.out::println;
        imprimirUmaFrase.accept("Hello World");
    }
}
package interfacefuncional;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto)
                .reverse().toString();
        Function<String, Integer> converterStringParaInteriro = string -> Integer.valueOf(string) * 2;

        System.out.println(retornarNomeAoContrario.apply("socoram me subi no onibus em marrocos"));
        System.out.println(converterStringParaInteriro.apply("20"));
    }
}

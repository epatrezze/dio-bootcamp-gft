package interfacefuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Joao", "Paulo", "Oliveira", "Santos", "Instrutor", "Java"};
        Integer[] numeros = {1,2,3,4,5,6,7,8,9,0};
        imprimirNomesFiltrados(nomes);
        imprimirTodosOsNomes(nomes);
        imprimirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de Projeto");
        profissoes.add("Gerente de Qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Paulo"))
                .collect(Collectors.joining());

        System.out.println("Nomes do stream filtrado: "+nomesParaImprimirDaStream);
    }
    public static void  imprimirTodosOsNomes(String... nomes){
        for (String nome : nomes) {
            System.out.println("Imprimido pelo for: "+nome);
        }
        Stream.of(nomes)
                .forEach(System.out::println);
    }
    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros){
        for (Integer numero : numeros) {
            System.out.println(numero*2);
        }
        Stream.of(numeros).map(numero -> numero*2).forEach(System.out::println);
    }
}
package collections;

import java.util.*;

public class ExercicioSet {

    public static void main(String[] args) {

        Set<String> coresDoArcoIris = new HashSet<>(Arrays.asList("vermelho",
                "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        System.out.println(coresDoArcoIris);

        for (String cor : coresDoArcoIris) System.out.println(cor);

        System.out.println("A quantidade de cores no arco-iris: "+coresDoArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabetica: ");
        Set<String> coresTreeSet = new TreeSet<>(coresDoArcoIris);
        System.out.println(coresTreeSet);

        System.out.println("Exiba as cores em ordem inversa da que foi informada");
        Set<String> coresLinkedHashSet = new LinkedHashSet<>(Arrays.asList("vermelho",
                "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        List<String> coresList = new ArrayList<>(coresLinkedHashSet);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println("Exiba todas as cores que começam com a letra v: ");
        for (String cor: coresDoArcoIris){
            if (cor.startsWith("v")){
                System.out.println(cor);
            }
        }
        System.out.println("Remova todas as cores que começam com a letra v: ");
        Iterator<String> semV = coresDoArcoIris.iterator();
        while (semV.hasNext()){
            if (semV.next().startsWith("v")){
                semV.remove();
            }
        }
        System.out.println(coresDoArcoIris);

        System.out.println("Limpe conjunto");
        coresDoArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " +coresDoArcoIris.isEmpty());

    }

}
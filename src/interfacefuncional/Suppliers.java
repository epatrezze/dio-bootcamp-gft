package interfacefuncional;

import java.util.function.Supplier;

public class Suppliers {
    //SUPRIDORES
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = Pessoa::new;
        Supplier<Pessoa> instanciaPessoa2 = () -> new Pessoa();
        System.out.println(instanciaPessoa.get());
        System.out.println(instanciaPessoa2.get());

    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "joao";
        idade = 23;
    }
    @Override
    public String toString() {
        return String.format("nome: %s, idade: %d",nome,idade);
    }
}

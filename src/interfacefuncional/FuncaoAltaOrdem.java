package interfacefuncional;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a, b) -> a+b;
        Calculo SUBTRACAO = (a, b) -> a-b;
        Calculo DIVISAO = (a, b) -> a/b;
        Calculo MULT = (a, b) -> a*b;

        System.out.println(executaOperacao(SOMA,1,3));
        System.out.println(executaOperacao(SUBTRACAO,1,3));
        System.out.println(executaOperacao(DIVISAO,1,3));
        System.out.println(executaOperacao(MULT,1,3));

    }

    public static int executaOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }

}

@FunctionalInterface
interface Calculo{
    public int calcular(int a, int b);
}

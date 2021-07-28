package thread;

public class ThreadExemplo {
    public static void main(String[] args) {
//        Thread thread = new Thread(new BarraDeCarregamento2());
//        Thread thread2 = new Thread(new BarraDeCarregamento3());
//
//        thread.start();
//        thread2.start();
//        System.out.println("Nome da thread: " +thread.getName());
//        System.out.println("Nome da thread: " +thread2.getName());
        GerarPDF iniciarGerarPdf = new GerarPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGerarPdf);

        iniciarGerarPdf.start();
        iniciarBarraDeCarregamento.start();
    }

}

class GerarPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF gerado");
    }
}

class BarraDeCarregamento extends Thread {
    private Thread iniciarGeradorPDF;

    public BarraDeCarregamento(Thread iniciarGeradorPDF){
        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);

                if (!iniciarGeradorPDF.isAlive()){
                    break;
                }
                System.out.println("Loading...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class BarraDeCarregamento2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Rodei barra de carregamento 2: " );
    }
}

class BarraDeCarregamento3 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Rodei Barra de carregamento 3:  ");
    }
}
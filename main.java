public class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public static void main(String[] args) {
        No primeiro = new No(15);
        No segundo = new No(30);
        No terceiro = new No(45);

        primeiro.proximo = segundo;
        segundo.proximo = terceiro;

        System.out.println("Primeiro nó: " + primeiro.valor);
        System.out.println("Segundo nó: " + primeiro.proximo.valor);
        System.out.println("Terceiro nó: " + primeiro.proximo.proximo.valor);
    }
}

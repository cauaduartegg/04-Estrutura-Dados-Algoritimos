public class Principal{
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>("Números Inteiros");

        //fila.enfileirar(5);
        fila.enfileirar(4);
        fila.enfileirar(3);
        fila.enfileirar(2);
        fila.enfileirar(1);
        fila.imprimeFila();


        // QUESTAO DE PROVA CARALHO
        Integer total = 1;
        for (int i = 0; i < 4; i++){
            total *= fila.desenfileirar();
        }
        System.out.println("Total: "+ total);
    }
}
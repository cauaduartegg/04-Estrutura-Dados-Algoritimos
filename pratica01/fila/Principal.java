public class Principal{
    public static void main(String[] args) {
        Fila<String> fila = new Fila<String>("Alunos");

        fila.enfileirar("Bruno");
        fila.enfileirar("Carlos");
        fila.enfileirar("Diego");
        fila.imprimeFila();

        System.out.println("Removendo: " + fila.desenfileirar());
        //fila.imprimeFila();

        fila.enfileirar("Eduardo");
        fila.enfileirar("Fernando");
        fila.imprimeFila();

    }
}
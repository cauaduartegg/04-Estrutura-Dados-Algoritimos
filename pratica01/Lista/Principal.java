public class Principal {

    public static void main(String[] args) {

        ListaDupla<Produto> lista =
            new ListaDupla<>("Produtos");

        Produto p1 = new Produto("Teclado", 150.00);
        Produto p2 = new Produto("Mouse", 80.00);
        Produto p3 = new Produto("Monitor", 900.00);

        lista.addInicio(p1);
        lista.addFinal(p2);
        lista.addMeio(p3, 1);

        lista.imprimeLista();

        System.out.println("Dado: " + lista.removeMeio(4) + " removido!");
        //lista.imprimeLista();

        lista.addInicio(new Produto("Notebook", 2500.00));
        lista.addFinal(new Produto("Impressora", 500.00));
        lista.imprimeLista();
    }
}
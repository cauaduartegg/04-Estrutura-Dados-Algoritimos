public class Principal{
    public static void main(String[] args){
        Pilha<String> pilha = new Pilha<String>("Linguagens");


        pilha.push("Python");
        pilha.push("Rust");
        pilha.push("C#");
        pilha.imprimePilha();

        System.out.println("Removendo: " + pilha.pop());

        pilha.push("Ruby");
        pilha.push("Cobol");
        pilha.imprimePilha();

    }



}
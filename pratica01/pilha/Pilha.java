public class Pilha<T>{
    private String nomePilha;
    private No<T> topo;

    public Pilha(){
        this("");
    }

    public Pilha(String nomePilha){
        this.nomePilha = nomePilha;
        this.topo = null;
    }

    public void setNomePilha(String nomePilha){
        this.nomePilha = nomePilha;
    }

    public String getNomePilha(){
        return this.nomePilha;
    }

    public void setTopo(No<T> topo){
        this.topo = topo;
    }

    public No<T> getTopo(){
        return this.topo;
    }

    public void push(T dado){
        No<T> novoNo = new No<T>(dado);

        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    public void imprimePilha(){
        No<T> aux = topo;

        while(aux != null){
            System.err.println(aux.toString());
            aux = aux.getNextNo();
        }
    }

    public T pop(){
        if(topo == null){
            System.out.println("Pilha Vazia");
            return null;
        }

        T dado = topo.getDado();
        topo = topo.getNextNo();
        return dado;
    }
}
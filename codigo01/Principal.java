public class Principal{

    public static void main(String[] args){
        No<Pessoa> obj = new No<String>("Rafael");
        No<Pessoa> objP = new No<Pessoa>("Gabriel", 30);



        obj.setNextNo(new No("Cecília"));
        obj.getNextNo().setNextNo(new No("Joaquim"));

       // System.out.println(obj.getDado());
       // System.out.println(obj.getNextNo().getDado());
       // System.out.println(obj.getNextNo().getNextNo().getDado());

        No aux = obj;
        while (aux != null){
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
    }

}
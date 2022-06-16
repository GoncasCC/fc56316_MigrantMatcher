public class MigrantMatcherM {
    public MigrantMatcherM(){

    }

    public Migrante registoSozinho(String nome, String num){
       return  MigranteHandler.IniciaRegistoS(nome, num);
    }

    public familia registoFamilia(int n_pessoas){
        return MigranteHandler.iniciaRegistoF(n_pessoas);
    }
    
}

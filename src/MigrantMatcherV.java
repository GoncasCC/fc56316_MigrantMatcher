public class MigrantMatcherV {

    public MigrantMatcherV(){

    }
    
    public Voluntário newVol(String telemovel){
       return VoluntárioHandler.registaVoluntário(telemovel);
    }
    public Ajuda getHelp(Voluntário V ,String ajuda){
       Ajuda A = VoluntárioHandler.identificaAjuda(ajuda);
       return VoluntárioHandler.setVolAj(A, V);

    }

    public Alojamento pessoas(Alojamento a, int n_pessoas){
        return VoluntárioHandler.indicaPessoas(a, n_pessoas);
    }


    public Alojamento regiao(Alojamento a, String reg){
        return VoluntárioHandler.indicaRegiao(a, reg);
    } 

    public Item item(Item it, String dec){
        return VoluntárioHandler.indicaDescrição(it, dec);
    }


}

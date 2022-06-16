import java.util.ArrayList;

public class MigranteHandler {
    

    public static Migrante IniciaRegistoS(String nome, String num){
        Migrante m = new Migrante(nome, num, "sozinho");
        m.setF(new familia(0));
        Catalogo_migrantes_cabeças.addMigrante(m);
        return m;
    }


    public static familia iniciaRegistoF(int n_pessoas){
        return new familia(n_pessoas);
    }

    public static familia indicaCabeça(familia f, String nome, String num){
        Migrante m = new Migrante(nome, num, "familia");
        f.addCabeça(m);
        Catalogo_migrantes_cabeças.addMigrante(m);
        return f;
    }

    public static familia indicaMembro(familia f, String nome, String num){
        f.addMembro(new Migrante(nome, num, "familia"));
        return f;
    }


    public ArrayList<Ajuda> getAjudasReg(Migrante m,Regiao reg){
        ArrayList<Ajuda> list = new ArrayList<Ajuda>();
        ArrayList<Alojamento> list_alo = AlojamentosDisp.getList();
        for(int i = 0; i<list_alo.size();i++){
            if(list_alo.get(i).getReg().getNome().equals(reg.getNome()) && list_alo.get(i).getN_pessoas() > m.getF().getPessoas()){
                list.add(list_alo.get(i));
            }
        }
        for(int i = 0; i<ItemsDisp.getList().size();i++){
            list.add(ItemsDisp.getList().get(i));
        }
        return list;

    }

    public void EscolheAjuda(Migrante m, Ajuda a){
        AjudasRealizadas.add(a, m);
        AlojamentosDisp.removeAlojamento(a);
        ItemsDisp.removeItem(a);
    }


    




}

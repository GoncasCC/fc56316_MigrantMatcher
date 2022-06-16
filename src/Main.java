public class Main {
    public static void main(String[] args) {
        Lista_regioes.addRegiao("Evora");
        Lista_regioes.addRegiao("Lisboa");
        Lista_regioes.addRegiao("Porto");
        Lista_regioes.addRegiao("Sines");
        Lista_regioes.addRegiao("Braga");
        
        
        MigrantMatcherV mm = new MigrantMatcherV();
        
        
        Voluntário manel = mm.newVol("927554595");
        Voluntário diana = mm.newVol("967065931");
        Voluntário martim = mm.newVol("937654928");
        
        
        Ajuda aj_manel = mm.getHelp(manel, "alojamento");
        Ajuda aj2_manel = mm.getHelp(manel, "alojamento");
        Ajuda aj_diana = mm.getHelp(diana, "item");
        Ajuda aj_martim = mm.getHelp(martim, "alojamento");
        
        
        Alojamento al_manel = mm.regiao((mm.pessoas((Alojamento) aj_manel, 16)), "Lisboa");
        Alojamento al2_manel = mm.regiao((mm.pessoas((Alojamento) aj_manel, 10)), "Porto");
        Item it_diana = mm.item((Item) aj_diana, "Impressora 3d");
        Alojamento al_martim =mm.regiao((mm.pessoas((Alojamento) aj_martim, 4)), "Braga");

        System.out.println(AlojamentosDisp.getList().toString());
        System.out.println(ItemsDisp.getList().toString());


        


    }
}

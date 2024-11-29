import java.util.*;

public class Agence {
    private String nom;
    private ListVoitures vs;
    private Map<Client, ListVoitures> ClientVoitureLoue;
    public Agence(String nom)
    {
        this.nom = nom;
        this.vs = new ListVoitures();
        this.ClientVoitureLoue = new HashMap();
    }
    public void ajoutVoiture(Voiture v) throws VoitureException{
       if (v == null){
           throw new VoitureException("Voiture non valide");
       }else {
           vs.ajoutVoiture(v);
       }
    }
    public void suppVoiture(Voiture v)throws VoitureException{
        if (v == null){
            throw new VoitureException("Voiture non valide");
        }else {
            vs.supprimeVoiture(v);
        }
    }

    public void loueClientVoiture(Client cl, Voiture v)throws VoitureException{
        if (v == null){
            throw new VoitureException("Voiture non valide");
        }else {
           ListVoitures listv = ClientVoitureLoue.get(cl);
           if (listv == null){
               listv = new ListVoitures();
               this.suppVoiture(v);
               ClientVoitureLoue.put(cl, listv);
           }
        }
    }

    public void retourClientVoiture(Client cl , Voiture v) throws VoitureException{
        if (v == null){
            throw new VoitureException("Voiture non valide");
        }else {
            ListVoitures listv = ClientVoitureLoue.get(cl);

        }
    }

    public List<Voiture> selectVoitureSelonCritere(Critere c){
        //à completer
    }
    public Set<Client> ensembleClientsLoueurs(){
        // à completer
    }
    public Collection<ListVoitures>
    collectionVoituresLouees(){
        // à completer
    }
    public void afficheLesClientsEtLeursListesVoitures(){
        //à compléter
    }
    public Map<Client, ListVoitures> triCodeCroissant(){


        // à completer
    }
    public Map<Client, ListVoitures> triNomCroissant(){
        // à completer
    }
}
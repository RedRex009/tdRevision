import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListVoitures {
    private List<Voiture> voitures;

    public ListVoitures(List<Voiture> voitures) {
        this.voitures = new ArrayList<Voiture>();
    }

    public ListVoitures() {

    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {

        this.voitures = voitures;
    }

    public void ajoutVoiture(Voiture v) throws VoitureException {

        if (v == null) {
            throw new VoitureException("Voiture non trouvable");
        } else {
            voitures.add(v);
        }
    }

    public void supprimeVoiture(Voiture v) throws VoitureException {
        if (v == null) {
            throw new VoitureException("Voiture non trouvable");
        } else {
            voitures.remove(v);
        }
    }

    public Iterator<Voiture> iterateur() {
        return voitures.iterator();
    }

    public int size() {
        return voitures.size();
    }

    public void affiche() {
        for (int i = 0; i < voitures.size(); i++) {
            System.out.println(voitures.get(i));
        }
    }

}
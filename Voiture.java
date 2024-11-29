public class Voiture {
    private int immariculation;
    private String marque;
    private float prixLocation;

    public Voiture(int immariculation, String marque, float prixLocation) {
       this.immariculation = immariculation;
       this.marque = marque;
       this.prixLocation = prixLocation;
    }

    public int getImmariculation() {

        return immariculation;
    }

    public void setImmariculation(int immariculation) {
        this.immariculation
                = immariculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {

        this.marque = marque;
    }

    public float getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(float prixLocation) {
        this.prixLocation =
                prixLocation;

    }

    public int hashCode() {
        return immariculation + marque.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj)return true;
        if(obj==null){return false;}
        if(getClass()!=obj.getClass()){return false;}
        Voiture voiture = (Voiture) obj;
        if(voiture.immariculation==immariculation &&voiture.marque.equals(marque)){
            return true;
        }
        return super.equals(obj);
    }

    public String toString() {
        return "Voiture{" +
                "Immariculation=" + immariculation +
                ", marque='" + marque + '\'' +
                ", Prix Location='" + prixLocation + '\'' +
                '}';
    }
}
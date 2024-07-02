package fr.afpa.polymorphisme.animaux;

public class LandMammal extends Animal {

    private String furColor;

    // //Constructeur

    public LandMammal(String species, String ecosystem, String furColor) {
        super(species, ecosystem);
        this.furColor = furColor;

    }

    // getter
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @overide
    public void displayLocomotionType() {
        System.out.println("Marche/Court/Saute");
    }

    @Override
    public String getLocomotionType() {
        return "Marche/Court/Saute";
    }

    
    @Override
    public String toString() {
        return "LandMammal [furColor=" + furColor +
                ", getSpecies()=" + getSpecies() +
                ", getEcosystem()=" + getEcosystem() +
                " getLocomotionType= " +getLocomotionType() + "]";
    }

}

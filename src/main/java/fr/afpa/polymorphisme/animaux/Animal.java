package fr.afpa.polymorphisme.animaux;

/**
 * cette clase représente un animal;
 */
public abstract class Animal {
    private String species;
    private String ecosystem;

    // constructeur
    protected Animal(String species, String ecosystem) {
        this.species = species;
        this.ecosystem = ecosystem;
    }

    // getters
    public String getSpecies() {
        return species;
    }

    public String getEcosystem() {
        return ecosystem;
    }

    // setters
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }


    //
    public abstract void displayLocomotionType();

    public abstract String getLocomotionType();

}

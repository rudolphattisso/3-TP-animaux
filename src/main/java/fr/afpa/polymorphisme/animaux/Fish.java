package fr.afpa.polymorphisme.animaux;

public class  Fish extends Animal {
    
    private int preferedWaterDeph;

    //constructeur

    public Fish (String species, String ecosystem, int preferedWaterDeph){
        super(species, ecosystem);
        this.preferedWaterDeph = preferedWaterDeph;
    }



    public int getPreferedWaterDeph() {
        return preferedWaterDeph;
    }

    public void setPreferedWaterDeph(int preferedWaterDeph) {
        this.preferedWaterDeph = preferedWaterDeph;
    }

    public void  displayLocomotionType(){
        System.out.println("nage"); 
    }

    @Override
    public String getLocomotionType(){
        return "Nage";
    } 

    @Override
    public String toString() {
        return "Fish [preferedWaterDeph=" + preferedWaterDeph + ", getSpecies()=" + getSpecies() + ", getEcosystem()="
                + getEcosystem() + 
                "getLocamotionType ="+ getLocomotionType() +"]";
    }
}

    

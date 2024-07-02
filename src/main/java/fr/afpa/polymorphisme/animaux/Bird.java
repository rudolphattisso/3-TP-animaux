package fr.afpa.polymorphisme.animaux;

public class Bird  extends Animal{
    
    private int wingSpan;


    //constructeur:
    public Bird ( String species, String ecosystem, int wingSpan){
        super(species, ecosystem);
        this.wingSpan = wingSpan;
    }



    //getter
    public int getWingSpan(){
    return wingSpan;
    }
    //setter
    public void setWigspan(int wingSpan){
        this.wingSpan = wingSpan;
    }

@overide
    public void  displayLocomotionType(){
        System.out.println("vol"); 
    }

@Override
    public String getLocomotionType(){
        return "Vol";
    } 

@overide
    public String toString(){
    return "Bird [species=" + getSpecies() 
    +"ecosystem="+ getEcosystem() +
    "wingSpan="+wingSpan 
    +"getLocomotionType = " + getLocomotionType()+"]";
}
}





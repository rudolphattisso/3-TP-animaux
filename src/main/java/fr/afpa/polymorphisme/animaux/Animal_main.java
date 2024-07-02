package fr.afpa.polymorphisme.animaux;

import java.util.ArrayList;

public class Animal_main {


	public static void main(String[] args){
		LandMammal landMama1 = new LandMammal("lapin", "pleines", "white");
		Bird bird1 = new Bird("hirondelleCheval", "forêt tropicale", 12); 
		Fish fish1 = new Fish("red", "softWather", 300);

		System.out.println("les infos du lapin: "+landMama1.toString());
		System.out.println("les infos de l'oiseau sont: "+bird1.toString());
		System.out.println("les infons du poisson sont: "+fish1.toString());
 		fish1.displayLocomotionType();

		 ArrayList<Animal> animals = new ArrayList<>();
		 animals.add(bird1);
		 animals.add(landMama1);
		 animals.add(fish1);
		 
		 for (Animal animal : animals) {
			System.out.println(animal);
		 }
	}
	




}

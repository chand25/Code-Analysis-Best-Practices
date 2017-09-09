package nurseryRhymes.oldMacdonald;


public class Song {
	private String animalSound;
	public static boolean hasAnimal = false;
	
	public static final void songIntro () {
		
		System.out.println("Old MacDonald had a farm");
		pause();
		System.out.println("E - I - E - I - O");
		pause();
		System.out.println("And on that farm he had a ...");
		pause();
		System.out.println("Enter an animal to see if its on Mr. MacDonald's farm:");
	}
	
//remove duplication and extract method from songintro() to make pause() 
//use refractor tab extract method functionality to make more modular code	
	private static void pause() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Song (String animal) {
//Use equals() to compare strings instead of “==”.
//PMD picked up error and so change could be made
		if(animal.equals("chicken")) {
			hasAnimal = true;
			animalSound = Chicken.cluck();
			printSong(animal, animalSound);
		} else {
//remove part of code that had an infinite loop
//used Find bugs to see issue
			System.out.println("Sorry, Mr. Macdonald is out of " + animal + "s \n"
					+ "Try another animal...");
		}
	}
	
	void printSong (String animal, String animalSound) {
		
		System.out.println("Nice!!! He does have " + animal + "s");
		pause();
		System.out.println("E - I - E - I - O");
		pause();
		System.out.println("with a " + animalSound + " " + animalSound + " here...");
		pause();
		System.out.println(" and a " + animalSound + " " + animalSound + " there...");
		pause();
		System.out.println("  here a " + animalSound + " there a " + animalSound);
		pause();
		System.out.println("   everywhere a "  + animalSound + " " + animalSound + "!!!!!!");
		pause();
		System.out.println("    Old MacDonald had a farm");
		pause();
		System.out.println("     E - I - E - I - OoooOoOooo ");
	}
	
	
	//remove the invocation above but function for future revision
	//program runs fully without intro()
	private static void intro() {
		do{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
	}
}

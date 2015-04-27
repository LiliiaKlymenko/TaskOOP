package task2;

public class CompatibilityTest {

    public static void main(String[] args) {

	//Man man = new Man(Sex.Male, "Bond", "James", 90.7, 1.9);
	//Woman woman = new Woman(Sex.Male, "Vesper", "Lynd", 50.4, 1.80);
	
	System.out.println("First:\n");
	HomoSapiens firstPerson = HomoSapiens.createHomoSapiens(); 
	System.out.println("Second:\n");
	HomoSapiens secondPerson = HomoSapiens.createHomoSapiens(); 
	
	System.out.println("Created:\n");
	System.out.println(firstPerson.toString());
	System.out.println(secondPerson.toString());

	System.out.println("\nCompatibility test:\n");	
	compatibilityTest(firstPerson, secondPerson);
	

    }

    public static HomoSapiens compatibilityTest(HomoSapiens firstPerson, HomoSapiens secondPerson) {

	return firstPerson.hasRelation(secondPerson);

    }

}

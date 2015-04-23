package task2;

public class CompatibilityTest {

    public static void main(String[] args) {

	Man man = new Man(Sex.Male, "Bond", "James", 90.7, 1.9);
	Woman woman = new Woman(Sex.Male, "Vesper", "Lynd", 50.4, 1.80);

	System.out.println("Ceated:\n");
	System.out.println(man.toString());
	System.out.println(woman.toString());

	System.out.println("\nCompatibility test:\n");
	// compatibilityTest(woman, man);
	compatibilityTest(woman, man);
	

    }

    public static HomoSapiens compatibilityTest(Woman woman, Man man) {

	return man.hasRelation(woman);

    }

}

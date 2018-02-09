import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice {
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * 
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Set<String> set, String... values) {
		// add all the values to the set.
		// print each one as you add it
		for (String arg : values) {
			set.add(arg);
		}
	}

	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Set<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String animal = iter.next();
			System.out.println(animal + " ");
		}
	}

	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer(Collection<String> set) {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		Set<String> Hset = new HashSet<String>();
		addAll(Hset, "elephant", "dog", "ant", "bird", "cat");

		// 2. Print elements in the set using an Iterator over the Set.
		// You're going to need to do this again, so write a method print(Set set) to do
		// it.
		print(Hset);

		// 3. are the elements printed in same order than you added them?
		// What does this tell you about Sets?

		// 4. Remove all the elements from the set, using a method that
		// defined in Set (and Collection). What is the method to use?
		Hset.clear();

		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		addAll(Hset, "elephant", "dog", "bird", "ant", "cat");

		// 6. Print the elements in the set. Is the order same as before?
		print(Hset);

		// 7. Add duplicate elements to the set. Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		System.out.println("Add duplicate items to the set ");
		addAll(Hset, "cat", "dog");

		// 8. Print the elements in set. Are there any duplicates?
		// What property of Set does this demonstrate?
		System.out.println("Set contains: ");
		print(Hset);

		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		// What is different when you use TreeSet?
		Set<String> tset = new HashSet<String>();
		addAll(tset, "dog", "ant", "bird", "elephant", "cat");
		System.out.println("TSet contains: ");
		print(tset);

		// Hint: Use Polymorphism. Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		};
		// 10. Repeat again using TreeSet with a Comparator.
	}

	public static void main(String[] args) {
		List<String> set = new ArrayList<>();
		setExplorer(set);
	}

}

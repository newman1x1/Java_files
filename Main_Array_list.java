import java.util.ArrayList;

public class Main_Array_list {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Display the ArrayList
        System.out.println("ArrayList: " + list);

     // Get an element from the ArrayList
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Update an element in the ArrayList
        list.set(1, "Blueberry");
        System.out.println("Updated ArrayList: " + list);

        // Remove an element from the ArrayList
        list.remove("Apple");
        System.out.println("ArrayList after removal: " + list);

        // Check if an element exists in the ArrayList
        boolean contains = list.contains("Cherry");
        System.out.println("Contains 'Cherry': " + contains);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size);

        // Clear the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}
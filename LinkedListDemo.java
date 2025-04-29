import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
public static void main(String[] args) {
// create
LinkedList<String> list = new LinkedList<>();
// isEmpty, add(E e)
System.out.println("Empty ? " + list.isEmpty());
list.add("A");
list.add("B");
list.add("C");
System.out.println("After adds: " + list);
// add(int index, E element)
list.add(1, "X");
System.out.println("After add(1, X): " + list);
// get(int index)
System.out.println("Element at 2: " + list.get(2));
// set(int index, E element)
list.set(2, "Y");
System.out.println("After set(2, Y): " + list);
// remove(int index)
String removedByIndex = list.remove(3);
System.out.println("Removed at 3 (" + removedByIndex + "): " + list);
// remove(Object o)
boolean removedObject = list.remove("X");
System.out.println("Removed \"X\"? " + removedObject + ": " + list);
// size()
System.out.println("Size: " + list.size());
// contains(Object o)
System.out.println("Contains B? " + list.contains("B"));
System.out.println("Contains Z? " + list.contains("Z"));
// indexOf(Object o), lastIndexOf(Object o)
list.add("A"); // duplicate
System.out.println("List now: " + list);
System.out.println("First index of A: " + list.indexOf("A"));
System.out.println("Last index of A: " + list.lastIndexOf("A"));
// toArray()
Object[] arr = list.toArray();
System.out.print("Array: ");
for (Object o : arr) {
System.out.print(o + " ");
}
System.out.println();
// clone()
 @SuppressWarnings("unchecked")
LinkedList<String> copy = (LinkedList<String>) list.clone();
System.out.println("Cloned list: " + copy);
// subList(int from, int to)
List<String> slice = list.subList(1, 3);
System.out.println("SubList(1,3): " + slice);
// clear()
list.clear();
System.out.println("After clear, empty? " + list.isEmpty());
}
}
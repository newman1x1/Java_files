import java.io.*;
import java.util.*;
public class ExceptionHandlingAll {
public static void main(String[] args) {
try {
int negativeAge = -5;
if (negativeAge < 0) {
throw new IllegalArgumentException("Age cannot be negative");
}
//IllegalStateException
List<String> list = new ArrayList<>();
list.add("Item 1");
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
iterator.next();
iterator.remove(); // IllegalStateException if remove() called without next()
}
// FileNotFoundException
File file = new File("nonexistent.txt");
FileReader fr = new FileReader(file);
// IOException
BufferedReader br = new BufferedReader(new FileReader("file.txt"));
String line;
while ((line = br.readLine()) != null) {
// processing file content
}
br.close();
// InterruptedException
Thread.sleep(1000);
// NoSuchElementException
Set<String> set = new HashSet<>();
Iterator<String> setIterator = set.iterator();
setIterator.next(); // NoSuchElementException if set is empty
//ArithmeticException
int result = 5 / 0;
// NullPointerException
String str = null;
 int length = str.length();
// ArrayIndexOutOfBoundsException
int[] arr = new int[5];
int index = arr[10];
// StringIndexOutOfBoundsException
String text = "example";
char ch = text.charAt(10);
// NumberFormatException
String notANumber = "abc";
int number = Integer.parseInt(notANumber);
// ClassCastException
Object obj = new Integer(100);
String castedString = (String) obj;
} catch (IllegalArgumentException e) {
System.out.println("IllegalArgumentException caught: " + e.getMessage());
} catch (IllegalStateException e) {
System.out.println("IllegalStateException caught: " + e.getMessage());
} catch (FileNotFoundException e) {
System.out.println("FileNotFoundException caught: " + e.getMessage());
} catch (IOException e) {
System.out.println("IOException caught: " + e.getMessage());
} catch (InterruptedException e) {
System.out.println("InterruptedException caught: " + e.getMessage());
} catch (NoSuchElementException e) {
System.out.println("NoSuchElementException caught: " + e.getMessage());
} catch (ArithmeticException e) {
System.out.println("ArithmeticException caught: " + e.getMessage());
} catch (NullPointerException e) {
System.out.println("NullPointerException caught: " + e.getMessage());
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
} catch (StringIndexOutOfBoundsException e) {
System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
} catch (ClassCastException e) {
System.out.println("ClassCastException caught: " + e.getMessage());
}
}
}
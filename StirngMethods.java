public class StirngMethods {
    public static void main(String[] args) {
        // Create a StringBuffer instance
        StringBuffer sb = new StringBuffer("Hello");

        // append() - Adds the given string to the end of the StringBuffer
        sb.append(" World!");
        System.out.println("After append: " + sb); // Output: Hello World!

        // insert() - Inserts the given string at the specified index
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb); // Output: Hello Beautiful World!

        // delete() - Deletes a substring from the StringBuffer between the specified indices
        sb.delete(6, 16);
        System.out.println("After delete: " + sb); // Output: Hello World!

        // reverse() - Reverses the characters in the StringBuffer
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: !dlroW olleH

        // replace() - Replaces a portion of the string with the specified string
        sb.replace(0, 6, "Java");
        System.out.println("After replace: " + sb); // Output: Java olleH

        // setLength() - Sets the length of the StringBuffer
        sb.setLength(4);
        System.out.println("After setLength: " + sb); // Output: Java

        // capacity() - Returns the current capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity()); // Output: 16 (default capacity)

        // charAt() - Returns the character at a specified index
        System.out.println("Character at index 1: " + sb.charAt(1)); // Output: a

        // ensureCapacity() - Ensures that the capacity is at least the specified value
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity()); // Output: 50
    }
}
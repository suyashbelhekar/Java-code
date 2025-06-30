 public class CopyofArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[5];

        for (int i = 0; i < 5; i++) {
            copy[i] = original[i];
        }
        System.out.println("Copied Array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}

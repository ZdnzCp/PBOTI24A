import java.util.ArrayDeque;

public class ContohArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> antrian = new ArrayDeque<>();

        antrian.addLast("Ferdi");
        antrian.addLast("Budi");
        antrian.addLast("Siti");
        antrian.addFirst("Andi");

        System.out.println("Isi antrian: " + antrian);
        System.out.println("Depan antrian: " + antrian.peekFirst());
        System.out.println("Belakang antrian: " + antrian.peekLast());
        String terlayani = antrian.pollFirst();
        System.out.println("Yang dilayani: " + terlayani);
        System.out.println("Isi antrian setelah dilayani: " + antrian);
        System.out.println("\n--- Simulasi Stack ---");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Isi stack: " + stack);
        System.out.println("Elemen teratas dikeluarkan: " + stack.pop());
        System.out.println("Isi stack setelah pop: " + stack);
    }
}
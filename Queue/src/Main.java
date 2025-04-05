import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kuyruğun boyutunu girin: ");
        int size = scanner.nextInt();

        Queue queue = new Queue(size);

        while (true) {
            System.out.println("\n1. Kuyruğa Eleman Ekle");
            System.out.println("2. Kuyruktan Eleman Çıkar");
            System.out.println("3. Kuyruğun Başındaki Elemanı Gör");
            System.out.println("4. Kuyruğun Durumunu Yazdır");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Kuyruğa eklemek istediğiniz sayıyı girin: ");
                    int data = scanner.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    int dequeuedValue = queue.dequeue();
                    if (dequeuedValue != -1) {
                        System.out.println("Çıkarılan eleman: " + dequeuedValue);
                    }
                    break;
                case 3:
                    int peekValue = queue.peek();
                    if (peekValue != -1) {
                        System.out.println("Kuyruğun başındaki eleman: " + peekValue);
                    }
                    break;
                case 4:
                    queue.printQueue();
                    break;
                case 5:
                    System.out.println("Çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçenek! Lütfen tekrar deneyin.");
            }
        }
    }
}

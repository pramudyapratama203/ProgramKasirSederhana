import java.util.Scanner;

public class programkasir {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih, jumlah;
        double diskon,total;
        String jenis, kartuMember;
        pilih = 0;
        total = 0;
        

        // Untuk kartu member
        String ya = "Yes";
        String tidak = "No";
         
        // Untuk case 1
        String Ayam = "1";
        String Kambing = "2";

        // Untuk case 2
        String laukChicken = "1";
        String laukEmpal = "2";

        // Untuk case 3
        String laukTahu = "1";
        String laukTelor = "2";
        String laukAyam = "3";
        

        
        do{
            
            System.out.println("==========================================");
            System.out.println("Program Kasir Warung Sederhana");
            System.out.println("\n1. Sate");
            System.out.println("  a. Ayam [Rp.1.500] per tusuk");
            System.out.println("  b. Kambing [Rp.3.000] per tusuk");
            System.out.println("\n2. Pecel");
            System.out.println("  a. Lauk ayam [Rp.13.000] per porsi");
            System.out.println("  b. Lauk empal [Rp.15.000] per porsi");
            System.out.println("\n3. Penyetan");
            System.out.println("  a. Lauk tahu/tempe [Rp.5.000] per porsi");
            System.out.println("  b. Lauk telur [Rp.7.000] per porsi");
            System.out.println("  c. Lauk ayam [Rp.10.000] per porsi");
            System.out.print("\nPilih menu makanan yang diinginkan = "); pilih=sc.nextInt();
            System.out.println("==========================================");

            switch (pilih) {
                case 1:
                System.out.println("\nSate");
                System.out.println("Pilih jenis sate yang diinginkan \n1. Ayam\n2. Kambing");
                System.out.print("(1/2) = "); jenis=sc.next();
                if (jenis.equals(Ayam)){
                    System.out.print("Berapa jumlah sate ayam yang ingin dibeli = "); jumlah=sc.nextInt();
                    total = jumlah * 1500;
                } else if (jenis.equals(Kambing)){
                    System.out.print("Berapa jumlah sate kambing yang ingin dibeli = "); jumlah=sc.nextInt();
                    total = jumlah * 3000;
                }
                System.out.println("\n==========================================");
                System.out.println("Apakah anda memiliki kartu member? Jika ada anda akan mendapatkan diskon 5%");
                System.out.print("Yes/No = "); kartuMember=sc.next();
                if (kartuMember.equals(ya)) {
                    diskon = 0.05 * total;
                    total = total - diskon;
                } else {
                    diskon = 0 * total;
                    total = total - diskon;
                }
                System.out.println("\nTotal Harga adalah " + total);
                System.out.println("Terima kasih sudah belanja :D");
                System.out.println("==========================================");
                break;

                case 2:
                System.out.println("\nPecel");
                System.out.println("Pilih jenis pecel yang diinginkan \n1.Lauk Ayam\n2. Lauk Empal"); 
                System.out.print("(1/2) = "); jenis=sc.next();
                if (jenis.equals(laukChicken)) {
                    System.out.print("Berapa jumlah lauk ayam yang ingin dibeli = "); jumlah=sc.nextInt();
                    total = jumlah * 13000;
                } else if(jenis.equals(laukEmpal)) {
                    System.out.print("Berapa jumlah lauk empal yang ingin dibeli = "); jumlah=sc.nextInt();
                    total = jumlah * 15000;
                }
                System.out.println("\n==========================================");
                System.out.println("Apakah anda memiliki kartu member? Jika ada anda akan mendapatkan diskon 5%");
                System.out.print("Yes/No = "); kartuMember=sc.next();
                System.out.println("\n==========================================");
                System.out.println("Apakah anda memiliki kartu member? Jika ada anda akan mendapatkan diskon 5%");
                System.out.print("Yes/No = "); kartuMember=sc.next();
                if (kartuMember.equals(ya)) {
                    diskon = 0.05 * total;
                    total = total - diskon;
                } else {
                    diskon = 0 * total;
                    total = total - diskon;
                }
                System.out.println("\nTotal Harga adalah " + total);
                System.out.println("Terima kasih sudah belanja :D");
                System.out.println("==========================================");
                break;
                
                case 3:
                System.out.println("\nPenyetan");
                System.out.println("Pilih jenis penyetan yang diinginkan \n1. Lauk tahu\n2. Lauk Telur\n3. Lauk Ayam");  
                System.out.print("(1/2/3) = "); jenis=sc.next();
                if (jenis.equals(laukTahu)){
                    System.out.print("Berapa jumlah lauk tahu yang ingin dibeli = "); jumlah=sc.nextInt();
                    total = jumlah * 5000;
                } else if (jenis.equals(laukTelor)){
                    System.out.print("Berapa jumlah lauk telur yang ingin dibeli = "); jumlah=sc.nextInt();
                    total = jumlah * 7000;
                } else if (jenis.equals(laukAyam)){
                    System.out.print("Berapa jumlah lauk ayam yang ingin dibeli = "); jumlah=sc.nextInt();
                    total = jumlah * 10000;
                }
                System.out.println("\n==========================================");
                System.out.println("Apakah anda memiliki kartu member? Jika ada anda akan mendapatkan diskon 5%");
                System.out.print("Yes/No = "); kartuMember=sc.next();
                if (kartuMember.equals(ya)) {
                    diskon = 0.05 * total;
                    total = total - diskon;
                } else {
                    diskon = 0 * total;
                    total = total - diskon;
                }
                System.out.println("\nTotal harga adalah " + total);
                System.out.println("Terima kasih sudah belanja :D");
                System.out.println("==========================================");
                break;     

                default:
                System.out.println("Pilihan Zonk :()");
                break;

                
            }

        }while(pilih!=4);

        
               
       
    }
}

/*
 Putu Pramudya Pratama
 24082010113
 1C
 */

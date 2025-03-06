import java.util.Scanner;
import java.util.Random;

public class KeuanganPribadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        // Input data pengguna
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();
        
        System.out.print("Masukkan Jumlah Uang yang Dimiliki: ");
        double saldoAwal = input.nextDouble();
        int saldo = (int) saldoAwal;
        
        System.out.print("Masukkan Rata-rata Pengeluaran Harian: ");
        double pengeluaran = input.nextDouble();
        
        // Perhitungan keuangan
        double sisaSaldo = saldo - (pengeluaran * 30);
        double lamaBertahan = saldo / (pengeluaran * 30);
        String kondisiKeuangan;
        
        if (lamaBertahan < 1) {
            kondisiKeuangan = "PERINGATAN: Keuangan Anda kurang stabil!";
        } else if (lamaBertahan > 6) {
            kondisiKeuangan = "Keuangan Anda dalam kondisi aman.";
        } else {
            kondisiKeuangan = "Keuangan Anda cukup stabil.";
        }
        
        // Evaluasi kondisi keuangan berdasarkan usia dan saldo
        boolean lebihDari30 = usia > 30;
        boolean stabil = (usia > 30) && (saldo > 10_000_000);
        boolean aman = (usia < 30) || (saldo > 5_000_000);
        
        System.out.println("\nApakah usia lebih dari 30? " + lebihDari30);
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + stabil);
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + aman);
        
        // Input hutang dan perhitungan tambahan
        System.out.print("Masukkan jumlah hutang: ");
        double hutang = input.nextDouble();
        double hutangAbsolut = Math.abs(hutang);
        double pengeluaranBulat = Math.ceil(pengeluaran);
        int bonus = 100000 + rand.nextInt(901000);
        
        double saldoAkhir = sisaSaldo + bonus;
        
        // Laporan keuangan
        System.out.println("\n=== LAPORAN KEUANGAN PRIBADI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Saldo awal: Rp" + saldo);
        System.out.println("Pengeluaran harian rata-rata: Rp" + (int)pengeluaran);
        System.out.println("Sisa saldo dalam 30 hari: Rp" + (int)sisaSaldo);
        System.out.printf("Estimasi bulan bertahan: %.1f bulan\n", lamaBertahan);
        System.out.println("Status Keuangan: " + kondisiKeuangan);
        System.out.println("Hutang yang dimiliki: Rp" + (int)hutangAbsolut);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + (int)pengeluaranBulat);
        System.out.println("Bonus tak terduga: Rp" + bonus);
        System.out.println("Saldo setelah pengeluaran dan bonus: Rp" + (int)saldoAkhir);
        
        input.close();
    }
}

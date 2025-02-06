import java.util.Scanner;

public class TP1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("\n  ____             _                 _____         _ _       \r\n" +
                " |  _ \\           | |               |  __ \\       | (_)      \r\n" +
                " | |_) |_   _ _ __| |__   __ _ _ __ | |__) |__  __| |_  __ _ \r\n" +
                " |  _ <| | | | '__| '_ \\ / _` | '_ \\|  ___/ _ \\/ _` | |/ _` |\r\n" +
                " | |_) | |_| | |  | | | | (_| | | | | |  |  __/ (_| | | (_| |\r\n" +
                " |____/ \\__,_|_|  |_| |_|\\__,_|_| |_|_|   \\___|\\__,_|_|\\__,_|\r\n" +
                "                                                             \r\n" +
                "                                                             ");
        System.out.println("=============================================================");
        System.out.println("============== Selamat datang di Burhanpedia! ===============");
        System.out.println("=============================================================");

        // opsi penjual

        System.out.print("Masukkan stok awal: "); //print perintah
        Scanner inputstockAwal = new Scanner(System.in); //minta input stock awal
        int stock_Awal = inputstockAwal.nextInt();//meletakan data dari scanner input stock awal ke dalam variabel int
        

        System.out.print("Masukkan harga barang: "); //print perintah
        Scanner inputhargaBarang = new Scanner(System.in);//minta input harga barang
        int harga_Barang = inputhargaBarang.nextInt();//meletakan data dari scanner input harga barang ke dalam variabel int
        

        System.out.print("Masukkan saldo awal: "); //print perintah
        Scanner inputsaldoAwal = new Scanner(System.in);//minta input saldo awal
        int saldo_Awal = inputsaldoAwal.nextInt();//meletakan data dari scanner input saldo awal ke dalam variabel int


        String menuPenjual = "\n===== MENU PENJUAL =====\r\n" + //
                            "1. Cek Stok\r\n" + //
                            "2. Cek Harga Barang\r\n" + //
                            "3. Tambah Stok\r\n" + //
                            "4. Ubah Harga Barang\r\n" + //
                            "5. Generate Voucher\r\n" + //
                            "6. Kirim Barang\r\n" + //
                            "7. Lihat Laporan Pendapatan\r\n" + //
                            "8. Kembali ke menu utama\r";
        
        String menuPembeli = "\n===== MENU PEMBELI =====\r\n" + //
                            "1. Cek Saldo\r\n" + //
                            "2. Top Up Saldo\r\n" + //
                            "3. Cek Harga Barang\r\n" + //
                            "4. Beli Barang\r\n" + //
                            "5. Generate Voucher\r\n" + //
                            "6. Lacak Barang\r\n" + //
                            "7. Lihat Laporan Pengeluaran\r\n" + //
                            "8. Kembali ke menu utama\r";
        String pesanKeluar ="===========================================\r\n" + //
                            "Terima kasih telah menggunakan Burhanpedia!\r\n" +//
                            "===========================================";

        boolean flag = true;



       while (flag) {
            // print out menu
            System.out.println(
                "Pilih menu\r\n" + //
                "1. Penjual\r\n" + //
                "2. Pembeli\r\n" + //
                "3. Hari Selanjutnya\r\n" + //
                "4. Keluar\r"
            );
            // print out perintah
            System.out.print("Perintah : ");
            Scanner inputPerintah =new Scanner(System.in);
            int perintah = inputPerintah.nextInt();


            // mulai dengan main menu/program

            if (perintah == 1){ //kondisi perintah == 1
                boolean flag1 = true; //set flag khusus untuk loop pada menu penjual

                while (flag1) { //nasted loop
                    
                    System.out.println(menuPenjual);
                    System.out.print("Perintah : ");
                    Scanner inputPerintahMenuPenjual =new Scanner(System.in);
                    int perintahMenuPenjual  = inputPerintahMenuPenjual.nextInt();

                    //memakai switch case agar lebih efisien dan mudah daripada harus menggunakan if else yang mempunyai statment didalamnya
                    switch (perintahMenuPenjual) {
                        case 1:
                            System.out.println(
                            "===========================================\r\n" +
                            "Stok saat ini: "+ stock_Awal +
                            "\n==========================================="+ "\n");
                            break;
                        case 2:
                            //ptint out hasil
                            System.out.println(
                            "===========================================\r\n" +
                            "Harga barang saat ini: " + harga_Barang +
                            "\n==========================================="+ "\n");
                            break;
                        case 3:

                            System.out.print("Masukkan jumlah stok yang ingin ditambah: "); //print perintah
                            Scanner tambahStock = new Scanner(System.in); //minta input
                            int stockBaru = tambahStock.nextInt();
                            stock_Awal += stockBaru; //tambahkan stock awal dengan nilai input baru dari tambahStock
                             //print out hasilnya
                            System.out.println(
                            "===========================================\r\n" +
                            "Stok berhasil ditambah! Stok saat ini: "+ stock_Awal +
                            "\n==========================================="+ "\n");
                            break;
                        case 4:
                            System.out.print("Masukkan harga barang yang baru: ");
                            Scanner ubahHarga = new Scanner(System.in);
                            int hargaBaru = ubahHarga.nextInt();
                            harga_Barang = hargaBaru;
                            // print out hasil 
                            System.out.println(
                            "===========================================\r\n" +
                            "Harga barang diperbarui: "+ harga_Barang +
                            "\n==========================================="+ "\n");
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            flag1 = false; //set flag1 jadi flase agar keluar ke while besar
                            break;
                        default:
                            System.out.println("Pilihan Tidak Valid" + "\n");
                            break;
                    }
                }
            }
            if (perintah == 2) {
                System.out.println(menuPembeli);
                System.out.println("Perintah : ");
                Scanner inputPerintahMenuPembeli =new Scanner(System.in);
                int perintahMenuPembeli = inputPerintahMenuPembeli.nextInt();
            }
            if (perintah == 3) {
                System.out.println("Tanggal : Selasa, 4 Februari 2025\r\n" + //
                                    "Hari telah berganti. Barang sudah sampai!\r");
            }
            if (perintah == 4){
                System.out.println(pesanKeluar);
                flag = false;
            }
            else{
                System.out.println("Pilihan tidak valid!\r");
            }
       }

        
        

        

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int islemTipi;
        double miktar = 0, bakiye = 1000;
        int TcNo = 1234567890;
        int sifre = 1234;
        int TcNoGirilen;
        int girilenSifre = 0;

        System.out.println("Yapi Kredi Bankasina hosgeldiniz");
        while (true) {
            System.out.println("TC kimlik numaranizi giriniz : ");
            TcNoGirilen = sc.nextInt();
            System.out.println("Sifrenizi giriniz : ");
            girilenSifre = sc.nextInt();

            if (TcNoGirilen == TcNo && girilenSifre == sifre) {
                while (bakiye > 0 && (girilenSifre == sifre) && (TcNoGirilen == TcNo)) {
                    System.out.println("Guncel bakiyeniz = " + bakiye + " TL");
                    System.out.println();
                    System.out.println("Lutfen yapmak istediginiz islemi seciniz");
                    System.out.println("1-Para yatirma");
                    System.out.println("2-Para cekme");
                    System.out.println("3-Bakiye sorgulama");
                    System.out.println("4-Cikis yapma");
                    islemTipi = sc.nextInt();

                    if (islemTipi == 1) {
                        System.out.println("Yatirmak istediginiz miktari giriniz :");
                        miktar = sc.nextDouble();
                        if (miktar > 0) {
                            bakiye = bakiye + miktar;
                            System.out.println("Bakiyeniz = " + bakiye);
                        } else {
                            System.out.println("Eksi deger giremezsiniz.Lutfen tekrar deneyiniz");
                        }

                    } else if (islemTipi == 2) {
                        System.out.println("Cekmek istediginiz miktari giriniz : ");
                        miktar = sc.nextDouble();
                        if (miktar > bakiye) {
                            System.out.println("Hesabinizda cekmek istediginiz miktar kadar para bulunmamaktadir");
                        } else if (miktar < 0) {
                            System.out.println("Eksi deger giremezsiniz.Lutfen tekrar deneyiniz");
                        } else {
                            bakiye = bakiye - miktar;
                            System.out.println("Bakiyeniz = " + bakiye);
                        }
                    } else if (islemTipi == 3) {
                        System.out.println("Hesabinizin bakiyesi = " + bakiye + " TL");

                    } else if (islemTipi == 4) {
                        System.out.println("Cikis yapiliyor...");
                        break;
                    } else {
                        System.out.println("Gecersiz bir tuslama yaptiniz.Lutfen tekrar deneyiniz!!!");
                    }

                }
                System.out.println("Tekrar bekleriz");
                break;
            } else
                System.out.println("TC kimlik numaraniz veya sifreniz yanlis.Lutfrn tekrar deneyiniz");


        }


    }
}
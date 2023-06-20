
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Dizinin Uzunluğunu Girin : ");
        int uzunluk = scanner.nextInt();
        
        int [] arrays = new int[uzunluk];
        
        for(int i=0;i<uzunluk;i++){
            System.out.print("Lütfen Dizinin " + (i+1) + ". Elemanını girin : ");
            int eleman = scanner.nextInt();
            arrays[i]=eleman;
        }
        
        
        //Girilen dizi için maksimum ve minimum değerleri hesaplamaktadır.
        int min = arrays[0];
        int max = arrays[0];
        
        for (int i : arrays) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
        
        
        
        //Kullanıcıdan alınan değer için en yakın maksimum ve minumum değerleri hesaplamaktadır.
        System.out.print("Lütfen Sorgulamak İstediğiniz Değeri Girin : ");
        int deger = scanner.nextInt();
        
        Arrays.sort(arrays);
        
        int enBuyukEnYakin = Integer.MAX_VALUE;
        int enKucukEnYakin = Integer.MIN_VALUE;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < deger) {
                enKucukEnYakin = arrays[i];
            } else if (arrays[i] > deger) {
                enBuyukEnYakin = arrays[i];
                break; // İlk büyük sayıyı bulduğumuzda döngüyü sonlandır
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukEnYakin);
    }
    
}

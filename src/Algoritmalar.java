public class Algoritmalar {

    public static int  binarySearch(int[] dizi, int hedef){


        int low = 0;
        int high = dizi.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (dizi[mid] == hedef) {
                return mid;
            }
            if (dizi[mid] < hedef) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] sayilar = {10, 20, 30, 40, 50, 60};

        int hedef = 60;
        int sonuc = binarySearch(sayilar, hedef);
        System.out.println("ededin indeksi " + sonuc);


    }
}


package hızlısıralama;

import java.util.Arrays;

public class HizliSiralama {
    int[] arr = {1,2,6,-6,21,345,53,-12,-122,-15};
        void quickSort(int[] a, int altindis, int üstindis) {
            int i = altindis, j = üstindis, h;

            int x = a[(altindis + üstindis) / 2];
            do {
                while (a[i] < x)
                    i++;
                while (a[j] > x)
                    j--;
                if (i <= j) {
                    h = a[i];
                    a[i] = a[j];
                    a[j] = h;
                    i++;
                    j--;
                }
            } while (i <= j);
            // yinelge (recursion)
            if (altindis < j)
                quickSort(a, altindis, j);
            if (i < üstindis)
                quickSort(a, i, üstindis);
        }
        public static void main(String[] args) {
            HizliSiralama qs = new HizliSiralama();
            System.out.println("Sıralamadan önce: ");
            System.out.println(Arrays.toString(qs.arr));
            qs.quickSort(qs.arr, 0, 9);
            System.out.println("Sıralamadan sonra:");
            System.out.println(Arrays.toString(qs.arr));
        }

    }

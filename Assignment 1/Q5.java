import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        int n;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the array, N=");
        n = scanner.nextInt();
        array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array);
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void sort(int[] array) {
        mergeSort(array, 0, (array.length - 1));
    }

    static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, (middle + 1), right);
            merge(array, left, middle, right);
        }
    }

    static void merge(int[] array, int left, int middle, int right) {
        int[] leftArray = Arrays.copyOfRange(array, left, (middle+1));
        int[] rightArray = Arrays.copyOfRange(array, (middle + 1), (right+1));

        int leftIndex = 0;
        int rightIndex = 0;
        int currIndex = left;

        while(leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] >= rightArray[rightIndex]){
                array[currIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[currIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currIndex++;
        }

        while (leftIndex < leftArray.length) {
            array[currIndex] = leftArray[leftIndex];
            currIndex++;
            leftIndex++;
        }

        while (rightIndex < rightArray.length) {
            array[currIndex] = rightArray[rightIndex];
            currIndex++;
            rightIndex++;
        }
    }
}

public class SortExample {
    public static void main(String[] args) {
        int[] numbers = { 40, 7, 59, 4, 1 };
    
        // Bubble Sort
        int[] bubbleSortNumbers = numbers.clone(); 
        System.out.println("Original values for Bubble Sort:");
        displayValues(bubbleSortNumbers);
        long startTime = System.nanoTime();
        bubbleSort(bubbleSortNumbers);
        long endTime = System.nanoTime();
        System.out.println("Sorted values using Bubble Sort:");
        displayValues(bubbleSortNumbers);
        System.out.println("Bubble Sort execution time: " + (endTime - startTime) + " nanoseconds\n");
    
        // Merge Sort
        int[] mergeSortNumbers = numbers.clone();
        System.out.println("Original values for Merge Sort:");
        displayValues(mergeSortNumbers);
        startTime = System.nanoTime();
        mergeSort(mergeSortNumbers, 0, mergeSortNumbers.length - 1);
        endTime = System.nanoTime();
        System.out.println("Sorted values using Merge Sort:");
        displayValues(mergeSortNumbers);
        System.out.println("Merge Sort execution time: " + (endTime - startTime) + " nanoseconds\n");
    
        // Selection Sort
        int[] selectionSortNumbers = numbers.clone();
        System.out.println("Original values for Selection Sort:");
        displayValues(selectionSortNumbers);
        startTime = System.nanoTime();
        selectionSort(selectionSortNumbers);
        endTime = System.nanoTime();
        System.out.println("Sorted values using Selection Sort:");
        displayValues(selectionSortNumbers);
        System.out.println("Selection Sort execution time: " + (endTime - startTime) + " nanoseconds\n");
    }

    static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            // Print array after each pass
            System.out.print("Bubble Sort - Pass " + (i + 1) + ": ");
            displayValues(numbers);
        }
    }

    static void mergeSort(int[] numbers, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
    
            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);
    
            merge(numbers, left, mid, right);
    
            // Print array after merging
            System.out.print("Merge Sort - Merged [" + left + ", " + right + "]: ");
            displayValues(numbers);
        }
    }
    
    static void merge(int[] numbers, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
    
        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
    
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = numbers[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = numbers[mid + 1 + j];
        }
    
        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                numbers[k] = leftArray[i];
                i++;
            } else {
                numbers[k] = rightArray[j];
                j++;
            }
            k++;
        }
    
        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            numbers[k] = leftArray[i];
            i++;
            k++;
        }
    
        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            numbers[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
    static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexMin]) {
                    indexMin = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
    
            // Print array after each pass
            System.out.print("Selection Sort - Pass " + (i + 1) + ": ");
            displayValues(numbers);
        }
    }

    static void displayValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        } // endfor
        System.out.println("\n");
    }// end method displayValues
}// end class SearchExample
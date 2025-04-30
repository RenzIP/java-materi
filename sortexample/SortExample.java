public class SortExample {
    public static void main(String[] args) {
        int[] numbers = { 40, 7, 59, 4, 1 };
        displayValues(numbers);
        selectionSort(numbers);
        System.out.println("Sorted values:");
        displayValues(numbers);
        bubbleSort(numbers);
    }// end method main

    static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                // if the numbers are not in order
                if (numbers[j] > numbers[j + 1]) {
                    // swap the numbers
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                } // endif
            } // endfor
        } // endfor
    }// end method bubbleSort

    static void selectionSort(int[] numbers) {
        int indexMin = 0; // the index of the smallest number
        for (int i = 0; i < numbers.length; i++) {
            indexMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexMin]) {// if we find a smaller int,
                    indexMin = j; // set it as the min
                } // endif
            } // endforp
              // we have the index of the smallest int and can swap the values
            int temp = numbers[i]; // use temp to store the value
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        } // endfor
    }// end method selectionSort

    static void displayValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        } // endfor
        System.out.println("\n");
    }// end method displayValues
}// end class SearchExample
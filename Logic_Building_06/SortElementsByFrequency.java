import java.util.*;

public class SortElementsByFrequency {

    public static int[] sortByFrequency(int[] arr) {
        // Step 1: Create a map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a custom comparator to sort elements based on their frequencies
        Comparator<Integer> frequencyComparator = (num1, num2) -> {
            int freqCompare = frequencyMap.get(num2) - frequencyMap.get(num1);
            if (freqCompare == 0) {
                return num1 - num2; // If frequencies are equal, sort by value
            }
            return freqCompare;
        };

        // Step 3: Sort the elements using the custom comparator
        Integer[] arrInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrInteger, frequencyComparator);

        // Step 4: Convert Integer array back to int array
        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < arrInteger.length; i++) {
            sortedArray[i] = arrInteger[i];
        }

        // Step 5: Return the sorted array
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 4, 1, 4, 3, 5, 2, 5};
        int[] sortedArray = sortByFrequency(arr);

        System.out.println("Sorted array by frequency:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}

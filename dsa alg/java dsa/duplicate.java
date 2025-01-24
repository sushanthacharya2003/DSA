import java.util.HashSet;

public class duplicate { // Declaring the class
    public static boolean contains_duplicate(int[] nums) { // Method to check for duplicates
        HashSet<Integer> set = new HashSet<>(); // Create a HashSet to track seen numbers
        for (int num : nums) { // Iterate through each number in the array
            if (set.contains(num)) { // Check if the number is already in the set
                return true; // Duplicate found, return true
            }
            set.add(num); // Add the number to the set
        }
        return false; // No duplicates found, return false
    }

    public static void main(String[] args) { // Main method
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 }; // Initialize the array
        System.out.println("The array contains duplicates: " + duplicate.contains_duplicate(nums)); // Print the result
    }
}
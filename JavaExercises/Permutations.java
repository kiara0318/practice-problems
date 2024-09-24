import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    
    public static void main(String[] args) {
        // Initialize the list of elements to permute
        List<String> elements = Arrays.asList("a", "b", "c");
        
        // Generate all permutations of the elements
        List<String> permutations = generatePermutations(elements);
        
        // Print the generated permutations
        System.out.println(String.join(", ", permutations));
    }

    // Function to generate all permutations of the given list of elements
    static List<String> generatePermutations(List<String> elements) {
        // List to store all the permutations
        List<String> permutations = new ArrayList<String>();
        
        // Build the permutations starting with an empty current permutation
        buildPermutations(elements, "", permutations);
        
        // Return the list of generated permutations
        return permutations;
    }

    // Recursive function to build permutations
    static void buildPermutations(List<String> availableElements, String currentPermutation, List<String> permutations) {
        // Base case: if there are no more available elements, add the current permutation to the list
        if (availableElements.isEmpty()) {
            permutations.add(currentPermutation);
            return;
        }

        // Iterate over the available elements
        for (int i = 0; i < availableElements.size(); i++) {
            // Get the current element to add to the permutation
            String currentElement = availableElements.get(i);
            
            // Create a new list of remaining elements by excluding the current element
            List<String> remainingElements = new ArrayList<String>(availableElements);
            remainingElements.remove(i);
            
            // Recursively build permutations with the remaining elements and the updated current permutation
            buildPermutations(remainingElements, currentPermutation + currentElement, permutations);
        }
    }
}  

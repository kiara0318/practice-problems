import java.util.ArrayList;
import java.util.List;

public class Permutations {
    
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("a", "b", "c");
        List<String> permutations = generatePermutations(elements);
        System.out.println(String.join(", ", permutations));
    }

    static List<String> generatePermutations(List<String> elements) {
        List<String> permutations = new ArrayList<String>();
        buildPermutations(elements, "", permutations);
        return permutations;
    }

    static void buildPermutations(List<String> availableElements, String currentPermutation, List<String> permutations) {
        if (availableElements.isEmpty()) {
          permutations.add(currentPermutation);
          return;
        }

        for (int i = 0; i < availableElements.size(); i++) {
          String currentElement = availableElements.get(i);
          List<String> remainingElements = new ArrayList<String>(availableElements);
          remainingElements.remove(i);
          buildPermutations(remainingElements, currentPermutation + currentElement, permutations);
        }
    }
}


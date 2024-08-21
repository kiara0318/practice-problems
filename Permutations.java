import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        List<String> elements = List.of("a", "b", "c");
        List<String> permutations = generatePermutations(elements);
        System.out.println(permutations);
    }

    public static List<String> generatePermutations(List<String> elements) {
        List<String> result = new ArrayList<>();
        findPermutations(elements, "", result);
        return result;
    }

    private static void findPermutations(List<String> remainingElements, String currentPrefix, List<String> result) {
        if (remainingElements.isEmpty()) {
            result.add(currentPrefix);
        } else {
            for (int i = 0; i < remainingElements.size(); i++) {
                String element = remainingElements.get(i);
                List<String> newRemainingElements = new ArrayList<>(remainingElements);
                newRemainingElements.remove(i);
                findPermutations(newRemainingElements, currentPrefix + element, result);
            }
        }
    }
}

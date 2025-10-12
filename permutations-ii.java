import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] numbers) {
        List<List<Integer>> permutations = new ArrayList<>();
        Arrays.sort(numbers); // Sort to handle duplicates
        generate(permutations, new ArrayList<>(), numbers, new boolean[numbers.length]);
        return permutations;
    }

    private void generate(List<List<Integer>> permutations, List<Integer> currentList, int[] numbers, boolean[] isUsed) {
        if (currentList.size() == numbers.length) {
            permutations.add(new ArrayList<>(currentList));
            return;
        }

        for (int index = 0; index < numbers.length; index++) {
            if (isUsed[index]) continue;

            // Skip duplicate elements
            if (index > 0 && numbers[index] == numbers[index - 1] && !isUsed[index - 1]) continue;

            isUsed[index] = true;
            currentList.add(numbers[index]);

            generate(permutations, currentList, numbers, isUsed);

            isUsed[index] = false;
            currentList.remove(currentList.size() - 1);
        }
    }
}

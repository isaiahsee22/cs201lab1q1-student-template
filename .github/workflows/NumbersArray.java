import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    public static Integer findMax(Integer[] arr){
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
    public static Integer[] findDuplicates(Integer[] arr){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dupe = new HashSet<>();

        for (Integer x: arr){
            if (!seen.add(x)){
                dupe.add(x);
            }
        }

        return dupe.toArray(new Integer[0]);
    }

    public static Integer[] findUnique(Integer[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (Integer x : arr) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer x : arr) {
            if (count.get(x) == 1) {
                unique.add(x);
            }
        }

        return unique.toArray(new Integer[0]);
    }
}


package assigment;

//An array contains 30 integers. Write a java program to read every 3rd element of the
// array, compute the square of the array and print the addition of all the suqares
//E.g. [1,2,2,4,5,6,7,8,3,10]
//Answer is (2x2) + (6x6) + (3x3) = 49
public class Code1 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};

        int sum = 0;

        for(int i = 2; i < arrays.length; i=i+3){
            int square = arrays[i] * arrays[i];
            sum= sum + square;
        }
        System.out.println("sum of square: "+sum);
    }
}


package GeeksForGeeks;

//You are given a cubic dice with 6 faces.
// All the individual faces have a number printed on them.
// The numbers are in the range of 1 to 6, like any ordinary dice.
// You will be provided with a face of this cube,
// your task is to guess the number on the opposite face of the cube.

//the sum of all opposite sites is always 7 so just minus n from 7 to find opposite number
//second approach

public class DiceProblem2
{
    static void main() {
        int n=3;
        int output=7-n;
        System.out.println("Opposite side: "+ output);
    }
}

/**

        * File: Lesson 5.2 - arrays

        * Author: Owais Ali Khan

        * Date Created: April 29, 2026

        * Date Last Modified: April 29, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int findValue(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    
    public static int findThirdValue(String str, String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                count++;
                if (count == 3) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static double[] append(double num, double[] arr) {
        double[] arr2 = new double[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr2.length-1] = num;
        return arr2;
    }

}

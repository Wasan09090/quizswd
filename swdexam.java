/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swd;

/**
 *
 * name; wasan salman alharbi
 * id;44510121
 */

public class swdexam {
             // This function returns index of element x in arr[]

            static int search(int arr[], int n, int x)

            {

                        for (int i = 0; i < n; i++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (arr[i] == x)

                                                return i;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] arr = { 3, 4, 1, 7, 5 };

                        int n = arr.length;

                        int x = 3;

                        int index = search(arr, n, x);

                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            
}
}

//Name: Maria Alamri
//ID: 44411743

//----------------------------------------------------------------------------------------------

// Java code for linearly searching for target in numbers[]. If target

// is present then return its location, otherwise

// return -1

class LinearSearch {

            // This function returns index of element target in numbers[]

            static int findElement(int numbers[], int size, int target)

            {

                        for (int index = 0; index < size; index++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (numbers[index] == target)

                                                return index;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] numbers = { 3, 4, 1, 7, 5 };

                        int size = numbers.length;

                        int target = 4;

                        int result = findElement(numbers, size, target);

                        if (result == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + result);

            }

}
//------------------------------------------------------------------------------------------------------

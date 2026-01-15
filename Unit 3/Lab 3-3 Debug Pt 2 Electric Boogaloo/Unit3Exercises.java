public class Unit3Exercises {

    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 1;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i - 1] != null) {
                sum += strs[i - 1].length();
                if (i % 2 == 0) {
                    sum = sum - 1;
                }
            }
        }
        return sum / (strs.length + 1);
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        if (str == null) {
            return "";
        }
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    // public static String reverseString(String str) {
    // String reversed = "";

    // for (int i = str.length() - 1; i >= 0; i--) {
    // reversed = reversed + str.charAt(i);
    // if (i % 3 == 0 && i != 0) {
    // reversed = reversed + str.charAt(i);
    // } else if (str.charAt(i) == ' ' && i != 0) {
    // reversed = reversed + " ";
    // }
    // }
    // return reversed;
    // }

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right);
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        if (sum == 0) {
            sum = numbers.length;
        }
        return sum;
    }

    // Day 2 Methods

    // Calculate the sum of the squares of numbers in an array

    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        if (numbers == null) {
            throw new NullPointerException("No! BAD INPUT!! SPRAY BOTTLE!!!");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                sum += Math.pow(numbers[i], 2);
            }
            return sum;
        }
    }

    // Return the nth Fibonacci number (sequence starts w/ 1)

    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("No! BAD INPUT!! SPRAY BOTTLE!!!");
        } else if (n == 0 || n == 1) {
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Sort array in descending order

    public static int[] sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("No! BAD INPUT!! SPRAY BOTTLE!!!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr;
        }
    }

    // Day 3 Methods

    // Converts string to a positive integer
    // Method should return 1 if it's negative

    public static int parsePositiveInteger(String str) {
        int number = Integer.parseInt(str);
        if (number < 0) {
            throw new NumberFormatException("NO!! BAD!! NUMBER CANT BE NEGATIVE!!");
        }
        return number;
    }

    // Returns an element at a specific index in an array

    public static String getArrayElement(String[] arr, int index) {
        try {
            return arr[index];
        } catch (Exception e) {
            System.out.println("Index can't be negative!");
            return null;
        }

    }

    // Calculates the square root of a inputted number

    public static double calculateSquareRoot(int number) {
        try {
            return Math.sqrt(number);
        } catch (Exception e) {
            System.out.println("Input can't be negative!");
            return Double.NaN;
        }
    }

    // Sum Array Elements

    public static int sumArrayElements(int[] array) {

        try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } catch (Exception e) {

            return 0;
        }
    }

    // Calculates Power of a Base Number

    public static double calculatePower(double base, int exponent) {

        try {
            if (exponent < 0) {
                throw new IllegalArgumentException("NO NEGATIVE EXPONENT!! BAD!!");
            } else {
                return Math.pow(base, exponent);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 1;
        }
    }
}
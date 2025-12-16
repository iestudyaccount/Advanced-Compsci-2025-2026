public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        // to-do: implement this method
        if (vacation == true) {
            return "10:00";
        } else if (day == 0 || day == 6) {
            return "10:00";
        }
        return "7:00";
    }

    public static boolean love6(int a, int b) {
        // to-do: implement this method
        if (Math.abs(a) == 6 || Math.abs(b) == 6) {
            return true;
        } else if (a + b == 6 || a - b == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        // to-do: implement this method
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && a == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        // to-do: implement this method
        if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        }
        return str;

    }

    public static String doubleChar(String str) {
        // to-do: implement this method
        String doubledStr = "";
        for (int i = 0; i < str.length(); i++) {
            doubledStr = "" + str.charAt(i) + str.charAt(i);
        }
        return doubledStr;

    }

    public static int countHi(String str) {
        // to-do: implement this method
        int hiCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf('h') == i && str.charAt(i + 1) == 'i') {
                hiCounter = hiCounter + 1;
            }
        }
        return hiCounter;
    }

    public static boolean catDog(String str) {
        // to-do: implement this method
        int catCounter = 0;
        int dogCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf("cat") == i) {
                catCounter = catCounter + 1;
            }
            if (str.indexOf("dog") == i) {
                dogCounter = dogCounter + 1;
            }

        }

        if (catCounter == dogCounter) {
            return true;
        }
        return false;
    }

    public static String mixString(String a, String b) {
        // to-do: implement this method
        String mixedString = "";
        for (int i = 0; i < a.length(); i++) {
            mixedString = "" + a.charAt(i) + b.charAt(i);
        }
        return mixedString;

    }

    public static String repeatEnd(String str, int n) {
        // to-do: implement this method
        String endPiece = str.substring(str.length() - n, str.length() - 1);
        String repeatedEnd = "";
        for (int i = 0; i <= n; i++) {
            repeatedEnd = repeatedEnd + endPiece;
        }
        return repeatedEnd;
    }

    public static boolean endOther(String a, String b) {
        // to-do: implement this method
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        if (lowerA.length() >= lowerB.length()) {
            int start = lowerA.length() - lowerB.length();
            return lowerA.substring(start).equals(lowerB);
        }
        int start = lowerB.length() - lowerA.length();
        return lowerB.substring(start).equals(lowerA);
    }

    public static int countCode(String str) {
        // to-do: implement this method
        String fixedString = str.toLowerCase();
        String countIt = "code";
        int codeCount = 0;
        for (int i = 0; i < fixedString.length() - 3; i++) {
            if (fixedString.substring(i, i + 3) == countIt) {
                codeCount++;
            }

        }
        return codeCount;
    }

    public static int countEvens(int[] nums) {
        // to-do: implement this method
        int numberOfEvens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                numberOfEvens++;
            }
        }
        return numberOfEvens;
    }

    public static int bigDiff(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 13 || nums[i + 1] != 13) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        // to-do: implement this method
        int[] fizzyArray = new int[n];
        for (int i = 0; i < n; i++) {
            fizzyArray[i] = i;
        }
        return fizzyArray;
    }

    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
        int countOfThrees = 0;
        int threeNextToThree = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3) {
                countOfThrees++;
            } else if (nums[i] == 3 && nums[i + 1] == 3) {
                threeNextToThree++;
            }

        }
        if (countOfThrees == 3 && threeNextToThree == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String[] fizzArray2(int n) {
        String[] fizzyStrings2 = new String[n];
        // to-do: implement this method
        for (int i = 0; i < n - 1; i++) {
            fizzyStrings2[i] = "" + i + ",";
            if (i == n - 1) {
                fizzyStrings2[i] = "" + i;
            }

        }
        return fizzyStrings2;
    }

    public static int[] zeroFront(int[] nums) {
        // to-do: implement this method
        int[] zeroesMoved = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {

            }
        }
        return zeroesMoved;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int numOfTarget = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == target) {
                numOfTarget++;
            }

        }
        String[] targetless = new String[numOfTarget];
        for (int i = 0; i < targetless.length; i++) {
            if (words[i] != target) {
                targetless[i] = words[i];
            }
        }

        return targetless;
    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        int firstHalfAverage = average(scores, 0, scores.length / 2);
        int secondHalfAverage = average(scores, scores.length / 2, scores.length);
        if (firstHalfAverage > secondHalfAverage) {
            return firstHalfAverage;
        } else {
            return secondHalfAverage;
        }
    }

    // helper method
    private static int average(int[] scores, int start, int end) {
        int total = 0;
        for (int i = start; i < end; i++) {
            total += scores[i];
        }
        int average = total / scores.length;
        return average;
    }

    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        int countIncrease = 0;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] <= scores[i + 1]) {
                countIncrease++;
            }
        }

        if (countIncrease == scores.length - 1) {
            return true;
        }
        return false;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        return maxSpecial(a) + maxSpecial(b);
    }

    private static int maxSpecial(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static String firstTwo(String str) {
        String firstTwo;
        if (str.length() >= 2) {
            firstTwo = str.substring(0, 1);
        } else if (str.length() == 1) {
            firstTwo = str + 1;
        } else {
            firstTwo = "**";
        }
        return firstTwo;
    }

    public static double divide(int a, int b) {
        double divided = 0.0;
        if (a < b) {
            divided = b / a;
        } else {
            divided = a / b;
        }

        return divided;
    }
}

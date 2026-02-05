import java.util.*;

public class TestResultsTester {
    public static void main(String[] args) {
        ArrayList<String> testArray1 = new ArrayList<String>();
        testArray1.add("A");
        testArray1.add("B");
        testArray1.add("?");
        testArray1.add("E");
        testArray1.add("Z");
        testArray1.add("A");

        ArrayList<String> testKey1 = new ArrayList<String>();
        testKey1.add("A");
        testKey1.add("C");
        testKey1.add("D");
        testKey1.add("E");
        testKey1.add("Y");
        testKey1.add("A");

        StudentAnswerSheet testStu1 = new StudentAnswerSheet("Jim", testArray1);

        ArrayList<String> testArray2 = new ArrayList<String>();

        testArray2.add("A");
        testArray2.add("C");
        testArray2.add("D");
        testArray2.add("E");
        testArray2.add("Y");
        testArray2.add("A");

        ArrayList<String> testArray3 = new ArrayList<String>();

        StudentAnswerSheet testStu2 = new StudentAnswerSheet("Liza", testArray2);
        StudentAnswerSheet testStu3 = new StudentAnswerSheet("Nobody", testArray3);

        ArrayList<StudentAnswerSheet> testSubs1 = new ArrayList<StudentAnswerSheet>();

        testSubs1.add(testStu1);
        testSubs1.add(testStu2);
        testSubs1.add(testStu3);

        TestResults testResults1 = new TestResults(testKey1, testSubs1);

        System.out.println(testStu1.getAnswers());
        System.out.println(testSubs1.get(1));
        System.out.println(testResults1.highestScoringStudent());

    }

}

import java.util.Arrays;
public class Student {
   
    private String name;
    private int[] scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores.clone();
    }

    public double getAverage() {
        return Arrays.stream(scores).average().orElse(0);
    }

    public static void main(String[] args) {
        Student s = new Student("Engjellushe", new int[]{95, 100, 90});
        System.out.printf("%s’s average: %.2f%n", s.name, s.getAverage());
    }
}


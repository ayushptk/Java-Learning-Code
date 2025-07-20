public class Average {
    public static void main(String[] args) {
        int[] marks = {10, 30, 60, 80, 90};
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.length;
        System.out.println("Average " + average);
    }
}

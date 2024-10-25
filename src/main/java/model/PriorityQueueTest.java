//import java.util.PriorityQueue;
//
//class Stu implements Comparable<Stu> {
//    private String name;
//    private int grade;
//
//    public Stu(String name, int grade) {
//        this.name = name;
//        this.grade = grade;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getGrade() {
//        return grade;
//    }
//
//    // Implementing the compareTo() method to define priority
//    @Override
//    public int compareTo(Stu other) {
//        // Higher grade students have higher priority
//        return Integer.compare(other.grade, this.grade); // Descending order
//    }
//
//    @Override
//    public String toString() {
//        return name + " (Grade: " + grade + ")";
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Create a PriorityQueue for Student objects
//        PriorityQueue<Stu> studentQueue = new PriorityQueue<>();
//
//        // Add students to the priority queue
//        studentQueue.offer(new Stu("Alice", 85));
//        studentQueue.offer(new Stu("Bob", 90));
//        studentQueue.offer(new Stu("Charlie", 80));
//
//        // Poll students from the queue based on their priority (higher grade comes first)
//        while (!studentQueue.isEmpty()) {
//            System.out.println(studentQueue.poll());
//        }
//    }
//}

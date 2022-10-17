package TestPackage;

import DoublyLinkedList.DoubleLinkedList;
import Interface.List;

public class DoubleLinkedListTest {
    public static void main(String[] args) {
        List<Student> studentList = new DoubleLinkedList<>();

        studentList.add(new Student("유동선", 1));
        studentList.add(new Student("유동선2", 2));
        studentList.add(new Student("유동선3", 3));
        studentList.add(new Student("유동선4", 4));
        studentList.add(new Student("유동선5", 5));

        for(int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}

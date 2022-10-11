package TestPackage;

import SinglyLinkedList.SingleLinkedList;

public class Test {
    public static void main(String[] args) {
        SingleLinkedList<Student> studentList = new SingleLinkedList<>();

        studentList.add(new Student("유동선", 22));
        studentList.add(new Student("유동", 21));
        studentList.add(new Student("유선동", 23));
        studentList.add(new Student("유선", 24));

        for(int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println("addFirst 테스트");

        studentList.addFirst(new Student("아오", 123));

        for(int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        System.out.println("remove 테스트");
        studentList.remove();

        for(int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        System.out.println("remove(int index) 테스트 ");
        studentList.remove(4);                      //throw ArrayIndexBoundsException

        for(int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}

package ObjectOriented;

//9. 다음의 코드를 보고 1번, 2번, 3번, 4번, 5번, 6번 문장 중에서 오류가 발생하는 문장을 모두 찾고 오류의 원인에 대해서 설명하시오.


//  interface Predator {
//      String bark();
//  }
//
//  abstract class Animal {
//      public String hello() {
//          return "hello";
//      }
//  }
//
//  class Dog extends Animal {
//
//  }
//
//  class Lion extends Animal implements Predator {
//      public String bark() {
//          return "Bark bark!!";
//      }
////  }
//
//  public class Sample {
//      public static void main(String[] args) {
//          Animal a = new Lion();
//          Lion b = new Lion();
//          Predator c = new Lion();
//
//          System.out.println(a.hello());  // 1번
//          System.out.println(a.bark());   // 2번    <- 오류   이유: Animal로 생성된 객체(hello메소드만 사용가능)
//          System.out.println(b.hello());  // 3번
//          System.out.println(b.bark());   // 4번
//          System.out.println(c.hello());  // 5번    <- 오류   이유: Predator로 생성된 객체(bark메소드만 사용가능)
//          System.out.println(c.bark());   // 6번
//      }
//  }

public class Q9 {

}

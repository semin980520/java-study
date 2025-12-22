//package C02MethodClass;
//
////변수의 유효범위 : 클래스변수와 객체변수는 클래스 전역에서 사용 가능
//public class C0Scope {
////    클레스변수 or 스테틱변수
//    static int v1 = 10;
////    객체변수 or 인스턴스변수 : 객체(인스턴스) 메서드에서만 접근 가능
//    int v2 = 20;
//    public static void main(String[] args) {
////     지역변수 : 지역변수는 해당 메서드내에서만 사용
//        int v3 = 10;
//        scope1(v3);
//        System.out.println(v3); //10
//        C04Person p1 = new C04Person();
//        p1.setName("kim");
//        p1.setEmail("kim@naver.com");
//        p1.setAge(30);
//        scope2(p1);
//        System.out.println(p1.returnPersonInfo()); // lee
//    }
//    public static void scope1(int v3){ //call by value : 값을 통한 호출. 값만을 전달.
//        v3=30;
//        System.out.println(v3); //30
//
//        int a = 30;
//    }
//    int a = 20;
//    public static void scope2(C04Person person) {  // call by reference : 참조의 의한 호출. 힙메모리 주소값 전달.
//        person.setName("lee");
//        System.out.println(person.returnPersonInfo()); // lee
//    }
//}

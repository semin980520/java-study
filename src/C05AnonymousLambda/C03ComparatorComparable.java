package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
//        java에서는 비교를 위한 인터페이스 대표적으로 2개 제공
//        comparator인터페이스 : 인터페이스내 compareTO메서드만 존재
//        comparable인터페이스 : 인터페이스내 compare메서드만 존재

//        List<Integer> myList = new ArrayList<>();
//        myList.add(20);
//        myList.add(10);
//        myList.add(30);
////        java의 대부분의 정렬함수는 매개변수로 Comparator객체 요구.
//        myList.sort(Comparator.naturalOrder());

////        o1과 o2의 숫자값을 마이너스 형식으로 코딩 하되,
////        o1이 먼저있으면 오름차순. o2가 먼저있으면 내림차순
//        myList.sort((o1, o2) -> o1-o2);
//
//        List<String> myList2 = new ArrayList<>();
//        myList2.add("java");
//        myList2.add("python");
//        myList2.add("c++");
//        String a = "hello";
//        String b = "hello";
//        System.out.println(a.compareTo(b));
////        기본적인 문자열정렬일때에는 comparator커스텀을 하지 않고,
//        Collections.sort(myList2, (o1, o2) -> o1.compareTo(o2));
//        System.out.println(myList2);
////         ex) 문자열의 길이로 정렬하되, 문자열의 길이가 같은 경우에는 알파벳순으로 정렬
//        Collections.sort(myList2, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length() == o2.length()){
//                    return o1.compareTo(o2);
//                }else {
//                    return o1.length()-o1.length();
//
//                }
//            }
//        });
//        List<String> myList3 = new ArrayList<>();
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("c++");
////        복잡한 자신만의 정렬기준을 가지고 정렬해야 할때 Comparator익명객체 생성.
//        Collections.sort(myList3, (o1, o2) -> o1.length()-o2.length());



//        백준 : 단어정렬

//        배열, 리스트 정렬외에 java의 그외 정렬자료구조
//        Queue<String> pq = new PriorityQueue<>((o1, o2) -> o1.length()-o2.length());
////        백준 : 절대값힙 Comparator로 풀어보기
//
//        Set<String> treeSet = new TreeSet<>((o1, o2) -> o1.length()-o2.length());


//        백준 : 선긋기  ( 어차피 못푸니까 들어가서 현타 느끼지말기)

//        리스트 안의 배열 정렬
//        [{4,5}, {1,2}, {5,0}, {3,1}]

////        리스트안의 배열에 1번째 index를 기준으로 오름차순 정렬
//
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{4,5});
//        myList.add(new int[]{1,2});
//        myList.add(new int[]{5,0});
//        myList.add(new int[]{3,1});
//
//        myList.sort((o1, o2) -> o1[1]- o2[1]);
//        for (int[] c : myList);
//
//        System.out.println(Arrays.toString(c));

//        직접 만든 객체 정렬
////        방법1. Comparator를 구현한 익명객체 방식
//        List<student> myList = new ArrayList<>();
//        myList.add(new student(20,"병찬"));
//        myList.add(new student(17,"다은"));
//        myList.add(new student(12,"현준"));
//        myList.add(new student(13,"세민"));
//
//        Collections.sort(myList,(a,b)->a.getAge() - b.getAge());
//        Collections.sort(myList, (a,b) -> a.getName().compareTo(b.getName()));
//
////        방법2. Comparable을 구현한 방식
////        객체에서 바꾸면 다 바꿔야하는 단점이 있음.
////        Student객체 안에 Comparable을 implements하는 방식
////        sort실행시 자동으로 students안의 compareTo메서드 호출
//        Collections.sort();
//    }
//}
//class student implements Comparable<student>{
//class student{
//    private int age;
//    private String name;
//
//    @Override
//    public String toString() {
//        return "{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public student(int age, String name) {
//        this.age = age;
//        this.name = name;
//
//    }
//
////    Comparable의 compareTo에서는 this와 매개변수로 주어지는 객체와 비교
////    this가 앞에 있으면 오름차순, 매개변수객체가 앞에 있으면 내림차순
//

    }
}
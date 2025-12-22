package C02MethodClass;

import java.util.*;
//재귀함수 기본 호출 원리화 과정
public class C11RecursiveBasicFlow {
    public static void main(String[] args) {
//        recur0(0,3);
//        recur1(0,3);
        List<Integer> myList = new ArrayList<>();
        recur2(myList, 0, 3);
        // recur2(ArrayList,0,3); 위 recur2와 같음
        System.out.println(myList); // 0
    }
//    기본자료형 변수의 재귀함수내 변화과정(매개변수로 넘기는 시점에 값 변경)
    public static void recur0(int count,int target) {
//        재귀함수 위에 제어코드를 적어야함
//        if(count == target) {
//            return;
//        }
//        System.out.println("재귀 호출전 count : " + count); // 0(첫번째 호출) -> 1(두 번째) -> 2(세 번째)
//        recur0(count+1, target); // 위에서 출력하면 여기서 다시 위로 올라가서 무한히 출력시킴 그래서(count+1, target)으로 제어시킴
//        System.out.println("재귀 호출후 count : " + count); // 2(네번째) -> 1(다섯번째) -> 0(여섯번째)
    }


//    기본자료형 변수의 재귀함수내 변화과정(함수내에 값 변경)
    public static void recur1(int count,int target) {
//        재귀함수 위에 제어코드를 적어야함
//        if(count == target) {
//            return;
//        }
//        System.out.println("재귀 호출전 count : " + count); //-0-> 1 -> 2
//        count += 1;
//        recur1(count, target);
//        System.out.println("재귀 호출후 count : " + count); // 3-> 2 -> 1
    }
//  객체를 매개변수로 활용한 재귀함수내 변화과정 : 객체는 힙메모리를 통해 원복객체가 변경되므로, 재귀함수간에도 값의변화를 공유.
    public static void recur2(List<Integer> myList, int count, int target) {
        if(myList.size() == target) {
            return;
        }
        myList.add(count);
        recur2(myList, count+1, target);
        System.out.println(myList); // {0,1,2} ->{0,1,2}->{0,1,2} 힙 메모리에 최종 저장된 값이 출력
        myList.remove(myList.size()-1);

    }
}

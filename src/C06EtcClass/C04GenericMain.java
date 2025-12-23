package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C04GenericMain {
    public static void main(String[] args) {
//        String[] stArr ={"java", "python","c++"};
//        stChange(stArr,0,1);
//        System.out.println(Arrays.toString(stArr));
//
//        Integer[] intArr = {10,20,30};
//        Change(intArr,0,1);
//        System.out.println(Arrays.toString(intArr));
//
//        allChange(stArr,1,2);
//        System.out.println(Arrays.toString(stArr));
//        allChange(intArr,0,2);
//        System.out.println(Arrays.toString(intArr));

//        제네릭을 사용한 객체 생성
        GenericPerSon<String > p1 = new GenericPerSon<>("hongildong");
        GenericPerSon<Integer> p2 = new GenericPerSon<>(20);
        System.out.println(p1.getValue());
        System.out.println(p2.getValue());

//        제네릭의 사용 예시
        List<String> myList = new ArrayList<>();
        Stream<String> myStream;
        Optional<Student> myStudent;


    }
    static void stChange(String[] arr, int a , int b){
        String temp = "";
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
//    제네릭메서드는 반환타입 왼쪽에 <T>라고 선언.
//    이때 T는 참조형변수인 객체타입만을 허용.
    static <T> void allChange(T[] rra , int c , int d){
        T temp = rra[c];
        rra[c] = rra[d];
        rra[d] = temp;

    }
}
class GenericPerSon<T>{
    private T value;

    public GenericPerSon(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
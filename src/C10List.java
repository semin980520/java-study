import java.util.*;

public class C10List {
    public static void main(String[] args) {

////        List선언 방법1
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        List선언방법2 : 가장 일반적인방법
//        List<String> myList3 = new ArrayList<>();
//
////        초기값 세팅방법1. 개별data add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("c++");

////        초기값 세팅방법2. 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
////        List의 출력
////        List등의 컬렉션프레임워크 안에는 toString메서드가 구현되어있고, 자동호출
////        System.out.println(myList4);
//
//
////        List의 안의 자료타입으로는 기본형타입은 쓸 쑤 없음.
//
//        int[] intArr = {10,20,30};
//        List<Integer> myList5 = new ArrayList<>();
//        for (int i : intArr) {
//            myList5.add(i);
//        }

//        add : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0, 30); //List는 중간위치의 데이터 삽입/삭제하는 작업은 비효율적이다.
//        System.out.println(myList);
//
////        get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(2));
//
////        size() : 리스트의 개수(길이)를 반환
//        System.out.println(myList.size());

//        리스트의 값 출력 방법1. 일반 for문
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
////        리스트의 값 출력 방법1.
//        for (int a : myList) {
//            System.out.println(a);
//        }

////        remove : 값 삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(10);
//        myList.remove(myList.size()-1);

////        indexOf : 특정값을 찾아 index return
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(30);
//        System.out.println(myList.indexOf(30));
////        contains : 값이 있는지 없는지 여부를 리턴
//        System.out.println(myList.contains(20));



////        프로그래머스 : n의 배수 고르기
//        int n = 3;
//        List<Integer> numlist = new ArrayList<>();
//
//        int[] answer = {};
//        for (int num : numlist) {
//            if (num % n == 0) numlist.add(num) {
//
//            }
//        }
//        int[] answer = new int[numlist.size()];
//        for(int i=0; i<answer.length; i++){
//            answer[i] = numlist.get(i);
//            }
//        return answer;
//    }

////        정렬 : 방법2가지 (Collections클래스의 sort 메서드 사용 , 객체의 sort메서드 사용)
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
//        Collection.sort(myList); //오름차순
//        Collection.sort(myList, Comparator,reverseOrder()); //오름차순
//        System.out.println(myList);
//
//        myList.sort(Comparator.naturalOrder()); //오름차순
//        myList.sort(Comparator.reverseOrder()); //오름차순
//        System.out.println(myList);

////        이중리스트 : 리스트안의 리스트
////        [[1,2,3], [4,5,6]]
//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> m1 = new ArrayList<>();
//        myList.add(m1);
//        myList.add(new ArrayList<>());
//        m1.add(1);
//        m1.add(2);
//        m1.add(3);
//        myList.get(1).add(4);
//        myList.get(1).add(5);
//        myList.get(1).add(6);
////        ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//        myList.get(0).add(1);
//        myList.get(0).add(2);
//        myList.get(0).add(3);
//        myList.get(1).add(4);
//        myList.get(1).add(5);
//        myList.get(1).add(6);
//        System.out.println(myList);

////        [[1,2,3], [4,5,6],[7,8,9],....[58,59,60] 형태의 이중리스트
//        List<List<Integer>> myList = new ArrayList<>();
//        int count =1;
//        for (int i=0; i<20; i++){
//           List<Integer> inner = new ArrayList<>();
//
//        for (int j=0; j<3; j++){
//                inner.add(count);
//                count++;
//        }
//        myList.add(inner);
//        }
//        System.out.println(myList);

////        리스트안의 배열
////        [{10,20}, {1,2,3}, {4,3,2,1}]
//
//        List<int[]> myList = new ArrayList<>();
//        int[] arr = new int[2];
//        arr[0]=10;
//        arr[1]=20;
//        myList.add(arr);
////      ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//        myList.add(new int[3]);
//        myList.get(1)[0]=1;
//        myList.get(1)[1]=2;
//        myList.get(1)[2]=3;
//        myList.add(new int[]{4,3,2,1});
////        System.out.println(myList); 배열의 주소값이 출력 [x1배열주소, x2배열주소, x3배열주소]
//        for (int i=0; i<myList.size(); i++){
//            System.out.println(Arrays.toString(myList.get(i)));
//        }




    }
}

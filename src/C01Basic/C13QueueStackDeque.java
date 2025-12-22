package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C13QueueStackDeque {
    public static void main(String[] args) {
////        Queue인터페이스를 Linkedlist를 구현한 아래와 같은 방식으로 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        poll은 큐에서 가장 앞의 데이터를 삭제하면서, 동시에 return하는 메서드
//        int value = myQue.poll();
//        System.out.println(value); // 10
//        System.out.println(myQue); // 20,30
////        peek은 큐에서 데이터를 삭제하지않고, 가장 앞의 데이터를 return하는 메서드
//        int value2 = myQue.peek();
//        System.out.println(value2); // 20
//        System.out.println(myQue); // 20,30

////        while문을 통한 queue출력 방식
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("문서1");
//        printerQueue.add("문서2");
//        printerQueue.add("문서3");
//        printerQueue.add("문서4");
////        큐는 일반적으로 while문을 통해 요소를 소모
//        while (!printerQueue.isEmpty()){ // queue에 있는 값이 없을 때까지 실행 하겠다.
//
//            System.out.println(printerQueue.poll());
//        }

////        LinkedList와 ArrayList 성능차이 비교
////        ArrayList 장점 : 조회성능빠름 , 단점 : remove(0) (중간 삽입/삭제)성능 저하
////        LinkedList 장점 : remove(0) (중간 삽입/삭제 )성능 빠름, 단점 : 조회성능저하
//        LinkedList<Integer> myLinkedList = new LinkedList<>();
//
//        long startTime = System.currentTimeMillis();
//        for(int i=0; i<1000000; i++){
//            myLinkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist에 중간에 값 add 시에 소요시간 :" + (endTime-startTime));
//        ArrayList<Integer> myArrayList = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i=0; i<1000000; i++){
//            myArrayList.add(0, i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("Arraylist에 중간에 값 add 시에 소요시간 :" + (endTime2-startTime2));

//        카드2 , 요세푸스 문제 0

//        길이제한큐
//        Queue<String> blookingQueue = new ArrayBlockingQueue<>(3);
//        blookingQueue.add("문서1");
//        blookingQueue.add("문서2");
//        blookingQueue.add("문서3");
//        blookingQueue.add("문서4");
//        blookingQueue.add("문서5");
//        blookingQueue.add("문서6"); //길이 초과시 에러 발생
//        blookingQueue.offer("문서1");
//        blookingQueue.offer("문서2");
//        blookingQueue.offer("문서3"); // 에러는 안터지지만 지정한 길이 이후는 출력 X
//        blookingQueue.offer("문서4"); // add 사용시 blockqueue에 지정한 숫자 길이만큼 출력하다 에러발생
//        blookingQueue.offer("문서5"); // 자주 사용안함
//        blookingQueue.offer("문서6"); //제한된 길이까지만 insert하고 에러발생 x
//        System.out.println(blookingQueue);

////        pq에서 데이터 하나를 poll : log(n)
////        pq에서 전체데이터를 모두 poll : n*log(n)
////        list에서 전체데이터를 정렬 : n : n*log(n)
////        우선순위 큐 : 데이터를 poll할 때 정렬된 데이터결과값(최소값/최대값) 보장
////        기본적으로 오름차순 낮은 수 부터 정렬
////        한 번만 추가/삭제하면 list 사용
////        지속적으로 데이터가 추가/제거 되면서 전체 데이터가 실시간으로 변경되는 상황에 사용.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//
//        while (!pq.isEmpty()){
////        poll 할 때 마다 최소값을 추출하게되고, 복잡도 log(n). peek은 최소값을 확인만하고 추출은 안함 복잡도 log(n).
////        전체 데이터를 모두 poll하면 복잡도 n*log(n)
//            System.out.println(pq.poll());
//        }
//
////       백준 : 최소힙
//
////        프로그래머스 : 더 맵게
//        Queue<Integer> pq = new PriorityQueue<>();
//        for (int S : soclville) {
//            pq.add(S);
//        }
//
//        int count = 0;
//        while (pq.peek() < K) {
//            if (pq.size() < 2) {
//                System.out.println(-1);
//                return;
//            }
//            int A = pq.poll();
//            int B = pq.poll();
//
//            int C = A + (B * 2);
//            pq.add(C);
//            count++;
//
//        }
//        System.out.println(count);
////        최대힙 : poll 할 때 마다 최대값을 추출
//        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

//         백준 카드 정렬하기

////        stack : 후입선출의 자료구조
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack.pop()); //마지막에 입력한 값을 꺼내는 것 poll과 반대
//        System.out.println(myStack.peek()); //마지막에 입력한 값을 확인만
//        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());
        //        프로그래머스 : 올바른 괄호

//        프로그래머스 : 같은 숫자는 싫어

////        deque : addFirst, addLast, pollFirst, pollLast, peekFirst, peekLast
//
//        Deque<Integer> myDeque = new ArrayDeque<>();
//        myDeque.addLast(10);
//        myDeque.addLast(20);
//        myDeque.addFirst(30);
//        System.out.println(myDeque); // 30, 10, 20
//        System.out.println(myDeque.pollLast()); // 20
//        System.out.println(myDeque.pollFirst()); // 30
//        System.out.println(myDeque.pollFirst()); // 10
//        System.out.println(myDeque); // []

    }
}


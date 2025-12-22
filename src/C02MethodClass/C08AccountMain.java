package C02MethodClass;//package C02MethodClass;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//<계좌개설 및 입출금 서비스>
////        1.계좌객체 : id(auto_increment Long), name(String), accountNumber(String), balance(long)
////        2.자료구조 :  계좌객체를 담아둘 자료구조는 Map
////        3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요.
////            3-1)계좌개설 : "이름"과 사용하실 "계좌번호"와 현재 "가지고있는돈"을 입력하세요. -> 자동으로 id값 증가되어 객체 생성
////            3-2)계좌조회 : 계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요. -> 계좌주명, 계좌번호번호, 잔고를 보기좋게 출력
////            3-3)입금 : 계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요. -> 입금전 잔액, 입금후 잔액 출력
////            3-4)출금 : 계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요. -> 잔액검증 -> "출금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력
////            3-5)송금 : 송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요. -> 잔액검증 -> "송금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
////        4.주의사항
////            4-1)프로그램은 상시적 실행될수 있도록 전체코드를 while(true)처리
////            4-2)main메서드에서 입출력 처리를 하고, 입금(deposit), 출금(withdraw), 송금(transfer)기능에 대한 핵심 메서드는 BankAccount클래스에 생성.
public class C08AccountMain {
    public static void main(String[] args) {
//////        계좌개설(객체 생성)
////        Account a1 = new Account("namgung","12345",200000);
////        Account a2 = new Account("hung","54321",100000);
//////        List를 계좌 객체를 담는 자료구조로 사용
////        List<Account> myList = new ArrayList<>();
////        myList.add(a1);
////        myList.add(a2);
////        계좌1("12345")에서 계좌2("54321")로 송금(50000)  :잔고 변경메서드 필요
////        내 객체를 찾아서 50000원을 차감하고, 상대방 객체를 찾아서 50000원을 가산한다.
////        for (Account a : myList) {
////                   if(a.getAccountNumber().equals("12345")){
////                       a.setBalance(a.getBalance() -50000);
////                   }
////                   if(a.getAccountNumber().equals("54321")){
////                       a.setBalance(a.getBalance() +50000);
//
////                   }
////        }
////        Map을 계좌객체를 담는 자료구조로 사용
//        Map<String, Account> accountMap = new HashMap<>();
//        accountMap.put("12345", new Account("hong1", "12345", 10000000));
//        accountMap.put("54321", new Account("hong2", "54321", 20000000));
//
//        Account a= accountMap.get("12345");
//        Account b= accountMap.get("54321");
//
//        a.transfer(b, 50000);
//        System.out.println(accountMap);
//    }
//}
//
//class Account {
////    참조자료형은 초기값이 null,
//    private Long id;
//    private String name;
//    private String accountNumber;
////   원시자료형은 각 자료형에 맞는 초기값
//    private long balance;
//    private static long staticId;
//
//    public Account(String name,String accountNumber ,long balance){
//        staticId++;
//        this.id  = staticId;
//        this.name = name;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
////       setBalance보다는 의도를 명확히한 메서드명을 사용하기를 권장
//    public void setBalance(long balance) {
//        this.balance = balance;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public long getBalance() {
//        return balance;
//    }
////          (송금받을객체, 송금할 돈)
//public void transfer(Account targetAccount, long money){
//
//        if(this.balance < money) {
//            System.out.println("잔고 부족");
//            return;
//        }
//        if(this.balance == 0){
//            System.out.println("잔고 0원");
//            return;
//        }
////    송금 할 객체에서 돈을 차감하고
//            this.balance -= money;
////    송금받을객체에 돈을 가산
//            targetAccount.balance += money;
//
//
//    }
//    @Override
//    public String toString() {
//        return "{" +
//                "id='" + id + '\''+
//                "name='" + name + '\'' +
//                ", accountNumber='" + accountNumber + '\'' +
//                ", balance=" + balance +
//                '}';
    }
}
//
////Account 클래스 = 계좌주명(name), 계좌번호(accountNumber-String),
//// 잔고(balance-long)
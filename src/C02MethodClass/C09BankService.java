//package C02MethodClass;
//
////        <계좌개설 및 입출금 서비스>
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
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.Map;
//
////        <게시판서비스>
////        1.계좌객체 : Author, Post
////        2.자료구조 : List(authorList, postList)
////        3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
////            3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
////            3-2.회원 전체 목록 조회 : id, email
////            3-3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
////            3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
////            3-5.게시물 목록 조회 : id(post), title
////            3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, 작성자이름
//public class C09BankService {
//    public static void main(String[] args) throws IOException{
//
////        bankAcconutMap.put("12345", new BankAccount("big","12345",2000000));
////        bankAcconutMap.put("54321", new BankAccount("mill","54321",4300000));
////        bankAcconutMap.put("67890", new BankAccount("tom","67890",1300000));
////        bankAcconutMap.put("09876", new BankAccount("sick","09876",5000000));
////        bankAcconutMap.put("45678", new BankAccount("holl","45678",3000000));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Map<String, BankAccount> bankAccountMap = new HashMap<>();
//
//        while (true) {
//
//            int number = Integer.parseInt(br.readLine());
////            3-1)계좌개설 : "이름"과 사용하실 "계좌번호"와 현재 "가지고있는돈"을 입력하세요. -> 자동으로 id값 증가되어 객체 생성
//            String accountNumber = null;
//            if (number == 1) {
//                System.out.println("이름과 사용하실 계좌번호와 현재 가지고있는돈을 입력하세요. ");
//                System.out.println("이름: ");
//                String name = br.readLine();
//                System.out.println("계좌번호: ");
//                accountNumber = br.readLine();
//                System.out.println("가지고있는 돈: ");
//                long money = Long.parseLong(br.readLine());
//
//                BankAccount newAccount = new BankAccount(name, accountNumber, money);
//
//                bankAccountMap.put(accountNumber, newAccount);
//                System.out.println(newAccount);
////            3-2)계좌조회 : 계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요. -> 계좌주명, 계좌번호번호, 잔고를 보기좋게 출력
//            } else if (number == 2) {
//                System.out.println("계좌조회서비스입니다. 조회하실 계좌의 계좌번호를 입력해주세요. ");
//                System.out.println("계좌번호: ");
//                String num = br.readLine();
//                BankAccount account = bankAccountMap.get(accountNumber);
//                System.out.println("계좌주명: " + account.getName());
//                System.out.println("계좌번호: "+ account.getAccountNumber());
//                System.out.println("잔고: "+ account.getBalance());
//
//
////            3-3)입금 : 계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요. -> 입금전 잔액, 입금후 잔액 출력
//            } else if (number == 3) {
//                System.out.println("계좌입금서비스입니다. 입금하실 계좌번호와 입금금액을 입력해주세요.:  ");
//                System.out.println("입금 할 계좌번호");
//               String num = br.readLine();
//                System.out.println("입금 금액");
//                long money = Long.parseLong(br.readLine());
//                BankAccount account = bankAccountMap.get(accountNumber);
//                System.out.println("입금 전 잔액: " + account.getBalance());
//                account.deposit(money);
//                System.out.println("입금 후 잔액: "+ account.getBalance());
//
//
//
//                //            3-4)출금 : 계좌출금서비스입니다. 출금하실 계좌번호와 출금금액을 입력해주세요. -> 잔액검증 -> "출금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력
//            } else if (number == 4) {
//                System.out.println("송금 전 금액: ");
//                long num = Long.parseLong(br.readLine());
//                System.out.println("송금 후 금액: ");
//                long after = Long.parseLong(br.readLine());
//
//                BankAccount myAccount = bankAccountMap.get(num);
//                BankAccount afterAccount = bankAccountMap.get(after);
//
////            3-5)송금 : 송금서비스입니다. 본인의 계좌번호, 상대방의 계좌번호, 송금금액을 입력해 주세요. -> 잔액검증 -> "송금 후 남은 금액은 얼마입니다" 또는 "잔액이 부족합니다" 출력.
//            } else if (number == 5) {
//                System.out.println("송금서비스입니다. " + "본인계좌번호: ");
//                String myNum = br.readLine();
//
//                System.out.println("상대계좌번호: ");
//                String theyNum = br.readLine();
//                System.out.println("송금금액: ");
//                long money = Long.parseLong(br.readLine());
//
//                BankAccount myAccount = bankAccountMap.get(myNum);
//                BankAccount targetAccount = bankAccountMap.get(theyNum);
//                System.out.println(bankAccountMap);
//
//            }
//        }
//    }
//}
//
//
//class BankAccount {
//    private Long id;
//    private String name;
//    private String accountNumber;
//    private long balance;
//    private static long staticId;
//public BankAccount (String name,String accountNumber, long balance){
//    staticId++;
//    this.id = staticId;
//    this.name = name;
//    this.accountNumber = accountNumber;
//    this.balance = balance;
//}
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
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setBalance(long balance) {
//        this.balance = balance;
//    }
//    public boolean withdraw(long money){
//
//        if()
//
//        this.balance -= money;
//    }
//    public void deposit(long money){
//
//        this.balance += money;
//    }
//public void transfer(BankAccount targetAccount, long money){
//
//        if(this.balance < money) {
//            System.out.println("잔액이 부족합니다.");
//            return;
//        }
//        this.balance -= money;
//        targetAccount.balance += money;
//
//}
//    @Override
//    public String toString() {
//        return "BankAccount{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", accountNumber='" + accountNumber + '\'' +
//                ", balance=" + balance +
//                '}';
//    }
//}
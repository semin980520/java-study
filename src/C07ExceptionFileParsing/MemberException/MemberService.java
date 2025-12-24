package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//핵심로직(비지니스로직)을 구현하는 계층
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        memberRepository = new MemberRepository();

    }

    public void register(String name, String email, String password) {
//        List(DB)에 이메일이 중복일경우 예외 발생(IllegalArguments)
        Optional<Member> member = memberRepository.findByEmail(email);
        if (member.isPresent())
           throw  new IllegalArgumentException("이메일이 중복입니다.");
//       Optional.of(member).filter(a->member != null).orElseThrow(()->new IllegalArgumentException("email이 중복입니다."));



//        객체 조립 후 repository를 통해 저장
        Member newmember = new Member(name, email, password);
        memberRepository.register(newmember);

    }

    public Member findById(long id) throws NoSuchElementException {

        Optional<Member> member = memberRepository.findById(id);
        return member.orElseThrow(() -> new IllegalArgumentException("id가 없습니다."));
//            예외 발생



    }
    public List<Member> findAll(){
        return memberRepository.findAll();
    }
    public void login(String email, String password) throws NoSuchElementException,IllegalArgumentException {
        Optional <Member> member =memberRepository.findByEmail(email);
//        둘중 하나 틀릴때
//        member.filter(a->a.getPassword().equals(password)).orElseThrow(()-> new IllegalArgumentException("email 혹은 password가 잘못됐습니다."));

//        이메일이 틀릴때
        member.orElseThrow(()->new NoSuchElementException("해당하는 이메일이 없습니다."));
//        비밀번호 틀릴때
        member.filter(a->a.getPassword().equals(password)).orElseThrow(()->new IllegalArgumentException("비밀번호가 틀렸습니다."));
        }

    }


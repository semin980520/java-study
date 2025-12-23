package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 저장소역할을 하는 계층
// DB에 CRUD를 수행하는 계층
public class MemberRepository {

    private List<Member> memberList;

    public MemberRepository() {
        this.memberList = new ArrayList<>();
    }

    public void register(Member member) {
        this.memberList.add(member);
    }

    public Optional <Member> findByEmail(String email) {
        Member member = null;
        //        email이 list에 있는지 없는지 확인
        for (Member a : memberList){
            if (a.getEmail().equals(email)){
                member = a;
                break;
            }
        }
        return Optional.ofNullable(member);
    }

    public Optional <Member> findById(long id) {
        Member member = null;
        for (Member a : memberList){
            if (a.getId() == id){
                member = a;
                break;
            }
            }
        return Optional.ofNullable(member);
    }

    public List<Member> findAll() {
        return this.memberList;
    }
}

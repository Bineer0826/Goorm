package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryMemberRepository implements MemberRepository{
    //option+enter 단축키를 이용해서 리포지토리 인터페이스를 상속받고 구현

    private static Map<Long, Member> store = new HashMap<>();
    private static  long sequence = 0L;//0,1,2,... 키값생성

    //여기서는 동시성문제를 고려하지 않았다

    @Override
    public Member save(Member member) { //도메인에 id랑 이름은 넘어온 상태
        member.setId(++sequence);
        store.put(member.getId(), member); //스토어에 저장
        return  member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
        //null이 반환될 가능성을 두고 return을 지우지 않고 옵셔널 적용
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();//옵셔널로 반환
        //람다식을 이용해서 루프돌리고 파라미터 name과 같은지 판단
    }

    @Override
    public List<Member> findALl() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}

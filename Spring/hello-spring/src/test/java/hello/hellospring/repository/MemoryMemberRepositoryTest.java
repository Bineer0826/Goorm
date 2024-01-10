package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
        //Name 중복방지를 위해 리포지토리 데이터를 메서드실행후 지움
        //test는 순서에 상관없이 진행되기 때문
    }
    @Test
    public void save() {
        Member member = new Member();
        member.setName("박가빈");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("아무거나1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("아무거나2");
        repository.save(member2);

        Member result = repository.findByName("아무거나1").get();
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("리스트확인");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("리스트확인2");
        repository.save(member2);

        List<Member> result = repository.findALl();

        assertThat(result.size()).isEqualTo(2);
    }

}

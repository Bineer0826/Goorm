package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //기능은 회원 등록과 조회
    Member save(Member member);//저장
    Optional<Member> findById(Long id);//아이디 찾기 + optional<>은 자바 8에 들어간 기능
    Optional<Member> findByName(String name);//이름찾기
    List<Member> findALl(); //리스트로 모든회원


}

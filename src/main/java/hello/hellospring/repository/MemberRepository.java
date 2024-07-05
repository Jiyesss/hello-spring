package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //회원 저장하면 저장된 회원 반환
    Member save(Member member);
    Optional<Member> findById(Long id); // id로 회원을 찾음
    Optional<Member> findByName(String name);
    List<Member> findAll();

}

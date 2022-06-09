package com.spring.core.member;

public interface MemberRepository {

    // 회원 저장
    void save(Member member);

    // 아이디 기반 회원 찾기
    Member findById(Long memberId);
}

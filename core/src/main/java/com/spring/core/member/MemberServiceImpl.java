package com.spring.core.member;

public class MemberServiceImpl implements MemberService {

    // MemberService는 멤버 관련 서비스에 대한 책임만 갖는다.
    // 어떠한 레포지터리를 사용할지 결정하는 책임은 없다.
    // 따라서 MemberServiceImpl 에 MemoryMemberRepository와 관련한 코드는 없어야한다.

//    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
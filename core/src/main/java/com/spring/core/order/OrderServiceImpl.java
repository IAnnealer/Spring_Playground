package com.spring.core.order;

import com.spring.core.discount.DiscountPolicy;
import com.spring.core.member.Member;
import com.spring.core.member.MemberRepository;

public class OrderServiceImpl implements OrderService{

    // OrderServiceImpl은 OrderService만 진행한다.
    // 따라서 OrderServiceImpl에는 어떠한 구현체의 MemberRepository, discountPolicy를 사용하는지에 대한 관련 정보가 없어야한다.

    // 인터페이스에만 의존, DIP 준수
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member findMember = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(findMember, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}

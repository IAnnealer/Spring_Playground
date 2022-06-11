package com.spring.core.order;

import com.spring.core.member.Grade;
import com.spring.core.member.Member;
import com.spring.core.member.MemberService;
import com.spring.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    OrderService orderService = new OrderServiceImpl();
    MemberService memberService = new MemberServiceImpl();

    @Test
    void createOrder() {
        //given
        Long vipId = 1L;
        Member vip = new Member(vipId, "memberA", Grade.VIP);
        memberService.join(vip);

        Long basicId = 2L;
        Member basic = new Member(basicId, "memberB", Grade.BASIC);
        memberService.join(basic);

        //when
        Order vipOrder = orderService.createOrder(vipId, "itemA", 10000);
        Order basicOrder = orderService.createOrder(basicId, "itemB", 10000);

        //then
        Assertions.assertThat(vipOrder.getDiscountPrice()).isEqualTo(1000);
        Assertions.assertThat(basicOrder.getDiscountPrice()).isEqualTo(0);
    }
}

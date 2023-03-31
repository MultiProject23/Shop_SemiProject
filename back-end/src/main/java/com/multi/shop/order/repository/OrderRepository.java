package com.multi.shop.order.repository;

import com.multi.shop.order.domain.dao.OrderCancelDAO;
import com.multi.shop.order.domain.dao.OrderSaveDAO;
import com.multi.shop.order.domain.vo.OrderFindVO;
import com.multi.shop.order.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class OrderRepository {

    private final OrderMapper orderMapper;

    public Long save(OrderSaveDAO dao) {
        return orderMapper.save(dao);
    }

    public List<OrderFindVO> findByMemberId(Long memberId) {
        return orderMapper.findByMemberId(memberId);
    }

    public void cancel(OrderCancelDAO dao) {
        orderMapper.cancel(dao);
    }
}

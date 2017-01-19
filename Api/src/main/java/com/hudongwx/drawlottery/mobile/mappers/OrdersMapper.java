package com.hudongwx.drawlottery.mobile.mappers;

import com.hudongwx.drawlottery.mobile.commn.BaseMapper;
import com.hudongwx.drawlottery.mobile.entitys.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper extends BaseMapper<Orders> {

    //查询用户订单
    List<Orders> selectByUserAccount(@Param("userAccount") Long userAccount);

    //通过日期查订单
    List<Orders> selectByUserDate(@Param("userAccount") Long userAccount, @Param("dateTime") Long date);

    Orders selectOneByUserDate(@Param("userAccount") Long userAccount, @Param("dateTime") Long date);

    //更新订单付款状态
    Long updatePayState(@Param("orderId") Long orderId, @Param("state") Integer state);

    //更新订单付款状态
    List<Orders> selectUserOrdersByPayState(@Param("userAccountId") Long userAccountId, @Param("state") Integer state);
}
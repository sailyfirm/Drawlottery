package com.hudongwx.drawlottery.mobile.service.commodity;

import com.hudongwx.drawlottery.mobile.entitys.PrepaidCard;

import java.util.List;
import java.util.Map;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author Kiter
 * @version 1.0, 2017/1/5 <br/>
 * @desc <p>
 * <p>
 * 创建　kiter　2017/1/5 9:33　<br/>
 * <p>
 *      充值卡service
 * <p>
 * @email 346905702@qq.com
 */
public interface IPrepaidCardService {

    //添加虚拟充值卡
    boolean addCard(PrepaidCard card);

    //删除
    boolean deleteCard(PrepaidCard card);

    //查看
    List<Map<String,Object>> selectUserCard(Long accountId);

    //修改
    boolean updateUserCard(PrepaidCard card);
}
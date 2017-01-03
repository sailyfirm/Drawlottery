package com.hudongwx.drawlottery.mobile.service.notification.impl;

import com.hudongwx.drawlottery.mobile.entitys.NotificationActivity;
import com.hudongwx.drawlottery.mobile.mappers.NotificationActivityMapper;
import com.hudongwx.drawlottery.mobile.service.notification.INotificationActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author Kiter
 * @version 1.0, 2017/1/3 <br/>
 * @desc <p>
 * <p>
 * 创建　kiter　2017/1/3 15:42　<br/>
 * <p>
 *          活动通知service实现类
 * <p>
 * @email 346905702@qq.com
 */
@Service
public class NotificationActivityServiceImpl implements INotificationActivityService{

    @Autowired
    NotificationActivityMapper mapper;

    /**
     * 添加活动通知
     * @param activity  活动通知对象
     * @return
     */
    @Override
    public boolean addNoticeActivity(NotificationActivity activity) {
        return mapper.insert(activity)>0;
    }

    /**
     * 删除活动通知对象
     * @param activity
     * @return
     */
    @Override
    public boolean deleteNotice(NotificationActivity activity) {
        return mapper.delete(activity)>0;
    }

    /**
     * 查看用户活动通知
     * @param accountId
     * @return
     */
    @Override
    public List<Map<String, Object>> selectAllActivity(Long accountId) {
        NotificationActivity activity = new NotificationActivity();
        activity.setUserAccountId(accountId);
        List<NotificationActivity> list = mapper.select(activity);
        return selectTool(list);
    }

    /**
     * 查询首页活动
     * @return
     */
    public List<Map<String,Object>> selectAll(){
        List<NotificationActivity> list = mapper.selectAll();
        return selectTool(list);
    }

    public List<Map<String,Object>> selectTool(List<NotificationActivity> list){
        List<Map<String, Object>> mapList = new ArrayList<>();
        for (NotificationActivity ac : list){
            Map<String,Object> map = new HashMap<>();
            map.put("id",ac.getId());//添加活动通知ID
            map.put("accountId",ac.getUserAccountId());//添加用户ID
            map.put("title",ac.getNoticeTitle());//添加活动标题
            map.put("coverImgUrl",ac.getNoticeCoverImgUrl());//添加活动封面图
            map.put("noticeUrl",ac.getNoticeUrl());//添加活动详情url
            map.put("sendDate",ac.getSendDate());//添加发送时间
            mapList.add(map);
        }
        return  mapList;
    }
}

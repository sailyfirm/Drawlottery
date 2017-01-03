package com.hudongwx.drawlottery.mobile.entitys;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author Kiter
 * @version 1.0, 2017/1/3 <br/>
 * @desc <p>
 * <p>
 * 创建　kiter　2017/1/3 14:15　<br/>
 * <p>
 *           活动通知实体类
 * <p>
 * @email 346905702@qq.com
 */
public class NotificationActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_account_id")
    private Long userAccountId;

    /**
     * 活动通知标题
     */
    @Column(name = "notice_title")
    private String noticeTitle;

    /**
     * 通知详情url
     */
    @Column(name = "notice_url")
    private String noticeUrl;

    /**
     * 发送时间
     */
    @Column(name = "send_date")
    private Date sendDate;

    /**
     * 活动封面图url
     */
    @Column(name = "notice_cover_img_url")
    private String noticeCoverImgUrl;

    public String getNoticeCoverImgUrl() {
        return noticeCoverImgUrl;
    }

    public void setNoticeCoverImgUrl(String noticeCoverImgUrl) {
        this.noticeCoverImgUrl = noticeCoverImgUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeUrl() {
        return noticeUrl;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}

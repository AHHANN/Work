package com.billink.modules.ops.entity.alipay;

import java.util.Date;

/**
 * @Description:
 * @Program: billink-uatp
 * @Auther: Bryan
 * @Date: 2021/3/23 16:33
 **/
//上传结果查询时需要的分页参数
public class AlipayFileUploadDto {
    private boolean countable = false;
    private Integer pageNo;
    private Integer pageSize;
    /**
     * 开始时间
     */
    private Date beginTime;


    /**
     * 结算时间
     */
    private Date endTime;

    public boolean isCountable() {
        return countable;
    }

    public void setCountable(boolean countable) {
        this.countable = countable;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "AlipayFileUploadDto{" +
                "countable=" + countable +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }
}

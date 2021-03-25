package com.billink.modules.ops.entity.alipay;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @Description:
 * @Program: billink-uatp
 * @Auther: Bryan
 * @Date: 2021/3/15 11:35
 **/
//白名单实体类包括分页参数
public class WhiteListDto implements Serializable {

    private static final long serialVersionUID = -5872276059748897478L;
    /**
     * 序号
     */
    private Integer whiteListId;

    /**
     * 公司ID
     */
    private String partyNo;

    /**
     * 公司名称
     */
    private String partyName;

    /**
     * 员工名称
     */
    private String staffName;

    private String staffStatus;

    /**
     * 电话号码
     */
    private String phoneNum;

    /**
     * 支付宝账号
     */
    private String alipayAccount;

    /**
     * 支付宝会员账号
     */
    private String alipayAccountVip;

    /**
     * 合花账户状态  默认 0 未开通  1 已开通
     */
    private Integer accountStatus;

    /**
     * 状态 0 正常 1 同步中 2 删除
     */
    private Integer status;

    /**
     * 企业合花账户
     */
    private String account;
    /**
     * 创建人
     */
    private String founder;

    /**
     * 创建时间
     */
    private Timestamp  createTime;

    /**
     * 开始时间
     */
    private Date beginTime;

    /**
     * 结束时间
     */
    private Date endTime;

    private boolean countable = Boolean.TRUE;

    private Integer pageNo;
    private Integer pageSize;

    private String accountStatusCN;
    private String statusCN;
    public WhiteListDto() {

    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getWhiteListId() {
        return whiteListId;
    }

    public void setWhiteListId(Integer whiteListId) {
        this.whiteListId = whiteListId;
    }

    public String getPartyNo() {
        return partyNo;
    }

    public void setPartyNo(String partyNo) {
        this.partyNo = partyNo;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public String getAlipayAccountVip() {
        return alipayAccountVip;
    }

    public void setAlipayAccountVip(String alipayAccountVip) {
        this.alipayAccountVip = alipayAccountVip;
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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

    public String getAccountStatusCN() {
        return accountStatusCN;
    }

    public void setAccountStatusCN(String accountStatusCN) {
        this.accountStatusCN = accountStatusCN;
    }

    public String getStatusCN() {
        return statusCN;
    }

    public void setStatusCN(String statusCN) {
        this.statusCN = statusCN;
    }

    @Override
    public String toString() {
        return "WhiteListDto{" +
                "whiteListId=" + whiteListId +
                ", partyNo='" + partyNo + '\'' +
                ", partyName='" + partyName + '\'' +
                ", staffName='" + staffName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", alipayAccount='" + alipayAccount + '\'' +
                ", alipayAccountVip='" + alipayAccountVip + '\'' +
                ", accountStatus=" + accountStatus +
                ", status=" + status +
                ", account='" + account + '\'' +
                ", founder='" + founder + '\'' +
                ", createTime=" + createTime +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", countable=" + countable +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}

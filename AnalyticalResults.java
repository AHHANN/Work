package com.billink.modules.ops.entity.alipay;

/**
 * @Description:
 * @Program: billink-uatp
 * @Auther: Bryan
 * @Date: 2021/3/23 17:16
 * 解析结果
 **/
public class AnalyticalResults {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 对应上传表的ID
     */
    private Integer oid;

    /**
     * 类型  新增or删除
     */
    private String type;
    /**
     * 公司ID
     */
    private String partyNo;
    /**
     * 员工姓名
     */
    private String staffName;
    /**
     * 手机号
     */
    private String phoneNum;
    /**
     * 支付宝账号
     */
    private String alipayAccount;
    /**
     * 企业合花账户
     */
    private String account;
    /**
     * 支付宝会员账号
     */
    private String alipayAccountVip;
    /**
     * 解析结果
     */
    private String analyticalResults;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPartyNo() {
        return partyNo;
    }

    public void setPartyNo(String partyNo) {
        this.partyNo = partyNo;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAlipayAccountVip() {
        return alipayAccountVip;
    }

    public void setAlipayAccountVip(String alipayAccountVip) {
        this.alipayAccountVip = alipayAccountVip;
    }

    public String getAnalyticalResults() {
        return analyticalResults;
    }

    public void setAnalyticalResults(String analyticalResults) {
        this.analyticalResults = analyticalResults;
    }

    @Override
    public String toString() {
        return "AnalyticalResults{" +
                "id=" + id +
                ", oid=" + oid +
                ", type='" + type + '\'' +
                ", partyNo='" + partyNo + '\'' +
                ", staffName='" + staffName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", alipayAccount='" + alipayAccount + '\'' +
                ", account='" + account + '\'' +
                ", alipayAccountVip='" + alipayAccountVip + '\'' +
                ", analyticalResults='" + analyticalResults + '\'' +
                '}';
    }
}

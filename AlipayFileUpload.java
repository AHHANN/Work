package com.billink.modules.ops.entity.alipay;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Program: billink-uatp
 * @Auther: Bryan
 * @Date: 2021/3/19 18:01
 **/
@Entity
@Table(name = "t_alipay_file_upload")
@Proxy(lazy = false)
//文件上传实体类
public class AlipayFileUpload implements Serializable {

    private static final long serialVersionUID = 4150819241038121356L;

    /**
     * 主键ID
     */
    private Integer oid;
    /**
     *文件名称
     */
    private String fileName;
    /**
     *文件类型
     */
    private String fileType;
    /**
     *文件描述
     */
    private String fileDesc;
    /**
     *状态
     */
    private String fileStatus;
    /**
     *文件服务器存储名称
     */
    private String oosFileName;
    /**
     *上传总条数
     */
    private String total;
    /**
     *成功条数
     */
    private String success;
    /**
     *失败条数
     */
    private String fail;
    /**
     *创建人
     */
    private String createUserName;
    /**
     *创建时间
     */
    private Date createTime;


    public AlipayFileUpload() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    @Id
    @GeneratedValue
    @Column(name = "oid")
    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
    @Column(name = "file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    @Column(name = "file_type")
    public String getFileType() {
        return fileType;
    }
    @Access(value=AccessType.PROPERTY)
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    @Column(name = "file_desc")
    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
    }
    @Column(name = "file_status")
    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }
    @Column(name = "oos_file_name")
    public String getOosFileName() {
        return oosFileName;
    }

    public void setOosFileName(String oosFileName) {
        this.oosFileName = oosFileName;
    }
    @Column(name = "total")
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    @Column(name = "success")
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
    @Column(name = "fail")
    public String getFail() {
        return fail;
    }

    public void setFail(String fail) {
        this.fail = fail;
    }
    @Column(name = "create_user_name")
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "AlipayFileUpload{" +
                "oid=" + oid +
                ", fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileDesc='" + fileDesc + '\'' +
                ", fileStatus='" + fileStatus + '\'' +
                ", oosFileName='" + oosFileName + '\'' +
                ", total='" + total + '\'' +
                ", success='" + success + '\'' +
                ", fail='" + fail + '\'' +
                ", createUserName='" + createUserName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}

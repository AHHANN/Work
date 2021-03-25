package com.billink.modules.ops.entity.alipay;

import com.billink.merchant.unionpay.domain.UploadErrorMsg;

import java.util.List;

/**
 * @Description:
 * @Program: billink-uatp
 * @Auther: Bryan
 * @Date: 2021/3/22 16:08
 **/
//存放可以进行数据库操作的集合，以及解析错误的集合
public class WhiteListMid {

    private List<WhiteListDto> addWhiteListDtos;
    private List<WhiteListDto> delWhiteListDtos;
    private List<UploadErrorMsg> addErrorMsgList;
    private List<UploadErrorMsg> delErrorMsgList;

    private List<UploadErrorMsg> errorMsgList;

    public WhiteListMid() {
    }

    public WhiteListMid(List<WhiteListDto> addWhiteListDtos, List<WhiteListDto> delWhiteListDtos, List<UploadErrorMsg> errorMsgList) {
        this.addWhiteListDtos = addWhiteListDtos;
        this.delWhiteListDtos = delWhiteListDtos;
        this.errorMsgList = errorMsgList;
    }

    public List<WhiteListDto> getAddWhiteListDtos() {
        return addWhiteListDtos;
    }

    public void setAddWhiteListDtos(List<WhiteListDto> addWhiteListDtos) {
        this.addWhiteListDtos = addWhiteListDtos;
    }

    public List<WhiteListDto> getDelWhiteListDtos() {
        return delWhiteListDtos;
    }

    public void setDelWhiteListDtos(List<WhiteListDto> delWhiteListDtos) {
        this.delWhiteListDtos = delWhiteListDtos;
    }

    public List<UploadErrorMsg> getErrorMsgList() {
        return errorMsgList;
    }

    public void setErrorMsgList(List<UploadErrorMsg> errorMsgList) {
        this.errorMsgList = errorMsgList;
    }

    public List<UploadErrorMsg> getAddErrorMsgList() {
        return addErrorMsgList;
    }

    public void setAddErrorMsgList(List<UploadErrorMsg> addErrorMsgList) {
        this.addErrorMsgList = addErrorMsgList;
    }

    public List<UploadErrorMsg> getDelErrorMsgList() {
        return delErrorMsgList;
    }

    public void setDelErrorMsgList(List<UploadErrorMsg> delErrorMsgList) {
        this.delErrorMsgList = delErrorMsgList;
    }
}

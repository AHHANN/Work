package com.billink.modules.ops.entity.alipay;

import com.billink.merchant.unionpay.domain.UploadErrorMsg;
import com.billink.merchant.unionpay.domain.UploadFileRequest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Program: billink-uatp
 * @Auther: Bryan
 * @Date: 2021/3/23 11:33
 **/
public class AlipayFileUploadResponse {
    private boolean showResult;

    private Map<String,Object> map = new HashMap<>();

    private List<UploadErrorMsg> errorMsgs = new LinkedList<>();

    public boolean isShowResult() {
        return showResult;
    }

    public void setShowResult(boolean showResult) {
        this.showResult = showResult;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<UploadErrorMsg> getErrorMsgs() {
        return errorMsgs;
    }

    public void setErrorMsgs(List<UploadErrorMsg> errorMsgs) {
        this.errorMsgs = errorMsgs;
    }

    @Override
    public String toString() {
        return "AlipayFileUploadResponse{" +
                "showResult=" + showResult +
                ", map=" + map +
                ", errorMsgs=" + errorMsgs +
                '}';
    }
}

package com.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by Administrator on 2018/3/14.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
public class ReturnCode {
    @XmlElement(name="ResultCode")
    private Integer resultCode;

    @XmlElement(name="ErrorMsg")
    private String errorMsg;

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}

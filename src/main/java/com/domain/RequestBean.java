package com.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Administrator on 2018/3/13.
 */
@XmlRootElement
public class RequestBean {
    private String patientNo;
    private String visitid;
    private String roomId;
    private String deptId;
    private String chargeCode;
    private String chargeName;
    private String ybchargeCode;
    private String chargePrice;
    private String userNumber;
    private String userName;
    private String uploadFlag;
    private String quantity;
    private String operationTime;
    private String accountdeptid;
    private String spec;

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getVisitid() {
        return visitid;
    }

    public void setVisitid(String visitid) {
        this.visitid = visitid;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    public String getYbchargeCode() {
        return ybchargeCode;
    }

    public void setYbchargeCode(String ybchargeCode) {
        this.ybchargeCode = ybchargeCode;
    }

    public String getChargePrice() {
        return chargePrice;
    }

    public void setChargePrice(String chargePrice) {
        this.chargePrice = chargePrice;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(String uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public String getAccountdeptid() {
        return accountdeptid;
    }

    public void setAccountdeptid(String accountdeptid) {
        this.accountdeptid = accountdeptid;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}

package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Device implements Serializable {
    @Id
    private Integer deviceid;

    private String devicename;

    private String deviceram;

    private String color;

    private String price;

    private String status;

    private static final long serialVersionUID = 1L;

    /**
     * @return deviceid
     */
    public Integer getDeviceid() {
        return deviceid;
    }

    /**
     * @param deviceid
     */
    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * @return devicename
     */
    public String getDevicename() {
        return devicename;
    }

    /**
     * @param devicename
     */
    public void setDevicename(String devicename) {
        this.devicename = devicename == null ? null : devicename.trim();
    }

    /**
     * @return deviceram
     */
    public String getDeviceram() {
        return deviceram;
    }

    /**
     * @param deviceram
     */
    public void setDeviceram(String deviceram) {
        this.deviceram = deviceram == null ? null : deviceram.trim();
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deviceid=").append(deviceid);
        sb.append(", devicename=").append(devicename);
        sb.append(", deviceram=").append(deviceram);
        sb.append(", color=").append(color);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}
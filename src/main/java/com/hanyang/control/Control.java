package com.hanyang.control;

import com.hanyang.core.BaseEntity;
import com.hanyang.device.Device;
import com.hanyang.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Control extends BaseEntity {
    private String name;
    @ManyToOne
    private Device device;
    private Integer value;
    @ManyToOne
    private User lastModifiedBy;

    protected Control() {
        super();
    }

    public Control(String name, Device device, Integer value, User lastModifiedBy) {
        this.name = name;
        this.device = device;
        this.value = value;
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public User getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
}

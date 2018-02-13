package com.hanyang.room;

import com.hanyang.core.BaseEntity;
import com.hanyang.device.Device;
import com.hanyang.user.User;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Room extends BaseEntity {
    private String name;
    @Size(max = 1000)
    private Integer area;
    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Device> devices;
    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<User> administrators;

    protected Room() {
        super();
    }

    public Room(String name, Integer area, List<Device> devices, List<User> administrators) {
        super();
        this.name = name;
        this.area = area;
        this.devices = devices;
        this.administrators = administrators;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<User> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<User> administrators) {
        this.administrators = administrators;
    }
}

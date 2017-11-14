package com.goodsoft.hotel.domain.entity.cookbook;

import java.util.Objects;

/**
 * description:
 * ===>菜单类型实体
 *
 * @author 严彬荣 Created on 2017-11-11 16:47
 */
public class MenuType implements java.io.Serializable {

    private static final long serialVersionUID = 6309767747012396344L;
    private String id;
    private int tid;
    private String tName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuType)) return false;
        MenuType menuType = (MenuType) o;
        return tid == menuType.tid &&
                Objects.equals(id, menuType.id) &&
                Objects.equals(tName, menuType.tName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tid, tName);
    }
}

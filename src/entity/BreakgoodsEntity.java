package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "breakgoods", schema = "store", catalog = "")
public class BreakgoodsEntity {
    private short id;
    private String goodsName;
    private Integer count;
    private Timestamp breakdate;
    private Short staffId;

    @Id
    @Column(name = "id", nullable = false)
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "goods_name", nullable = true, length = 15)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "count", nullable = true)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "breakdate", nullable = true)
    public Timestamp getBreakdate() {
        return breakdate;
    }

    public void setBreakdate(Timestamp breakdate) {
        this.breakdate = breakdate;
    }

    @Basic
    @Column(name = "staff_id", nullable = true)
    public Short getStaffId() {
        return staffId;
    }

    public void setStaffId(Short staffId) {
        this.staffId = staffId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BreakgoodsEntity that = (BreakgoodsEntity) o;

        if (id != that.id) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (breakdate != null ? !breakdate.equals(that.breakdate) : that.breakdate != null) return false;
        if (staffId != null ? !staffId.equals(that.staffId) : that.staffId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (breakdate != null ? breakdate.hashCode() : 0);
        result = 31 * result + (staffId != null ? staffId.hashCode() : 0);
        return result;
    }

}

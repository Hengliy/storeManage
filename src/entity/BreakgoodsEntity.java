package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

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
        return id == that.id &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(count, that.count) &&
                Objects.equals(breakdate, that.breakdate) &&
                Objects.equals(staffId, that.staffId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, goodsName, count, breakdate, staffId);
    }
}

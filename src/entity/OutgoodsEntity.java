package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "outgoods", schema = "store", catalog = "")
public class OutgoodsEntity {
    private short id;
    private String num;
    private String goodsName;
    private Integer count;
    private Timestamp outdate;
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
    @Column(name = "num", nullable = false, length = 10)
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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
    @Column(name = "outdate", nullable = true)
    public Timestamp getOutdate() {
        return outdate;
    }

    public void setOutdate(Timestamp outdate) {
        this.outdate = outdate;
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
        OutgoodsEntity that = (OutgoodsEntity) o;
        return id == that.id &&
                Objects.equals(num, that.num) &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(count, that.count) &&
                Objects.equals(outdate, that.outdate) &&
                Objects.equals(staffId, that.staffId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, num, goodsName, count, outdate, staffId);
    }
}

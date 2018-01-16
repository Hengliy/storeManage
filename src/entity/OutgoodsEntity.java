package entity;

import javax.persistence.*;
import java.sql.Timestamp;

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

        if (id != that.id) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (outdate != null ? !outdate.equals(that.outdate) : that.outdate != null) return false;
        if (staffId != null ? !staffId.equals(that.staffId) : that.staffId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (outdate != null ? outdate.hashCode() : 0);
        result = 31 * result + (staffId != null ? staffId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OutgoodsEntity{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", count=" + count +
                ", outdate=" + outdate +
                ", staffId=" + staffId +
                '}';
    }
}

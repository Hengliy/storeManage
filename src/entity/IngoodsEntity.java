package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "ingoods", schema = "store", catalog = "")
public class IngoodsEntity {
    private short id;
    private String goodsName;
    private BigDecimal inprice;
    private BigDecimal oldInprice;
    private Integer count;
    private Timestamp indate;
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
    @Column(name = "inprice", nullable = true, precision = 2)
    public BigDecimal getInprice() {
        return inprice;
    }

    public void setInprice(BigDecimal inprice) {
        this.inprice = inprice;
    }

    @Basic
    @Column(name = "old_inprice", nullable = true, precision = 2)
    public BigDecimal getOldInprice() {
        return oldInprice;
    }

    public void setOldInprice(BigDecimal oldInprice) {
        this.oldInprice = oldInprice;
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
    @Column(name = "indate", nullable = true)
    public Timestamp getIndate() {
        return indate;
    }

    public void setIndate(Timestamp indate) {
        this.indate = indate;
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

        IngoodsEntity that = (IngoodsEntity) o;

        if (id != that.id) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (inprice != null ? !inprice.equals(that.inprice) : that.inprice != null) return false;
        if (oldInprice != null ? !oldInprice.equals(that.oldInprice) : that.oldInprice != null) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (indate != null ? !indate.equals(that.indate) : that.indate != null) return false;
        if (staffId != null ? !staffId.equals(that.staffId) : that.staffId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (inprice != null ? inprice.hashCode() : 0);
        result = 31 * result + (oldInprice != null ? oldInprice.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        result = 31 * result + (staffId != null ? staffId.hashCode() : 0);
        return result;
    }

}

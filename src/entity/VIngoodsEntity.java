package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "v_ingoods", schema = "store", catalog = "")
public class VIngoodsEntity {
    private short id;
    private String goodsName;
    private String kindName;
    private String productorName;
    private Integer count;
    private BigDecimal inprice;
    private Timestamp indate;
    private String username;

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
    @Column(name = "kind_name", nullable = true, length = 10)
    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    @Basic
    @Column(name = "productor_name", nullable = true, length = 10)
    public String getProductorName() {
        return productorName;
    }

    public void setProductorName(String productorName) {
        this.productorName = productorName;
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
    @Column(name = "inprice", nullable = true, precision = 2)
    public BigDecimal getInprice() {
        return inprice;
    }

    public void setInprice(BigDecimal inprice) {
        this.inprice = inprice;
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
    @Column(name = "username", nullable = false, length = 10)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VIngoodsEntity that = (VIngoodsEntity) o;

        if (id != that.id) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (kindName != null ? !kindName.equals(that.kindName) : that.kindName != null) return false;
        if (productorName != null ? !productorName.equals(that.productorName) : that.productorName != null)
            return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (inprice != null ? !inprice.equals(that.inprice) : that.inprice != null) return false;
        if (indate != null ? !indate.equals(that.indate) : that.indate != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (kindName != null ? kindName.hashCode() : 0);
        result = 31 * result + (productorName != null ? productorName.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (inprice != null ? inprice.hashCode() : 0);
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "VIngoodsEntity{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", kindName='" + kindName + '\'' +
                ", productorName='" + productorName + '\'' +
                ", count=" + count +
                ", inprice=" + inprice +
                ", indate=" + indate +
                ", username='" + username + '\'' +
                '}';
    }
}

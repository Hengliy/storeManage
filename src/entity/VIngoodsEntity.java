package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

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
        return id == that.id &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(kindName, that.kindName) &&
                Objects.equals(productorName, that.productorName) &&
                Objects.equals(count, that.count) &&
                Objects.equals(inprice, that.inprice) &&
                Objects.equals(indate, that.indate) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, goodsName, kindName, productorName, count, inprice, indate, username);
    }
}

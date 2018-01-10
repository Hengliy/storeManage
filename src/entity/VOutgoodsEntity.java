package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "v_outgoods", schema = "store", catalog = "")
public class VOutgoodsEntity {
    private short id;
    private String num;
    private String goodsName;
    private String kindName;
    private String productorName;
    private Integer count;
    private Timestamp outdate;
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
    @Column(name = "outdate", nullable = true)
    public Timestamp getOutdate() {
        return outdate;
    }

    public void setOutdate(Timestamp outdate) {
        this.outdate = outdate;
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
        VOutgoodsEntity that = (VOutgoodsEntity) o;
        return id == that.id &&
                Objects.equals(num, that.num) &&
                Objects.equals(goodsName, that.goodsName) &&
                Objects.equals(kindName, that.kindName) &&
                Objects.equals(productorName, that.productorName) &&
                Objects.equals(count, that.count) &&
                Objects.equals(outdate, that.outdate) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, num, goodsName, kindName, productorName, count, outdate, username);
    }
}

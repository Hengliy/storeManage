package entity;

import javax.persistence.*;
import java.sql.Timestamp;

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

        if (id != that.id) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (kindName != null ? !kindName.equals(that.kindName) : that.kindName != null) return false;
        if (productorName != null ? !productorName.equals(that.productorName) : that.productorName != null)
            return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (outdate != null ? !outdate.equals(that.outdate) : that.outdate != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (kindName != null ? kindName.hashCode() : 0);
        result = 31 * result + (productorName != null ? productorName.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (outdate != null ? outdate.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}

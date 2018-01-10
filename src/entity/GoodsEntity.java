package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "goods", schema = "store", catalog = "")
public class GoodsEntity {
    private int id;
    private String name;
    private String kindName;
    private String productorName;
    private Long count;
    private BigDecimal inprice;
    private BigDecimal outprice;
    private BigDecimal discount;
    private Integer minNum;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 15)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public Long getCount() {
        return count;
    }

    public void setCount(long count) {
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
    @Column(name = "outprice", nullable = true, precision = 2)
    public BigDecimal getOutprice() {
        return outprice;
    }

    public void setOutprice(BigDecimal outprice) {
        this.outprice = outprice;
    }

    @Basic
    @Column(name = "discount", nullable = true, precision = 2)
    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "min_num", nullable = true)
    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEntity that = (GoodsEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (kindName != null ? !kindName.equals(that.kindName) : that.kindName != null) return false;
        if (productorName != null ? !productorName.equals(that.productorName) : that.productorName != null)
            return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (inprice != null ? !inprice.equals(that.inprice) : that.inprice != null) return false;
        if (outprice != null ? !outprice.equals(that.outprice) : that.outprice != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (minNum != null ? !minNum.equals(that.minNum) : that.minNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (kindName != null ? kindName.hashCode() : 0);
        result = 31 * result + (productorName != null ? productorName.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (inprice != null ? inprice.hashCode() : 0);
        result = 31 * result + (outprice != null ? outprice.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (minNum != null ? minNum.hashCode() : 0);
        return result;
    }

}

package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

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

    public void setCount(Long count) {
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
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(kindName, that.kindName) &&
                Objects.equals(productorName, that.productorName) &&
                Objects.equals(count, that.count) &&
                Objects.equals(inprice, that.inprice) &&
                Objects.equals(outprice, that.outprice) &&
                Objects.equals(discount, that.discount) &&
                Objects.equals(minNum, that.minNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, kindName, productorName, count, inprice, outprice, discount, minNum);
    }
}

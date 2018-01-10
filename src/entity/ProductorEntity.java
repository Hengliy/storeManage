package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "productor", schema = "store", catalog = "")
public class ProductorEntity {
    private short id;
    private String name;
    private String person;
    private String tel;
    private String companyTel;
    private String postcode;
    private String address;

    @Id
    @Column(name = "id", nullable = false)
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "person", nullable = true, length = 10)
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Basic
    @Column(name = "tel", nullable = true, length = 15)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "company_tel", nullable = true, length = 15)
    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    @Basic
    @Column(name = "postcode", nullable = true, length = 10)
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 30)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductorEntity that = (ProductorEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(person, that.person) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(companyTel, that.companyTel) &&
                Objects.equals(postcode, that.postcode) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, person, tel, companyTel, postcode, address);
    }
}

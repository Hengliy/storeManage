package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "staff", schema = "store", catalog = "")
public class StaffEntity {
    private short id;
    private String username;
    private String sex;
    private Date broth;
    private String tel;
    private String password;

    @Id
    @Column(name = "id", nullable = false)
    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 10)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "broth", nullable = true)
    public Date getBroth() {
        return broth;
    }

    public void setBroth(Date broth) {
        this.broth = broth;
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
    @Column(name = "password", nullable = true, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffEntity that = (StaffEntity) o;
        return id == that.id &&
                Objects.equals(username, that.username) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(broth, that.broth) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, sex, broth, tel, password);
    }
}

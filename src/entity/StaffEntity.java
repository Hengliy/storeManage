package entity;

import javax.persistence.*;
import java.sql.Date;

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

        if (id != that.id) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (broth != null ? !broth.equals(that.broth) : that.broth != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (broth != null ? broth.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}

package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kind", schema = "store", catalog = "")
public class KindEntity {
    private short id;
    private String name;
    private Short count;

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
    @Column(name = "count", nullable = true)
    public Short getCount() {
        return count;
    }

    public void setCount(Short count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KindEntity that = (KindEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, count);
    }
}

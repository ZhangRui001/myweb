package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

//javaBean
public class User implements Serializable {
    private Integer sno;
    private String cno;
    private Integer degree;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return Objects.equals(sno, user.sno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno);
    }

    @Override
    public String toString() {
        return "User{" +
                "sno=" + sno +
                ", cno='" + cno + '\'' +
                ", degree=" + degree +
                '}';
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Integer getSno() {
        return sno;
    }

    public String getCno() {
        return cno;
    }

    public Integer getDegree() {
        return degree;
    }

    public User(Integer sno, String cno, Integer degree) {
        this.sno = sno;
        this.cno = cno;
        this.degree = degree;
    }

    public User() {
    }

}
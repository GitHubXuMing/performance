package com.oasis.performancedao;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Table(name = "product")
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue
    private int pid;
    private String pname;
    private BigDecimal price;
    private Date pdate;

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", pdate=" + pdate +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Product(String pname, BigDecimal price, Date pdate) {
        this.pname = pname;
        this.price = price;
        this.pdate = pdate;
    }

    public Product(int pid, String pname, BigDecimal price, Date pdate) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.pdate = pdate;
    }

    public Product() {
    }
}

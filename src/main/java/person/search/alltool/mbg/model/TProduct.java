package person.search.alltool.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TProduct implements Serializable {
    /**
     * 编号
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 产品名称
     *
     * @mbggenerated
     */
    private String productName;

    /**
     * 库存
     *
     * @mbggenerated
     */
    private Integer stock;

    /**
     * 价格
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * 版本号
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * 备注
     *
     * @mbggenerated
     */
    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productName=").append(productName);
        sb.append(", stock=").append(stock);
        sb.append(", price=").append(price);
        sb.append(", version=").append(version);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
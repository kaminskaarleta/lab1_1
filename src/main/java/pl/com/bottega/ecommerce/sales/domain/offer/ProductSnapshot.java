package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class ProductSnapshot {
	private String productId;
	private BigDecimal productPrice;
	private String productName;
	private Date productSnapshotDate;
	private String productType;
	
	public ProductSnapshot(String productId, BigDecimal productPrice,
			String productName, Date productSnapshotDate, String productType) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
		this.productSnapshotDate = productSnapshotDate;
		this.productType = productType;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public Date getProductSnapshotDate() {
		return productSnapshotDate;
	}
	
	public String getProductType() {
		return productType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productPrice == null) ? 0 : productPrice.hashCode());
		result = prime * result
				+ ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductSnapshot other = (ProductSnapshot) obj;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice == null) {
			if (other.productPrice != null)
				return false;
		} else if (!productPrice.equals(other.productPrice))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productType != other.productType)
			return false;
		return true;
	}
}

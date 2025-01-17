package com.model;

import javax.persistence.*;

@Entity
@Table(name = "gift")
public class Gift {

    @Id
    @Column(name = "GiftId",length=5)
    private int giftId;
    @Column(name="Giftname",length=10)
    private String giftName;
    @Column(name="GiftCA",length=10)

    private String category;
    @Column(name="GiftPrice",length=10)

    private float price;
	public Gift() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gift(int giftId, String giftName, String category, float price) {
		super();
		this.giftId = giftId;
		this.giftName = giftName;
		this.category = category;
		this.price = price;
	}
	public int getGiftId() {
		return giftId;
	}
	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}
	public String getGiftName() {
		return giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Gift [giftId=" + giftId + ", giftName=" + giftName + ", category=" + category + ", price=" + price
				+ "]";
	}

 
}

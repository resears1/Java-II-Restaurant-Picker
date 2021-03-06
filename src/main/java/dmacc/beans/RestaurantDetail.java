package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class RestaurantDetail {
	//This is the "type of food"
	private String type;
	private int partySize;
	private int distance;
	private boolean hasKidsMenu;
	public String descr;
	
	public RestaurantDetail() {
		super();
	}
	
	public RestaurantDetail(String type, int partySize, int distance, boolean hasKidsMenu, String descr) {
		super();
		this.type = type;
		this.partySize = partySize;
		this.distance = distance;
		this.hasKidsMenu = hasKidsMenu;
		this.descr=descr;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPartySize() {
		return partySize;
	}
	public void setPartySize(int partySize) {
		this.partySize = partySize;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public boolean getHasKidsMenu() {
		return hasKidsMenu;
	}
	public void setHasKidsMenu(boolean hasKidsMenu) {
		this.hasKidsMenu = hasKidsMenu;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	
	
}

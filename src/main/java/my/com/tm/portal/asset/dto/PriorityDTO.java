package my.com.tm.portal.asset.dto;

import java.io.Serializable;

public class PriorityDTO implements Serializable {

	private static final long serialVersionUID = 7648923418147774757L;

	private int high = 0;
	private int medium = 0;
	private int low = 0;
	private int external = 0;

	public PriorityDTO(int high, int medium, int low) {
		super();
		this.high = high;
		this.medium = medium;
		this.low = low;
	}

	public PriorityDTO(int high, int medium, int low, int external) {
		super();
		this.high = high;
		this.medium = medium;
		this.low = low;
		this.external = external;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getMedium() {
		return medium;
	}

	public void setMedium(int medium) {
		this.medium = medium;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public int getExternal() {
		return external;
	}

	public void setExternal(int external) {
		this.external = external;
	}

}

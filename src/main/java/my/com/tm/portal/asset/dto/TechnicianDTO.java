package my.com.tm.portal.asset.dto;

import java.io.Serializable;

public class TechnicianDTO implements Serializable {

	private static final long serialVersionUID = 4697318526735697037L;

	private Integer tenchnicianId;
	private String name;
	private String workCenter;
	private int totalOpenSr;
	private PriorityDTO priority;
	private String trade;


	public Integer getTenchnicianId() {
		return tenchnicianId;
	}

	public void setTenchnicianId(Integer tenchnicianId) {
		this.tenchnicianId = tenchnicianId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkCenter() {
		return workCenter;
	}

	public void setWorkCenter(String workCenter) {
		this.workCenter = workCenter;
	}

	public int getTotalOpenSr() {
		return totalOpenSr;
	}

	public void setTotalOpenSr(int totalOpenSr) {
		this.totalOpenSr = totalOpenSr;
	}

	public PriorityDTO getPriority() {
		return priority;
	}

	public void setPriority(PriorityDTO priority) {
		this.priority = priority;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

}

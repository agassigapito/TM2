package my.com.tm.portal.asset.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ADMIN_USER")
public class AdminUser implements Serializable{

	private static final long serialVersionUID = 449024963110190312L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "admin_user_id")
	private Integer id;

	@Column(name="adfs_name")
	private String fullName;

	@Column(name = "is_super_admin")
	private boolean superAdmin;

	@Column(name = "last_login_success")
	@JsonFormat(pattern = "yyyy/MM/dd h:mm a",timezone="GMT+8")
	private Date lastLoginSuccess;

	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	@Column(name = "last_modified")
	@JsonFormat(pattern = "yyyy/MM/dd h:mm a",timezone="GMT+8")
	private Date lastModified;

	@Column(name = "status")
	private boolean status;

	@Column(name="session_token")
	private String sessionToken;

	@Column(name="adfs_sam_account_name")
	private String samaAccountName;

	public List<NotificationAdmin> getNotificationAdminList() {
		return notificationAdminList;
	}

	public void setNotificationAdminList(List<NotificationAdmin> notificationAdminList) {
		this.notificationAdminList = notificationAdminList;
	}

	@OneToMany(mappedBy = "adminUser",
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<NotificationAdmin> notificationAdminList = new ArrayList<>();

	public void addNotifications(NotificationAdmin notif){
		notificationAdminList.add(notif);
		notif.setAdminUser(this);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getLastLoginSuccess() {
		return lastLoginSuccess;
	}

	public void setLastLoginSuccess(Date lastLoginSuccess) {
		this.lastLoginSuccess = lastLoginSuccess;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getSamaAccountName() {
		return samaAccountName;
	}

	public void setSamaAccountName(String samaAccountName) {
		this.samaAccountName = samaAccountName;
	}

	public boolean isSuperAdmin() {
		return superAdmin;
	}

	public void setSuperAdmin(boolean superAdmin) {
		this.superAdmin = superAdmin;
	}

}

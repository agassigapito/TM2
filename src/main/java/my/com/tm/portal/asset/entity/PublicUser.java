package my.com.tm.portal.asset.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "PUBLIC_USER")
public class PublicUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "public_user_id")
	private Long id;

	@Email
	private String email;

	private String password;

	@Column(name = "bp_number")
	private String bpNumber;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String category;

	@Column(name = "sub_category")
	private String subCategory;

	@Column(name = "date_created")
	private Date dateCreated;

	private String status;

	@Column(name = "last_login_success")
	private Date lastLoginSuccess;

	@Column(name = "last_login_failed")
	private Date lastLoginFailed;

	@Column(name = "login_attempt")
	private Integer loginAttempt;

	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	@Column(name = "last_modified")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd h:mm a")
	private Date lastModified;

	@Column(name = "is_suspended")
	private boolean suspended;

	@Column(name = "request_id")
	private String requestId;

	@Column(name = "id_type")
	private Integer idType;

	@Column(name = "id_number")
	private String idNumber;

	@Column(name="user_token")
	private String userToken;
	
	@Transient
	private String fullName;
	
	
	public String getFullName() {
		return firstName +" " + lastName;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	@Column(name="is_shop_individual")
	private String isShopIndividual;

	@Column(name="is_corporate_indicator")
	private String isCorporateIndicator;

	@Column(name="tc_indicator")
	private boolean tcIndicator;



	@Column(name="auth_token")
	private String authToken;

	@Column(name="expiration_time")
	private long expirationTime;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "PUBLIC_ACCOUNT_ASSIGNED_ROLES",
			joinColumns = @JoinColumn(name = "user_id") ,
			inverseJoinColumns =  @JoinColumn(name = "role_id") )
	List<PublicRole> publicRoles = new ArrayList<>();

	@Column(name = "created_by")
	private String createdBy;

	public List<PublicRole> getPublicRoles() {
		return publicRoles;
	}

	public void setPublicRoles(List<PublicRole> publicRoles) {
		this.publicRoles = publicRoles;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public long getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(long expirationTime) {
		this.expirationTime = expirationTime;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}




	public boolean isTcIndicator() {
		return tcIndicator;
	}

	public void setTcIndicator(boolean tcIndicator) {
		this.tcIndicator = tcIndicator;
	}

	public String getIsShopIndividual() {
		return isShopIndividual;
	}

	public void setIsShopIndividual(String isShopIndividual) {
		this.isShopIndividual = isShopIndividual;
	}

	public String getIsCorporateIndicator() {
		return isCorporateIndicator;
	}

	public void setIsCorporateIndicator(String isCorporateIndicator) {
		this.isCorporateIndicator = isCorporateIndicator;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBpNumber() {
		return bpNumber;
	}

	public void setBpNumber(String bpNumber) {
		this.bpNumber = bpNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastLoginSuccess() {
		return lastLoginSuccess;
	}

	public void setLastLoginSuccess(Date lastLoginSuccess) {
		this.lastLoginSuccess = lastLoginSuccess;
	}

	public Date getLastLoginFailed() {
		return lastLoginFailed;
	}

	public void setLastLoginFailed(Date lastLoginFailed) {
		this.lastLoginFailed = lastLoginFailed;
	}

	public Integer getLoginAttempt() {
		return loginAttempt;
	}

	public void setLoginAttempt(Integer loginAttempt) {
		this.loginAttempt = loginAttempt;
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

	public boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getIdType() {
		return idType;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

}

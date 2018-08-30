package my.com.tm.portal.asset.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "PUBLIC_ACCOUNT")
public class PublicAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "super_admin")
    private Boolean superAdmin;

    @Column(name = "last_login_success")
    @JsonFormat(pattern = "yyyy/MM/dd h:mm a")
    private Date lastLoginSuccess;

    @Column(name = "last_modified_by")
    @JsonFormat(pattern = "yyyy/MM/dd h:mm a")
    private String lastModifiedBy;

    @Column(name = "last_modified")
    @JsonFormat(pattern = "yyyy/MM/dd h:mm a")
    private Date lastModified;

    @Column(name = "status")
    private boolean status;


    @Column(name = "created_by")
    private String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public Date getLastLoginSuccess() {
        return lastLoginSuccess;
    }

    public void setLastLoginSuccess(Date lastLoginSuccess) {
        this.lastLoginSuccess = lastLoginSuccess;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Boolean getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
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

}

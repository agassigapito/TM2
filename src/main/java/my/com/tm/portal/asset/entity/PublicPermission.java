package my.com.tm.portal.asset.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PUBLIC_PERMISSIONS")
public class PublicPermission {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer permissionId;

    @Column(name = "permission_name")
    private String permissionName;

    @JsonIgnore
    @ManyToMany(mappedBy = "publicPermissions")
    private Set<PublicRole> roles = new HashSet<>();

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Set<PublicRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<PublicRole> roles) {
        this.roles = roles;
    }


}

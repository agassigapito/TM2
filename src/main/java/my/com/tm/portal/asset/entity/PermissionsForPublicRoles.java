package my.com.tm.portal.asset.entity;

import javax.persistence.*;

@Entity
@Table(name = "PERMISSIONS_FOR_PUBLIC_ROLES")
public class PermissionsForPublicRoles {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name = "role_id")
    private Integer roleLinkId;

    @Column(name = "permission_id")
    private Integer permissionLinkId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionLinkId() {
        return permissionLinkId;
    }

    public void setPermissionLinkId(Integer permissionLinkId) {
        this.permissionLinkId = permissionLinkId;
    }

    public Integer getRoleLinkId() {
        return roleLinkId;
    }

    public void setRoleLinkId(Integer roleLinkId) {
        this.roleLinkId = roleLinkId;
    }


}

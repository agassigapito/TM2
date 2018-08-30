package my.com.tm.portal.asset.entity;

import my.com.tm.portal.asset.auditing.Modifiable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "NOTIFICATIONS_PUBLIC")
public class NotificationPublic extends Modifiable<String> implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="notification_id")
    private Integer id;

    @NotNull
    @Column(name = "message")
    private String message;

    @NotNull
    @Column(name = "notified_on")
    private String notifiedOn;

    @NotNull
    @Column(name = "is_prioritized")
    private Boolean isPrioritized;

    @NotNull
    @Column(name = "is_read")
    private Boolean isRead;

    @NotNull
    @Column(name = "user_id")
    private Integer userId;

    public NotificationPublic(){

    }

    public NotificationPublic(String message, String notifiedOn, Boolean isPrioritized, Boolean isRead, Integer userId){
        this.userId = userId;
        this.isPrioritized = isPrioritized;
        this.isRead = isRead;
        this.message = message;
        this.notifiedOn = notifiedOn;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNotifiedOn() {
        return notifiedOn;
    }

    public void setNotifiedOn(String notifiedOn) {
        this.notifiedOn = notifiedOn;
    }

    public Boolean getPrioritized() {
        return isPrioritized;
    }

    public void setPrioritized(Boolean prioritized) {
        isPrioritized = prioritized;
    }

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }
}

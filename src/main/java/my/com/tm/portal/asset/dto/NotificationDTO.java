package my.com.tm.portal.asset.dto;

public class NotificationDTO {
    private String message;

    private String notifiedOn;

    private Boolean isPrioritized;

    private Boolean isRead;

    private Integer id;

    public NotificationDTO(){

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

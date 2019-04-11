package capstone.notificationServer;


import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="notifications")
public class notifications {

    @Id
    @Column(name="alertID")
    public Integer alertID;

    @Column(name="description")
    public String description;


    public Integer getAlertID() {
        return this.alertID;
    }

    public void setAlertID(Integer id) {
        this.alertID = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }
}

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author atul
 * @LastUpdated By abc on 26th Dec
 */
@Entity
public class Person {

    private Integer persionid;
    private String persionname;
    private String phone;

    /*
    getters and setters for all fields.
     */
    public Integer getPersionid() {
        return persionid;
    }

    public void setPersionid(Integer persionid) {
        this.persionid = persionid;
    }

    public String getPersionname() {
        return persionname;
    }

    public void setPersionname(String persionname) {
        this.persionname = persionname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}

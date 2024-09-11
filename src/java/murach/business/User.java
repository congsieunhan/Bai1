
package murach.business;
import java.io.Serializable;
public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String date;
    private String radio;
    private String checkBox;
    private String comBoBox;
    public User (String firstName, String lastName, String email,String date ,String radio,String checkBox, String comBoBox) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date = date;
        this.radio = radio;
        this.checkBox = checkBox;
        this.comBoBox =comBoBox;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }
    public String getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(String checkBox) {
        this.checkBox = checkBox;
    }
    public String getComBoBox() {
        return comBoBox;
    }
    public void setComBoBox(String comBoBox) {
        this.comBoBox = comBoBox;
    }
}
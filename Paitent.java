package dermatologyclinic11;

/**
 *
 * @author 
 */
public class Paitent extends User {

    //***************************************<Variables>***************************************************
    private int paitentPhone ;

    //***************************************<Constructors>***************************************************  

    /**
     * Constructor
     */
    public Paitent() {
    }

    /**
     *
     * @param name
     * @param email
     * @param phone
     */
    public Paitent(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.paitentPhone = phone;

    }

    //***************************************<Methods>***************************************************
    // to take information from paitent 

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return
     */
    public int getPaitentPhone() {
        return paitentPhone;
    }

    /**
     *
     * @param paitentPhone
     */
    public void setPaitentPhone(int paitentPhone) {
        this.paitentPhone = paitentPhone;
    }

    /**
     *
     * @return
     */
    public String getPaitentEmail() {
        return email;
    }

    /**
     *
     * @param paitentEmail
     */
    public void setPaitentEmail(String paitentEmail) {
        this.email = paitentEmail;
    }

    /**
     *
     */
    @Override
    public void printUserInfo() { // to print information of paitent 
        System.out.println("paitent name is " + name + ", paitent phone is" + paitentPhone + ", paitent email is " + email);
    }

    /*@Override
    public String toString() {
        return "paitentName=" + name + ", paitentPhone=" + paitentPhone + ", paitentEmail=" + email;
    }*/
}   


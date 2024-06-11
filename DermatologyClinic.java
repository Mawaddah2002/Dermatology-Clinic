package dermatologyclinic11;

/**
 *
 * @author
 */
public class DermatologyClinic {

    //***************************************<Variables>*************************************************
    private int ClinicID;
    private String ClinicName;
    private String workTime;

    //***************************************<Constructors>**********************************************
    /**
     * Constructor
     */
    public DermatologyClinic() {
    }

    /**
     *
     * @param id
     * @param ClinicName
     */
    public DermatologyClinic(int id, String ClinicName) {
        this.ClinicID = id;
        this.ClinicName = ClinicName;

    }

    //***************************************<Methods>***************************************************
    /**
     *
     * @return
     */
    public int getClinicID() {
        return ClinicID;
    }

    /**
     *
     * @param ClinicID
     */
    public void setClinicID(int ClinicID) {
        this.ClinicID = ClinicID;
    }

    /**
     *
     * @return
     */
    public String getClinicName() {
        return ClinicName;
    }

    /**
     *
     * @param ClinicName
     */
    public void setClinicName(String ClinicName) {
        this.ClinicName = ClinicName;
    }

    /**
     *
     * @return
     */
    public String getWorkTime() {
        return workTime;
    }

    /**
     *
     * @param workTime
     */
    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    /**
     * offers in all clinics
     */
    public void showOffersList() {
        System.out.println("1. Full body laser - one session with retouch => 299 SR\n"
                + "2. Face Laser => 199 SR\n"
                + "3. Botox => 990 SR\n"
                + "4. Filler 1ML => 990 SR\n"
                + "5. Body Contouring => 3000 SR");
    }

    /**
     * services in all clinics
     */
    public void showServiceList() {
        System.out.println("1. Full body laser => 499 SR\n"
                + "2. Face Laser => 399 SR\n"
                + "3. Botox => 1150 SR\n"
                + "4. Filler 1ML => 1150 SR\n"
                + "5. Body Contouring => 6000 SR");
    }

    /**
     * devices in all clinics
     */
    public void devices() {
        System.out.println("Our special devices:\n"
                + "1. Elite Plus device:\n"
                + "Elite Plus hair removal device and its benefits:-\n"
                + "• Safe and effective method.\n"
                + "• Suitable for all hair types.\n"
                + "• There is no pain or side effects during and after the session. \n"
                + "\n2. Deka : \n"
                + "Features of Deca Laser Hair Removal Device:-\n"
                + "• High level of safety when in use.\n"
                + "• Decreased incidence of infection cases.\n"
                + "• Long term results.\n"
                + "3. Gentle Max Pro:\n"
                + "GentleMax Pro is a laser hair removal device:\n"
                + "• Works on all skin tones.\n"
                + "• Full body treatment in 40 minutes.\n"
                + "• It relies on cooling through nitrogen gas, which reduces the sensation of pain \n "
                + "4.EnCurve device:\n"
                + "What is the enCurve body sculpting device?\n"
                + "• It exports radio waves technology to the area to be treated.\n"
                + "• As a result of these waves, cells die and cell death leads to a reduction in the fat layer in the area.\n"
                + "• The immune system cleans the body of the remnants of these cells.\n");

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Clinic ID: " + getClinicID() + " ,Clinic Name :" + getClinicName() + " ,work time :" + getWorkTime();
    }

}

package dermatologyclinic11;

/**
 *
 * @author 
 */
public class Face extends DermatologyClinic implements Laser {

    //***************************************<Variables>***************************************************
    private String skinType;
    DermatologyClinic work = new DermatologyClinic();

    //***************************************<Constructors>***************************************************

    /**
     * Constructor
     */
    public Face() {
    }

    /**
     *
     * @param s
     */
    public Face(String s) {
        this.skinType = s ; 
    }

    //***************************************<Methods>***************************************************                
    @Override
    public void setWorkTime(String workTime) {  
        super.setWorkTime(workTime);
    }

    @Override
    public void setClinicID(int ClinicID) {
        super.setClinicID(ClinicID);
    }

    @Override
    public void setClinicName(String ClinicName) {
        super.setClinicName(ClinicName);
    }

    /**
     *
     * @param skinType
     */
    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    /**
     *
     * @return
     */
    public String getSkinType() {
        return skinType;
    }

  

    /**
     * to decide if the patient needs special skin care or not
     */
    @Override
    public void doHairLaser() {
         if (skinType.equalsIgnoreCase("sensitive")) {
            System.out.println("Your laser sessions will be done after getting the enough hydration\n");
        }
        System.out.println("Thank you to choose hair laser");
    }

    /**
     * offers in the face clinic
     */
    public void showFaceOffersList() {
        System.out.println("1. Face Laser => 199 SR\n"
                + "2. Botox => 990 SR\n"
                + "3. Filler 1ML => 990 SR\n"+
                 "4. Filler 0.5ML => 330 SR\n");
    }

    /**
     * face clinic services without any offer
     */
    public void showFaceServiceList() {
        System.out.println("1. Face Laser => 399 SR\n"
                + "2. Botox => 1150 SR\n"
                + "3. Filler 1ML => 1150 SR\n"
                 +"4. Filler 0.5ML =>  575 SR\n");
    }

}

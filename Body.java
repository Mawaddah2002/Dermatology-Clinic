package dermatologyclinic11;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Body extends DermatologyClinic implements Laser {

    //***************************************<Variables>***************************************************
    private double bodyWeight;
    private double bodyHeight;
    private String hairType;
    Scanner input = new Scanner(System.in);

    //***************************************<Constructors>***************************************************
    /**
     * Constructor
     */
    public Body() {

    }

    /**
     *
     * @param id
     * @param name
     * @param weight
     * @param height
     */
    public Body(int id, String name, double weight, double height) {
        super(id, name);
        this.bodyWeight = weight;
        this.bodyWeight = height;
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
     * @return
     */
    public double getBodyWeight() {
        return bodyWeight;
    }

    /**
     *
     * @param bodyWeight
     */
    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    /**
     *
     * @return
     */
    public double getBodyHeight() {
        return bodyHeight;
    }

    /**
     *
     * @param bodyHeight
     */
    public void setBodyHeight(double bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    /**
     *
     * @return
     */
    public String getHairType() {
        return hairType;
    }

    /**
     *
     * @param hairType
     */
    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    /**
     * to decide if the patient needs more than 1 session or not
     */
    @Override
    public void doHairLaser() {
        if (hairType.equalsIgnoreCase("thick")) {
            System.out.println("Your laser sessions will be more than 1\n");
        }
        System.out.println("Thank you to choose hair laser in our clinic ✨");
    }

    /**
     * take wight and height from user to check bmi and know if he need to do
     * contouring or not
     */
    public void bodyContouring() {
        System.out.println("Enter weight in kg");
        double kg = input.nextDouble();
        System.out.println("Enter height in cm");
        double cm = input.nextDouble();
        double m = cm / 100;
        double bmi = kg / (m * m);
        System.out.println("\n Your BMI is " + bmi);

        if (bmi <= 16 && bmi <= 18) {
            System.out.print("underweight you don't need countoring but if you want   ");
        } else if (bmi > 18 && bmi <= 24) {
            System.out.print("normal weight you can do it   ");
        } else if (bmi > 24 && bmi < 29) {
            System.out.print("overweight you need to lose vew kilos before do countoring , ");
        }
        System.out.println(" choose one of these Doctor  : ");
    }

    /**
     * offers in the body clinic
     */
    public void showBodyOffersList() {
        System.out.println("1. Full body laser - one session with retouch => 299 SR\n"
                + "2. Body Contouring => 3000 SR");
    }

    /**
     * body clinic services without any offer
     */
    public void showBodyServiceList() {
        System.out.println("1. Full body laser => 499 SR\n"
                + "2. Body Contouring => 6000 SR");
    }

}

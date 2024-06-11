
package dermatologyclinic11;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author
 */
public class Appointments {

    //***************************************<Variables>***************************************************  
    private String appintmentDate;
    private String appintmentDay;

    public Paitent paitent = new Paitent();

    public DermatologyClinic clinic = new DermatologyClinic();

    public Body bodyClinic = new Body();

    public Face faceClinic;

    public Scanner scan = new Scanner(System.in);

    /**
     * to choose a doctor from a list
     */
    public static int docNum;
    static Vector<Doctor> doctorVecot = new Vector<Doctor>();//create vector of doctors

    //***************************************<Constructors>***************************************************
    public Appointments() {
    }

    /**
     *
     * @param date
     */
    public Appointments(String date) {
        this.appintmentDate = date;

    }

    //***************************************<Methods>***************************************************
    /**
     * Reserve Appinteminet for User
     */
    public void reserveAppointment() {

        System.out.println("Choose from offers ?\n enter 'y' for yes or 'n' for choose from normal services");
        String c = scan.next();
        /**
         * if user decide to choose from offers then apply this
         */

        if (c.equals("y")) {
            System.out.println("Which offer you want ?\n enter the number of service ");
            /**
             * get the offers list
             */
            clinic.showOffersList();
            /**
             * allow user to choose the number of the service
             */
            int serviceNum = scan.nextInt();

            /**
             * if the choice was 1, it means the user chooses remove the face
             * hair with laser
             */
            switch (serviceNum) {
                case 1:
                    System.out.println("Please enter your hair type (thick or thin hair)");
                    String hair = scan.next();
                    bodyClinic.setHairType(hair);
                    /**
                     * check the face skin type to decide if it need additional
                     * care
                     */
                    bodyClinic.doHairLaser();
                    /**
                     * show all doctors in the clinic
                     */
                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();
                    /**
                     * print appointment info
                     */
                    System.out.println("You choose Full body laser with 299 SR " + chooseDoctors(docNum));
                    break;
                /**
                 * if the choice was 2, it means the user chooses remove the
                 * body hair with laser
                 */
                case 2:
                    System.out.println("Please enter your skin type (sensitive, dry or oily skin)");
                    String skin = scan.next();
                    faceClinic = new Face(skin);
                    /**
                     * check the body hair type to decide if it need more
                     * sessions
                     */
                    faceClinic.doHairLaser();
                    /**
                     * show all doctors in the clinic
                     */
                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();
                    /**
                     * print appointment info
                     */
                    System.out.println("You choose Face Laser with 199 SR " + chooseDoctors(docNum));
                    break;
                /**
                 * if the choice was 3, it means the user chooses to do Botox
                 */
                case 3:
                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();
                    System.out.println("You choose Botox with 990 SR " + chooseDoctors(docNum));
                    break;
                /**
                 * if the choice was 4, it means the user chooses to do Filler
                 */
                case 4:
                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();
                    System.out.println("You choose Filler with 990 SR " + chooseDoctors(docNum));
                    break;
                /**
                 * if the choice was 5, it means the user chooses to do a body
                 * contouring
                 */
                case 5:
                    /**
                     * check the body measurments to know if this patient really
                     * need to do contouring
                     */

                    bodyClinic.bodyContouring();

                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();
                    System.out.println("You choose Body Contouring with 3000 SR " + chooseDoctors(docNum));
                    break;
            }

        } else {
            /**
             * repeat same thing but without discount
             */

            System.out.println("Which service you want ?\n enter the number of service ");
            clinic.showServiceList();
            int serviceNum = scan.nextInt();

            switch (serviceNum) {
                case 1:
                    System.out.println("Please enter your hair type (thick or thin hair)");
                    String hair = scan.next();
                    bodyClinic.setHairType(hair);
                    bodyClinic.doHairLaser();
                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();

                    System.out.println("You choose Full body laser with 499 SR " + chooseDoctors(docNum));
                    break;
                case 2:
                    System.out.println("Please enter your skin type (sensitive, dry or oily skin)");
                    String skin = scan.next();
                    faceClinic = new Face(skin);
                    faceClinic.doHairLaser();
                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();
                    System.out.println("You choose Face Laser with 399 SR " + chooseDoctors(docNum));
                    break;
                case 3:
                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();
                    System.out.println("You choose Botox with 1150 SR " + chooseDoctors(docNum));
                    break;
                case 4:
                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();
                    System.out.println("You choose Filler with 1150 SR " + chooseDoctors(docNum));
                    break;
                case 5:
                    bodyClinic.bodyContouring();
                    ListDoctors();
                    System.out.println("\nchoose number of doctor you want ");
                    docNum = scan.nextInt();
                    System.out.println("You choose Body Contouring with 6000 SR " + chooseDoctors(docNum));
                    break;
            }

        }
    }

    /**
     * show doctor information
     */
    public static void ListDoctors() {
        Doctor d1 = new Doctor("DR.Sara", new String[]{" #1 Mon 8am", " #2 Tues 5pm"}, "Filler");
        doctorVecot.add(d1);
        Doctor d2 = new Doctor("DR.Ahmed", new String[]{" #1 Sat 5pm"}, "Body Contouring");
        doctorVecot.add(d2);
        Doctor d3 = new Doctor("DR.Nouf", new String[]{" #1 Tuse 10am"}, "Laser");
        doctorVecot.add(d3);

        for (int i = 0; i < doctorVecot.size(); i++) {
            /**
             * Printing vector elements one by one
             */

            System.out.print("\n\t\t\tDoctor #" + (i + 1) + ": " + doctorVecot.get(i).getName()
                    + ", specialist " + doctorVecot.get(i).getDoctorSpecialist() + ", free time " + doctorVecot.get(i).printDoctorTime());
        }
    }

    /**
     *
     * @param n
     * @return the chosen doctor from a vector
     */
    public String chooseDoctors(int n) {
        return " with Doctor: " + doctorVecot.get(n - 1).getName()
                + "\n, specialist " + doctorVecot.get(n - 1).getDoctorSpecialist() + "\n, " + chooseTime(n);
    }

    /**
     *
     * @param doctorN
     * @return to get the chosen time from all other doctor times' list
     */
    public String chooseTime(int doctorN) {
        /**
         * show all free times to this doctor
         */
        System.out.println("Choose the date : " + doctorVecot.get(doctorN - 1).printDoctorTime());
        int dateNum = scan.nextInt();
        /**
         * choose only one time
         */
        String[] n = doctorVecot.get(doctorN - 1).getFreeTime();
        return "at this time: " + n[dateNum - 1];

    }

    /**
     *
     * @return appointment info
     */
    @Override
    public String toString() {
        return "Paitent Name: " + paitent.getName() + " You resrve an appointment in " + appintmentDay + "\nat "
                + appintmentDate + " in clinic of " + clinic.getClinicName();
    }

}

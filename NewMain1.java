package dermatologyclinic11;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author
 */
public class NewMain1 {

    //***************************************<Variables>*************************************************** 
    /**
     * create vector of paitents
     */
    static Vector<Paitent> paitentVecot = new Vector<Paitent>();
    static Scanner scan = new Scanner(System.in);
    static Paitent paitent;
    static DermatologyClinic dclinic;
    /**
     * to get the user's choices
     */
    static int choice;
    static Face face;
    static Body body;
    static Appointments ap;

    //***************************************<Main>*************************************************** 
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * to keep the list repeated until the user is done with the system
         */
        boolean done = false;

        dclinic = new DermatologyClinic(1, "TNRHM Clinics");
        dclinic.setWorkTime("From 8am to 9pm");
        face = new Face();
        face.setClinicID(11);
        face.setClinicName("TNRHM Face clinic");
        face.setWorkTime("9am - 5pm");

        body = new Body();
        body.setClinicID(12);
        body.setClinicName("TNRHM Body clinic");
        body.setWorkTime("5pm - 9pm");

        System.out.print("\t\t\t********************************************************************************************************\n");
        System.out.print("\n\t\t\t****** WELCOME TO OUR CLINIC, " + dclinic + " ******\n");
        System.out.print("\n\t\t\t********************************************************************************************************");

        /**
         * do while loop to repeat the list until "done" viriable turns true
         */
        do {
            try {
                System.out.println("\n"
                        + "1. Create new paitent account.\n"
                        + "2. Show clinic services.\n"
                        + "3. Show clinic offers.\n"
                        + "4. Show clinic devices.\n"
                        + "5. Resrve appointment.\n"
                        + "6. Exit.\n\n"
                        + "Please choose a choice between 1 and 6 :");
                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        /**
                         * to add new paitent to the system and store it in the
                         * paitents' vector
                         */
                        newPatient();
                        break;

                    case 2:

                        System.out.println("what do you want ?face or body ? \n"
                                + "1.Face services\n "
                                + "2-Body services \n"
                                + "Please choose 1 or 2:");
                        int service = scan.nextInt();
                        /**
                         * to show the suitble list
                         */
                        if (service == 1) {
                            System.out.println(face);
                            face.showFaceServiceList();
                            break;
                        } else if (service == 2) {
                            System.out.println(body);
                            body.showBodyServiceList();
                            break;
                        } else {
                            System.out.println("invalid data entered");
                        }

                        break;
                    case 3:

                        System.out.println("what offer do you want ?face or body\n"
                                + "1-Face clinic offer\n "
                                + "2-Body clinic offer \n"
                                + "Please choose between 1 or 2:");
                        service = scan.nextInt();

                        if (service == 1) {
                            face.showFaceOffersList();
                            
                            break;
                        } else if (service == 2) {
                            body.showBodyOffersList();
                            break;
                        } else {
                            System.out.println("invalid data entered");
                        }

                        break;
                    case 4:
                        dclinic.devices();
                        break;

                    case 5:
                        ap = new Appointments();
                        ap.reserveAppointment();
                        break;

                    case 6:
                        done = true;
                }

            } catch (InputMismatchException e) {
                /**
                 * the scanner's input cursor is reset to where it was before
                 * the call, so that we move to the next line to avoid infinite
                 * loop
                 */
                scan.nextLine();
                System.out.println("Ooops, choose numbers only");
            }
        } while (!done);

    }

    //***************************************<Methods>*************************************************** 
    /**
     * information from user
     */
    public static void newPatient() {
        System.out.println("Enter your name : ");
        String name = scan.next();

        System.out.println("Enter your email : ");
        String email = scan.next();

        try {
            System.out.println("Enter your mobile : ");
            int mobile = scan.nextInt();
            paitent = new Paitent(name, email, mobile);
            System.out.println("Welcome " + paitent.getName());
        } catch (Exception e) {
            System.out.println("Please enter your phone number in numbers only");
        }
    }
}

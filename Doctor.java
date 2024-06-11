
package dermatologyclinic11;

/**
 *
 * @author 
 */
public class Doctor extends User {

    //***************************************<Variables>***************************************************
    private String[] freeTime; 
    private String doctorSpecialist;

    //***************************************<Constructors>***************************************************

    /**
     * Constructor
     */
    public Doctor() {
    }

    /**
     *
     * @param name
     * @param time
     * @param special
     */
    public Doctor(String name, String[] time, String special) {
        this.name = name;
        this.freeTime = time; 
        this.doctorSpecialist = special;
    }

    //***************************************<Methods>***************************************************

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return  get the doctors free time from an array of free times
     */
    public String[] getFreeTime() { 
        String[] ftime = new String[freeTime.length];
        for (int i = 0; i < ftime.length; i++) {
            ftime[i] = freeTime[i];
        }
        return ftime;
    }

    /**
     *
     * @param freeTime
     */
    public void setFreeTime(String[] freeTime) {
        this.freeTime = freeTime;
    }

    /**
     *
     * @return
     */
    public String getDoctorSpecialist() {
        return doctorSpecialist;
    }

    /**
     *
     * @param doctorSpecialist
     */
    public void setDoctorSpecialist(String doctorSpecialist) {
        this.doctorSpecialist = doctorSpecialist;
    }

    /**
     *
     * @return  show doctors free time 
     */
    public String printDoctorTime() { 
        String dt = "";
        for (int i = 0; i < getFreeTime().length; i++) {
            dt += getFreeTime()[i] + " , ";
        }
        return dt;
    }

    /**
     * to print information of Doctors
     */
    @Override
    public void printUserInfo() { 
        System.out.println("Doctor name : " + name + ", freeTime : " + getFreeTime() + ", doctorSpecialist : " + doctorSpecialist);
    }

    /*@Override
    public String toString() {
        return "Doctor name : " + name + ", freeTime : " + getFreeTime() + ", doctorSpecialist : " + doctorSpecialist ;
    }*/
}
                 

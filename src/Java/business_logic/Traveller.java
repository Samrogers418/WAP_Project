package business_logic;

import java.util.ArrayList;
import java.util.List;

public class Traveller extends User {

    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private int birthYear;
    private String profilePicUrl;
    private String thumbNail;
    private String travelerId;
    private List<Traveller> follows =new ArrayList<>();
    private PostRecord record;


    public Traveller(String firstName, String middleName,
                     String lastName, String gender, int birthYear, String email, String password,
                        boolean isActive, Role role) {
        super(email, password,isActive,  role);

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.travelerId = idGenerator();

    }

    public void setProfilePicUrl(String profilefPicUrl) {
        this.profilePicUrl = profilefPicUrl;
    }

    public void setThumbNail(String thumbNail) {
        this.thumbNail = thumbNail;
    }

    public String getGender() {
        return gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public String getThumbNail() {
        return thumbNail;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getTravelerId() {
        return travelerId;
    }
    public static String idGenerator(){
        int rand = (int) (Math.random()*(99999 - 10000)) + 10000;
        return String.valueOf(rand);
    }
    public void setFollows(List<Traveller> follows) {
        this.follows = follows;
    }

    public List<Traveller> getFollows() {
        return follows;
    }
    public PostRecord getRecord() {
        return record;
    }

    public void setRecord(PostRecord record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthYear=" + birthYear +
                ", profilePicUrl='" + profilePicUrl + '\'' +
                ", thumbNail='" + thumbNail + '\'' +
                ", travelerId='" + travelerId + '\'' +
                ", follows=" + follows +
                ", record=" + record +
                '}';
    }
}
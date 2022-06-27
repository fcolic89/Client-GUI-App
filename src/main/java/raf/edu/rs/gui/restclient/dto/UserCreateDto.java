package raf.edu.rs.gui.restclient.dto;

public class UserCreateDto {
    private long id;
    private String username;
    private String password;
    //@Email
    private String email;
    //@NotBlank
    private String phoneNumber;
    //@NotBlank
    private String dateOfBirth;
    //@NotBlank
    private String firstName;
   //@NotBlank
    private String lastName;
    //private RoleDto role;
    private String hotelName;
    private String dateOfEmployment;
    private String passportNumber;
    private String numberOfReservations;

    public UserCreateDto(String username, String password, String email, String phoneNumber, String dateOfBirth, String firstName, String lastName, String hotelName, String dateOfEmployment, String passportNumber, String numberOfReservations) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hotelName = hotelName;
        this.dateOfEmployment = dateOfEmployment;
        this.passportNumber = passportNumber;
        this.numberOfReservations = numberOfReservations;
    }
    public UserCreateDto(Long id, String username, String password, String email, String phoneNumber, String dateOfBirth, String firstName, String lastName, String hotelName, String dateOfEmployment, String passportNumber, String numberOfReservations) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hotelName = hotelName;
        this.dateOfEmployment = dateOfEmployment;
        this.passportNumber = passportNumber;
        this.numberOfReservations = numberOfReservations;
        this.id = id;
    }

    public UserCreateDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
    /*
    public RoleDto getRole() {
        return role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }
    */
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getNumberOfReservations() {
        return numberOfReservations;
    }

    public void setNumberOfReservations(String numberOfReservations) {
        this.numberOfReservations = numberOfReservations;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
import java.util.ArrayList;

public class PersonEntry {
    private String firstName, middleName, lastName,
            phonePref, emailPref, gender,
            eyeCol, hairCol, hairSty, ethn, structure,
            relStatus, sexOrientation, notes = null;
    private int phoneNum, heightFeet, heightInches, weightPounds;
    private char dye = 0;
    private ArrayList<String> friends = null;
    private ArrayList<String> email = null;
    private ArrayList<String> usernames = null;
    private ArrayList<String> passwords = null;
    private ArrayList<String> socialMedia = null;

    public PersonEntry(String first,
                       String middle,
                       String last,
                       int phone,
                       String phoneType,
                       ArrayList<String> email,
                       String emailType,
                       int feet,
                       int inches,
                       int weight,
                       String gender,
                       String eyeColor,
                       String hairColor,
                       String hairStyle,
                       char hairDye,
                       String ethnicity,
                       String build,
                       String relationStatus,
                       String orientation,
                       ArrayList<String> friends,
                       String notes,
                       ArrayList<String> user,
                       ArrayList<String> pass,
                       ArrayList<String> SocMed ) {
        firstName = first;
        middleName = middle;
        lastName = last;
        phoneNum = phone;
        phonePref = phoneType;
        this.email = email;
        emailPref = emailType;
        heightFeet = feet;
        heightInches  = inches;
        weightPounds = weight;
        this.gender = gender;
        eyeCol = eyeColor;
        hairCol = hairColor;
        hairSty = hairStyle;
        dye = hairDye;
        ethn = ethnicity;
        structure = build;
        relStatus = relationStatus;
        sexOrientation = orientation;
        this.friends = friends;
        this.notes = notes;
        usernames = user;
        passwords = pass;
        socialMedia = SocMed;
    }

    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public int getPhoneNumber() { return phoneNum; }
    public String getPhonePreference() { return phonePref; }
    public ArrayList<String> getEmail() { return email; }
    public String getEmailPreference() { return emailPref; }
    public int getHeightFeet() { return heightFeet; }
    public int getHeightInches() { return heightInches; }
    public int getWeightPounds() { return weightPounds; }
    public String getGender() { return gender; }
    public String getEyeColor() { return eyeCol; }
    public String getHairColor() { return hairCol; }
    public String getHairStyle() { return hairSty; }
    public char getDye() { return dye; }
    public String getEthnicity() { return ethn; }
    public String getBuild() { return structure; }
    public String getRelationshipStatus() { return relStatus; }
    public String getSexOrientation() { return sexOrientation; }
    public ArrayList<String> getFriends() { return friends; }
    public String getNotes() { return notes; }
    public ArrayList<String> getUsernames() { return usernames; }
    public ArrayList<String> getPasswords() { return passwords; }
    public ArrayList<String> getSocialMedia() { return socialMedia; }
    public String getUsernameIndex( int i ) { return usernames.get( i ); }
    public String getPasswordIndex( int i ) { return passwords.get( i ); }
    public String getEmailIndex( int i ) { return email.get( i ); }
    public int getSocialMediaIndex( String socMed ) {
        for ( int i = 0; i < socialMedia.size(); i++ ) {
            if (socialMedia.get(i).equals(socMed)) {
                return i;
            }
        }
        return 0;
    }

    public void setFirstName( String newThing ) { firstName = newThing; }
    public void setMiddleName( String newThing ) { middleName = newThing; }
    public void setLastName( String newThing ) { lastName = newThing; }
    public void setPhonePreference( String newThing ) { phonePref = newThing; }
    public void setEmailPreference( String newThing ) { emailPref = newThing; }
    public void setGender( String newThing ) { gender = newThing; }
    public void setEyeColor( String newThing ) { eyeCol = newThing; }
    public void setHairColor( String newThing ) { hairCol = newThing; }
    public void setHairStyle( String newThing ) { hairSty = newThing; }
    public void setEthnicity( String newThing ) { ethn = newThing; }
    public void setBuild( String newThing ) { structure = newThing; }
    public void setRelationshipStatus( String newThing ) { relStatus = newThing; }
    public void setSexOrientation( String newThing ) { sexOrientation = newThing; }
    public void setNotes( String newThing ) { notes = newThing; }
    public void setUserNamesIndex( String newThing, int i ) { usernames.set( i, newThing ); }
    public void setPasswordsIndex( String newThing, int i ) { passwords.set( i, newThing ); }
    public void setEmailIndex( String newThing, int i ) { email.set( i, newThing ); }
    public void setSocialMedia( String newThing, int i ) { socialMedia.set( i, newThing ); }
    public void updateUsernamesGivenSocMed( String socMedName, String user ) {
        usernames.set( getSocialMediaIndex( socMedName ), user );
    }
    public void updatePasswordsGivenSocMed( String socMedName, String pass ) {
        passwords.set( getSocialMediaIndex( socMedName ), pass );
    }
    public void setPhoneNumber( int num ) { phoneNum = num; }
    public void setHeightFeet( int feet ) { heightFeet = feet; }
    public void setHeightInches( int inches ) { heightInches = inches; }
    public void setWeightPounds( int pounds ) { weightPounds = pounds; }
    public void setDye( char c ) { dye = c; }
    public void setEmail( ArrayList<String> newThing ) { email = newThing; }
    public void setUsernames( ArrayList<String> newThing ) { usernames = newThing; }
    public void setPasswords( ArrayList<String> newThing ) { passwords = newThing; }
    public void setSocialMedia( ArrayList<String> newThing ) { socialMedia = newThing; }
}

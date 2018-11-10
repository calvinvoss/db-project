public class CourseEntry {
    private String profFirst, profLast, profTitle, className, classDept, semester, notes, entryUsername;
    private int classCRN, classNumber, yearTaken;

    public CourseEntry( String profFirst,
                       String profLast,
                       String profTitle,
                       String className,
                       String classDept,
                       String semester,
                       String notes,
                       String entryUsername,
                       int classCRN,
                       int classNumber,
                       int yearTaken ) {
        this.profFirst = profFirst;
        this.profLast = profLast;
        this.profTitle = profTitle;
        this.className = className;
        this.classDept = classDept;
        this.semester = semester;
        this.notes = notes;
        this.entryUsername = entryUsername;
        this.classCRN = classCRN;
        this.classNumber = classNumber;
        this.yearTaken = yearTaken;
    }

    public String getProfFirst() { return profFirst; }
    public String getProfLast() { return profLast; }
    public String getProfTitle() { return profTitle; }
    public String getClassName() { return className; }
    public String getClassDept() { return classDept; }
    public String getSemester() { return semester; }
    public String getNotes() { return notes; }
    public String getEntryUsername() { return entryUsername; }
    public int getClassCRN() { return classCRN; }
    public int getClassNumber() { return classNumber; }
    public int getYearTaken() { return yearTaken; }

    public void setProfFirst( String update ) { profFirst = update; }
    public void setProfLast( String update ) { profLast = update; }
    public void setProfTitle( String update ) { profTitle = update; }
    public void setClassName( String update ) { className = update; }
    public void setClassDept( String update ) { classDept = update; }
    public void setSemester( String update ) { semester = update; }
    public void setNotes( String update ) { notes = update; }
    public void setEntryUsername( String update ) { entryUsername = update; }
    public void setClassCRN( int update ) { classCRN = update; }
    public void setClassNumber( int update ) { classNumber = update; }
    public void setYearTaken( int update ) { yearTaken = update; }

}

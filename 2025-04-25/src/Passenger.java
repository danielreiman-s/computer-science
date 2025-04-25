package src;

public class Passenger {
    private int passportNum;       // מספר דרכון
    private String name;           // שם הנוסע
    private boolean permPass;      // האם נוסע מתמיד
    private int km;                // ק"מ שצבר

    // בונה
    public Passenger(int passportNum, String name, boolean permPass, int km) {
        this.passportNum = passportNum;
        this.name = name;
        this.permPass = permPass;
        this.km = km;
    }

    // getters ו-setters
    public int getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(int passportNum) {
        this.passportNum = passportNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getPermPass() {
        return permPass;
    }

    public void setPermPass(boolean permPass) {
        this.permPass = permPass;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}


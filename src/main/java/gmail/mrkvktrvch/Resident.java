package gmail.mrkvktrvch;

public class Resident {
    String name;
    int passportId;

    public Resident ( String name, int passportId) {
        this.name= name;
        this.passportId = passportId;
    }

    public String changeName (String newName) {
        name = newName;
        return name;

    }

}

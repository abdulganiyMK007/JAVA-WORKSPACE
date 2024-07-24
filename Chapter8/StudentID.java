
public class StudentID {

    private String name;
    private String id;
    private static int nID = 0;

    public StudentID() {
        name = "";
        nID++;
        id = "SDT" + nID;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName.length() > 0) {
            name = newName;
        }
    }

    public String getId() {
        return id;
    }

}

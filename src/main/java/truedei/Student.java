package truedei;

public class Student {

    private String id;
    private String sno;
    private String sname;
    private String password;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

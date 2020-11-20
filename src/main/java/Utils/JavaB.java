package Utils;

public class JavaB {
    private int id;
    private int idddd;
    private int idd;

    public JavaB(int id, int idddd, int idd) {
        this.id = id;
        this.idddd = idddd;
        this.idd = idd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdddd() {
        return idddd;
    }

    public void setIdddd(int idddd) {
        this.idddd = idddd;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    @Override
    public String toString() {
        return "JavaB{" +
                "id=" + id +
                ", idddd=" + idddd +
                ", idd=" + idd +
                '}';
    }
}

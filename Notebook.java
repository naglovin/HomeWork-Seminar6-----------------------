public class Notebook {
    private String mName;
    private int mRam;
    private int HDisk;

    public Notebook(String name, int ram, int HardDisk) {
        mName = name;
        mRam = ram;
        HDisk = HardDisk;
    }

    public String getName() {
        return mName;
    }

    public int getRam() {
        return mRam;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setmRam(int ram) {
        mRam = ram;
    }

    public void print() {
        System.out.println("компьютер " + mName + " с оперативкой " + mRam + " жесткий диск " + HDisk);
    }
}
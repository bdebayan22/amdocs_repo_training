public class Hostellers extends Student{
    public int hostelNo;
    public int roomNo;

    public Hostellers() {
    }

    public Hostellers(String name, int regNo, String dept, int hostelNo, int roomNo) {
        super(name, regNo, dept);
        this.hostelNo = hostelNo;
        this.roomNo = roomNo;
    }

    public int getHostelNo() {
        return hostelNo;
    }

    public void setHostelNo(int hostelNo) {
        this.hostelNo = hostelNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Hostellers{" +
                "hostelNo=" + hostelNo +
                ", roomNo=" + roomNo +
                ", name='" + name + '\'' +
                ", regNo=" + regNo +
                ", dept='" + dept + '\'' +
                '}';
    }
}

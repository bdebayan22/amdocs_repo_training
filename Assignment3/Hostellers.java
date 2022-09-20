public class Hostellers extends Student{
    public int hostelNo;
    public int roomNo;

    public Hostellers() {
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
    public String getDetails() {
        return "Hostellers details{" +
                "hostelNo=" + hostelNo +
                ", roomNo=" + roomNo +
                ", name='" + name + '\'' +
                ", regNo=" + regNo +
                ", dept='" + dept + '\'' +
                '}';
    }

}

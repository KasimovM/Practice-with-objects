package gmail.mrkvktrvch;

public class Hotel {

    String name;
    String address;
    int freeRooms;

    public Hotel (String name, String address, int freeRooms) {
        this.name = name;
        this.address = address;
        this.freeRooms = freeRooms;
    }


    public void printHotelInfo() {
        System.out.println("Отель"+ " " + name + " " + "находящийся по адресу: " + address + " " + "имеет " + freeRooms +
                " " + "свободных комнат");
    }

    public int refuseToCheckIn (int busyRooms) {
        freeRooms = freeRooms - busyRooms;
        return freeRooms;
    }

}

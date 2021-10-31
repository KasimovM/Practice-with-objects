package gmail.mrkvktrvch;

public class Room {

    String typeOfRoom;
    int pricePerDay;
    int residents;

    public Room (String typeOfRoom, int pricePerDay, int residents) {
        this.typeOfRoom = typeOfRoom;
        this.pricePerDay = pricePerDay;
        this.residents = residents;
    }

    public void printRoomInfo () {
        System.out.println("В комнату типа: " + typeOfRoom + "\n" + "Ожидается постояльцев: " + residents);
    }
}

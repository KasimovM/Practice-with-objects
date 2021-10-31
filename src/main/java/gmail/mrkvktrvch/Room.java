package gmail.mrkvktrvch;

public class Room {
    String typeOfRoom;
    int smallRoomPricePerDay;
    int middleRoomPricePerDay;
    int largeRoomPricePerDay;
    int residents;


    public void roomInfo () {
        System.out.println("В комнату типа: " + typeOfRoom + "\n" + "Ожидается постояльцев: " + residents);
    }
}

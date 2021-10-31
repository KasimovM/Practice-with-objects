package gmail.mrkvktrvch;

public class PracticeWithObjects {
    public static void main (String[] args) {
        Hotel hotel1 = new Hotel();
        Hotel hotel2 = new Hotel();
        Hotel hotel3 = new Hotel();
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Resident resident1 = new Resident();
        Resident resident2 = new Resident();
        Resident resident3 = new Resident();
        Resident resident4 = new Resident();
        Resident resident5 = new Resident();
        Resident resident6 = new Resident();
        hotel1.name = "'Санкт - Петербург'";
        hotel2.name = "'The Plaza'";
        hotel3.name = "'Спа-отель Грейс Арли'";
        hotel1.address = "Пироговская наб., 5/2, Санкт-Петербург, 194044";
        hotel2.address = "5th Avenue at, Central Park S, New York, NY 10022, United States";
        hotel3.address = "ул. Ленина, 219 Д, Адлер, Краснодарский край, 354450";
        hotel1.freeRooms = 15;
        hotel2.freeRooms = 10;
        hotel3.freeRooms = 24;
        room1.typeOfRoom = "Большая";
        room2.typeOfRoom = "Средняя";
        room3.typeOfRoom = "Маленькая";
        room1.largeRoomPricePerDay = 100;
        room2.middleRoomPricePerDay = 50;
        room3.smallRoomPricePerDay = 25;
        room1.residents = 3;
        room2.residents = 2;
        room3.residents = 1;
        resident1.passportId = 8765;
        resident2.passportId = 4321;
        resident3.passportId = 1256;
        resident4.passportId = 8912;
        resident5.passportId = 3434;
        resident6.passportId = 3001;
        resident1.name = "Касимов Марк Викторович";
        resident2.name = "Спиридонов Петр Алексеевич";
        resident3.name = "Федоров Евгений МИхайлович";
        resident4.name = "Гергиев Сергей Павлович";
        resident5.name = "Шляхтич Пан Польский";
        resident6.name = "Маэстро Евгений Понасенков";


        hotel1.hotelInfo();
        room1.roomInfo();
        System.out.println("Данные о постояльцах:" + "\n" + "Имя: " + resident1.name + "\n" + "Номер паспорта: " +
                resident1.passportId + "\n" + "Имя: " + resident2.name + "\n" + "Номер паспорта: " + resident2.passportId
                + "\n" + "Имя: " + resident3.name + "\n" + "Номер паспорта: " + resident3.passportId + "\n" +
                "Итого к оплате за месяц аренды: " + room1.largeRoomPricePerDay * room1.residents * 30 + "$");

        hotel2.hotelInfo();
        room2.roomInfo();
        System.out.println("Данные о постояльцах:" + "\n" + "Имя: " + resident4.name + "\n" + "Номер паспорта: " +
                resident4.passportId + "\n" + "Имя: " + resident5.name + "\n" + "Номер паспорта: " + resident5.passportId
                + "\n" + "Итого к оплате за месяц аренды: " + room2.middleRoomPricePerDay * room2.residents * 30 + "$");

        hotel3.hotelInfo();
        room3.roomInfo();
        System.out.println("Данные о постояльцах:" + "\n" + "Имя: " + resident6.name + "\n" + "Номер паспорта: " +
                resident6.passportId + "\n" + "Итого к оплате за месяц аренды: " + room3.smallRoomPricePerDay *
                room3.residents * 30 + "$");
        }
    }




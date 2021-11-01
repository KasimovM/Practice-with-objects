package gmail.mrkvktrvch;

public class PracticeWithObjects {
    public static void main (String[] args) {
        Hotel hotel1 = new Hotel("'Санкт - Петербург'", "Пироговская наб., 5/2, Санкт-Петербург, 194044",
                15);
        Hotel hotel2 = new Hotel("'The Plaza'", "5th Avenue at, Central Park S, New York, NY 10022, United States",
                10);
        Hotel hotel3 = new Hotel("'Спа-отель Грейс Арли'", "ул. Ленина, 219 Д, Адлер, Краснодарский край, 354450",
                24 );
        Room room1 = new Room("Большая", 100, 3 );
        Room room2 = new Room("Средняя", 50, 2);
        Room room3 = new Room("Маленькая", 25, 1);
        Resident resident1 = new Resident("Касимов Марк Викторович", 8765);
        Resident resident2 = new Resident("Спиридонов Петр Алексеевич", 4321);
        Resident resident3 = new Resident("Федоров Евгений МИхайлович", 1256);
        Resident resident4 = new Resident("Гергиев Сергей Павлович", 8912);
        Resident resident5 = new Resident("Шляхтич Пан Польский", 3434);
        Resident resident6 = new Resident("Маэстро Евгений Понасенков", 3001);

        hotel1.printHotelInfo();
        room1.printRoomInfo();
        System.out.println("Данные о постояльцах:" + "\n" + "Имя: " + resident1.name + "\n" + "Номер паспорта: " +
                resident1.passportId + "\n" + "Имя: " + resident2.name + "\n" + "Номер паспорта: " + resident2.passportId
                + "\n" + "Имя: " + resident3.name + "\n" + "Номер паспорта: " + resident3.passportId + "\n" +
                "Итого к оплате за месяц аренды: " + room1.pricePerDay * room1.residents * 30 + "$");

        hotel2.printHotelInfo();
        room2.printRoomInfo();
        System.out.println("Данные о постояльцах:" + "\n" + "Имя: " + resident4.name + "\n" + "Номер паспорта: " +
                resident4.passportId + "\n" + "Имя: " + resident5.name + "\n" + "Номер паспорта: " + resident5.passportId
                + "\n" + "Итого к оплате за месяц аренды: " + room2.pricePerDay * room2.residents * 30 + "$");

        hotel3.printHotelInfo();
        room3.printRoomInfo();
        System.out.println("Данные о постояльцах:" + "\n" + "Имя: " + resident6.name + "\n" + "Номер паспорта: " +
                resident6.passportId + "\n" + "Итого к оплате за месяц аренды: " + room3.pricePerDay *
                room3.residents * 30 + "$");

        hotel3.refuseToCheckIn(24);
        hotel3.printHotelInfo();
        System.out.println("К сожалению, отель не располагает свободными комнатами, уважаемый " + resident6.name + ", " +
                "будем ждать вас в будущем!");
        }
    }




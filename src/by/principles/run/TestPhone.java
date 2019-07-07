package by.principles.run;

import by.principles.oop.*;

public class TestPhone {

    public static void main(String[] args) {

        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone=new VideoPhone(2018);

        User user = new User("Dz B");

        user.callAnotherUser(224466,firstPhone);
        //Вращайте ручку
        //Сообщите номер абонента, сэр

        user.callAnotherUser(224466,phone);
        //Вызываю номер 224466

        user.callAnotherUser(224466,videoPhone);
        //Подключаю видеоканал для абонента 224466

        firstPhone.ring(123);
        phone.ring(12345);
        videoPhone.ring(1234567);
    }

}

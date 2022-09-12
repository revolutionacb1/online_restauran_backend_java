package Basic;

import java.util.Random;
import java.util.Scanner;

public class registratsiya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        registratsiya reg = new registratsiya();
        String[] user = new String[7];
        String[] karta = new String[4];

        reg.registrat(scanner, reg, user, karta);


//        String lang = "en";
//        int b = -1;
//        while (b!=0)
//            System.out.println(lang.equals("uz")?"tilni tanla: 0>chiqish 1>uzbekcha, 2>inglizcha":"chooise language: 0>exit, 1>uz, 2>eng");
//            b = scanner.nextInt();
//        switch (b){
//            case 1:
//                lang = "uz";
//
//                break;
//            case 2:
//                lang = "eng";
//                break;
//            default:
//                System.out.println(lang.equals("uz")?"bundayu til bo'limi mavjud emas":"Such have not information");
//                break;
//        }

    }

    public void registrat(Scanner scanner, registratsiya reg, String[] user, String[] karta) {

        String lang = "eng";
        int a = -1;
        while (a != 0) {
            int d = -1;
            System.out.println(lang.equals("uz") ? "tilni tanlang.0>chiqish 1>uz, 2>eng" : "chooise language 0>exit, 1>uzbek, 2>english");
            a = scanner.nextInt();
            switch (a) {
                case 0:
                    System.out.println(lang.equals("uz") ? "raxmat oka" : "Thank you bro");
                    d = 0;
                    break;
                case 1:
                    lang = "uz";
                    break;
                case 2:
                    lang = "eng";
                    break;
                default:
                    System.out.println(lang.equals("uz") ? "bunday malumot yo'q" : "Such have not informatin");
                    d = 0;
                    break;
            }
            while (d != 0) {
                System.out.println(lang.equals("uz") ? "Tanlang: 0 => tillar 1>regestratsiya, 2>Login, 3>Sotib olish, 4>Kartalarim, 5>Logout" : "Chooise: 1>regestration, 2>Login, 3>Purchase, 4>My carts 5>Logout");
                d = scanner.nextInt();
                switch (d) {
                    case 0:
                        System.out.println(lang.equals("uz") ? "tillar bolimiga qaytdingiz" : "back to language section");
                        break;
                    case 1:
                        System.out.println(lang.equals("uz") ? "Ismingizni kiritng" : "enter your name");
                        String name = scanner.next();
                        System.out.println(lang.equals("uz") ? "familyangizni kiritng" : "enter your surname");
                        String surname = scanner.next();
                        System.out.println(lang.equals("uz") ? "username kiritng" : "enter your username");
                        String username = "";
                        while (username.length() < 5) {
                            username = scanner.next();
                            if (username.length() < 5) {
                                System.out.println(lang.equals("uz") ? "Usename kamida 5 harifdan iborat bo'lishi shart" : "the username should consist minimum 5 latter");

                            }
                        }
                        System.out.print(lang.equals("uz") ? "Telefon raqamni kiritng\n+998 " : "enter your phone number\n+998 ");
                        long l = 1000000000;
                        String phoneNumber = "";
                        while (phoneNumber.length() != 9) {
                            l = scanner.nextLong();
                            phoneNumber = String.valueOf(l);
                            if (phoneNumber.length() != 9) {
                                System.err.print(lang.equals("uz") ? "Telefon raqamda hatolik bor\n+998 " : "error in phone number\n+998 ");
                            }
                        }
                        System.out.println(lang.equals("uz") ? "Sizning telefon raqamingizga kod yubordik" : "We have sent a code to your phone number");
                        String generateCode = reg.generateCode();
                        System.out.println(generateCode);
                        System.out.println(lang.equals("uz") ? "kodni kiritng" : "enter the code");
                        String code = "";
                        while (!generateCode.equals(code)) {
                            code = scanner.next();
                            if (!generateCode.equals(code)) {
                                System.err.println(lang.equals("uz") ? "Kod hato qayta kiritng" : "error code, please try again");
                            }
                        }
                        System.out.println(lang.equals("uz") ? "emailingizni kiritng" : "enter your email");
                        String email = "";
                        while (!email.matches("(.*)@gmail.com")) {
                            email = scanner.next();
                            if (!email.matches("(.*)@gmail.com")) {
                                System.out.println(lang.equals("uz") ? "email hato qayta kiriting" : "error email, please try again");
                            }
                        }
                        System.out.println(lang.equals("uz") ? "pasportingizni kiritng" : "enter your password");
                        String passport = "";
                        while (passport.length() < 16) {
                            passport = scanner.next();
                            if (passport.length() < 16) {
                                System.out.println(lang.equals("uz") ? "paspport hato pasportingiz 16dan kam bo'lmasligi lozim" : "errot password, the password should consist 16 laater");
                            }
                        }
                        System.out.println(lang.equals("uz") ? "pasport qabul qilindi" : "succesfuly password");
                        user[0] = name;
                        user[1] = surname;
                        user[2] = username;
                        user[3] = phoneNumber;
                        user[4] = code;
                        user[5] = email;
                        user[6] = passport;
                        break;

                    case 2:
                        System.out.println(lang.equals("uz") ? "Login bo'limiga hush kelibsiz" : "wlecome to login page");
                        System.out.println(lang.equals("uz") ? "Emailingzni kiriting" : "enter your email adress");
                        String preemail = "";
                        while (!preemail.equals(user[5])) {
                            preemail = scanner.next();
                            if (!preemail.equals(user[5])) {
                                System.out.println(lang.equals("uz") ? "email hato" : "error email adress, please try again");
                            }
                        }
                        System.out.println(lang.equals("uz") ? "posportingizni kiritng" : "enter your password");
                        String prepasport = "";
                        while (!prepasport.equals(user[6])) {
                            prepasport = scanner.next();
                            if (!prepasport.equals(user[6])) {
                                System.out.println(lang.equals("uz") ? "pasport hato" : "error password, please try again");
                            }
                        }
                        System.out.println(lang.equals("uz") ? "Logindan muvaffaqiyatli o'tdingiz" : "succesfuly Login");
                        break;
                    case 3:
                        if (karta[0] != null) {
                            int q = -1;
                            while (q != 0) {
                                System.out.println(lang.equals("uz") ? "Sotib olish bo'limiga hush kelibsiz" : "Welcome to purchase section");
                                System.out.println(lang.equals("uz") ? "Bo'limlarni tanlang:0>orqaga 1>Sport anjomlari, 2>Kiyim kechaklar" :
                                        "Select sections:0>back 1>Sports equipment, 2>Clothes");
                                q = scanner.nextInt();
                                switch (q) {
                                    case 0:
                                        System.out.println(lang.equals("uz") ? "Siz orqaga qaytdingiz" :
                                                "You're back");
                                        break;
                                    case 1:
                                        System.out.println(lang.equals("uz") ? "Sport anjomlari bo'limi: 0>chiqish 1>krasovkalar, 2>Meshog, 3>sportivni futbolka, 4>boks perchatkalar, 5>koptoklar" : "Department of sports equipment: 0>exit 1>sneakers, 2>Meshog, 3>sports T-shirt, 4>boxing gloves, 5>balls");
                                        int h = scanner.nextInt();
                                        switch (h) {
                                            case 0:
                                                System.out.println(lang.equals("uz") ? "siz orqaga qaytdingiz" : "You are back");
                                                break;
                                            case 1:
                                                System.out.println(lang.equals("uz") ? "Krasovka turini tanlang:0>orqaga, 1>Nike, 2>adidass, 3>Puma" :
                                                        "Select type of sneaker:0>back, 1>Nike, 2>adidass, 3>Puma");
                                                int turniTanla = scanner.nextInt();
                                                switch (turniTanla) {
                                                    case 0:
                                                        System.out.println(lang.equals("uz") ? "Siz orqaga qaytdingiz" : "You are back");
                                                        break;
                                                    case 1:
                                                        System.out.println(lang.equals("uz") ? "Siz tanlagan krasovka narxi: 140ming so'm. Sotib olasizmi 1>ha 2>yo'q" : "The price of the watch you chose: 140,000 soums. Can you buy 1>yes 2>no");
                                                        int tanlov = scanner.nextInt();
                                                        switch (tanlov) {
                                                            case 1:
                                                                if (Double.parseDouble(karta[3]) < 140000){
                                                                    System.out.println(lang.equals("uz")?"mablag yetmaydi":"not enought money");
                                                                }
                                                                else {
                                                                    double bal = Double.parseDouble(karta[3]);
                                                                    double kartadanAyirish = bal - 140000;
                                                                    karta[3] = String.valueOf(kartadanAyirish);
                                                                    System.out.println(lang.equals("uz") ? "Maxsulot sizga sotildi" :
                                                                            "The product has been sold to you");
                                                                }

                                                                break;
                                                            case 2:
                                                                System.out.println(lang.equals("uz") ? "maxsulot bekor qilindi" :
                                                                        "the product has been cancelled");
                                                                break;
                                                            default:
                                                                System.out.println(lang.equals("uz") ? "Xato" : "Error");
                                                                break;
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println(lang.equals("uz") ? "Siz tanlgan maxsulot narxi 100ming so'm. Sotib olasizmi: 1>Ha, 2>Yo'q" :
                                                                "The price of the product you have chosen is 100,000 soums. Can you buy: 1>Yes, 2>No");
                                                        int tanlamoq = scanner.nextInt();
                                                        switch (tanlamoq) {
                                                            case 1:
                                                                if(Double.parseDouble(karta[3]) < 100000){
                                                                    System.out.println(lang.equals("uz")?"mablag yetmaydi":"not enought money");
                                                                }
                                                                else {
                                                                    double bal = Double.parseDouble(karta[3]);
                                                                    double kartadanAyirish = bal - 100000;
                                                                    karta[3] = String.valueOf(kartadanAyirish);
                                                                    System.out.println(lang.equals("uz") ? "maxsulot sizga sotildi👌👌👌" :
                                                                            "The product has been sold to you👌👌👌");
                                                                }

                                                                break;
                                                            case 2:
                                                                System.out.println(lang.equals("uz") ? "savdo bekor qilindi🤷‍♂️🤷‍♂️🤷‍♂" :
                                                                        "trade cancelled");
                                                                break;
                                                            default:
                                                                System.out.println(lang.equals("uz") ? "Xato😡😡😡" : "Error");
                                                                break;
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println(lang.equals("uz") ? "Siz tanlagan maxsulot 120ming so'm. Sotib olasizmi: 1>Ha, 2>yo'q" :
                                                                "The product you have chosen costs 120,000 soums. Can you buy: 1>Yes, 2>No");
                                                        int tanlash = scanner.nextInt();
                                                        switch (tanlash) {
                                                            case 1:
                                                                if(Double.parseDouble(karta[3]) < 120000){
                                                                    System.out.println(lang.equals("uz")?"mablag yetmaydi":"not enought money");
                                                                }
                                                                else {
                                                                    double bal = Double.parseDouble(karta[3]);
                                                                    double kartadanAyirish = bal - 120000;
                                                                    karta[3] = String.valueOf(kartadanAyirish);
                                                                    System.out.println(lang.equals("uz") ? "maxsulot sizga sotildi👌👌👌" :
                                                                            "The product has been sold to you👌👌👌");
                                                                }
                                                                break;
                                                            case 2:
                                                                System.out.println(lang.equals("uz") ? "savdo bekor qilindi" :
                                                                        "trade cancelled");
                                                                break;
                                                            default:
                                                                System.out.println(lang.equals("uz") ? "Xato😡😡😡" : "Error😡😡😡");
                                                                break;
                                                        }
                                                        break;
                                                    default:
                                                        System.out.println(lang.equals("uz") ? "bunday bo'lim yo'q" : "Such have not section");
                                                        break;
                                                }
                                                break;
                                            case 2:
                                                System.out.println(lang.equals("uz") ? "Siz sotib olmoqchi bo'lgan mahsulot 400ming so'm. Sotib olsizmi 1>ha, 2>yo'q" : "The product you want to buy is 400,000 soums. Would you buy it? 1>yes, 2>no");
                                                int haYokiyoq = scanner.nextInt();
                                                switch (haYokiyoq) {
                                                    case 1:
                                                        if(Double.parseDouble(karta[3]) < 400000){
                                                            System.out.println("mablag' yetmaydi");
                                                        }
                                                        else {
                                                            double bal = Double.parseDouble(karta[3]);
                                                            double kartadanAyirish = bal - 400000;
                                                            karta[3] = String.valueOf(kartadanAyirish);
                                                            System.out.println(lang.equals("uz") ? "maxsulot sizga sotildi" : "The product has been sold to you👌👌👌");
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println(lang.equals("uz") ? "savdo bekor qilindi" : "trade cancelled");
                                                        break;
                                                    default:
                                                        System.out.println(lang.equals("uz") ? "Xato😡😡😡" : "Error😡😡😡");
                                                        break;
                                                }
                                                break;
                                            case 3:
                                                System.out.println(lang.equals("uz") ? "Siz sotib olmoqchi bo'lgan futbolka narxi 200ming so'm" :
                                                        "The price of the T-shirt you want to buy is 200,000 soums");
                                                if(Double.parseDouble(karta[3]) < 200000){
                                                    System.out.println(lang.equals("uz")?"mablag yetmaydi":"not enought money");
                                                }
                                                else {
                                                    double balan = Double.parseDouble(karta[3]);
                                                    double kartadanAyiril = balan - 200000;
                                                    karta[3] = String.valueOf(kartadanAyiril);
                                                    System.out.println(lang.equals("uz") ? "maxsulot sizga sotildi👌👌👌" :
                                                            "The product has been sold to you👌👌👌");
                                                }
                                                break;
                                            case 4:
                                                System.out.println(lang.equals("uz") ? "Siz sotib olmoqchi bo'lgan maxsulot narxi 75ming so'm" :
                                                        "The price of the product you want to buy is 75,000 soums");
                                                if(Double.parseDouble(karta[3]) < 75000){
                                                    System.out.println(lang.equals("uz")?"mablag yetmaydi":"not enought money");
                                                }
                                                else {
                                                    double bal = Double.parseDouble(karta[3]);
                                                    double kartadanAyirish = bal - 75000;
                                                    karta[3] = String.valueOf(kartadanAyirish);
                                                    System.out.println(lang.equals("uz") ? "maxsulot sizga sotildi👌👌👌" :
                                                            "The product has been sold to you👌👌👌");
                                                }
                                                break;
                                            case 5:
                                                System.out.println(lang.equals("uz") ? "Siz sotib olmoqchi bo'lgan maxsulot narxi 100ming so'm" : "The price of the product you want to buy is 100,000 soums");
                                                if(Double.parseDouble(karta[3]) < 100000){
                                                    System.out.println(lang.equals("uz")?"mablag yetmaydi":"not enought money");
                                                }
                                                else {
                                                    double bal = Double.parseDouble(karta[3]);
                                                    double kartadanAyirish = bal - 100000;
                                                    karta[3] = String.valueOf(kartadanAyirish);
                                                    System.out.println(lang.equals("uz") ? "maxsulot sizga sotildi👌👌👌" :
                                                            "The product has been sold to you👌👌👌");
                                                }
                                                break;
                                            default:
                                                System.out.println(lang.equals("uz") ? "bunday bo'lim mavjud emas" : "no such section exists");
                                                break;
                                        }
                                        break;
                                    case 2:
                                        System.out.println(lang.equals("uz") ? "Kiyim kechakrlar bo'limi. 0>orqaga, 1>Shortik, 2>Shim, 3>Triko, 4>futbolka, 5>klasichski kiyim" : "Clothing department. 0>back, 1>Shorts, 2>Trousers, 3>T-shirt, 4>T-shirt, 5>classic clothes");
                                        int kiyim = scanner.nextInt();
                                        switch (kiyim) {
                                            case 0:
                                                System.out.println(lang.equals("uz") ? "Siz orqaga qaytingiz" : "You are back");
                                                break;
                                            case 1:
                                                System.out.println(lang.equals("uz") ? "Siz tanlagan maxsulot narxi 50ming so'm" :
                                                        "The price of the product you have chosen is 50,000 soums");
                                                if (Double.parseDouble(karta[3]) < 50000){
                                                    System.out.println(lang.equals("uz")?"mablag yetmaydi":"not enough money");
                                                }
                                                else {
                                                    double bal = Double.parseDouble(karta[3]);
                                                    double kartadanAyirish = bal - 50000;
                                                    karta[3] = String.valueOf(kartadanAyirish);
                                                }

                                                break;
                                            case 2:
                                                if (Double.parseDouble(karta[3]) < 120000){
                                                    System.out.println("Mablag yetmaydi");
                                                }
                                                else {
                                                    System.out.println(lang.equals("uz") ? "Siz tanlagan maxsulot narxi 120ming so'm" : "The price of the product you have chosen is 120,000 soums");
                                                    double balan = Double.parseDouble(karta[3]);
                                                    double kartadanAyirlgan = balan - 120000;
                                                    karta[3] = String.valueOf(kartadanAyirlgan);
                                                }

                                                break;

                                            case 3:
                                                if(Double.parseDouble(karta[3]) < 45000){
                                                    System.out.println(lang.equals("uz")?"mablag yetmaydi":"not enough money");
                                                }
                                                else {
                                                    System.out.println(lang.equals("uz") ? "Siz tanlagan maxsulot narxi 45ming so'm" :
                                                            "The price of the product you have chosen is 45,000 soums");
                                                    double balanf = Double.parseDouble(karta[3]);
                                                    double kartadanAyirlganda = balanf - 120000;
                                                    karta[3] = String.valueOf(kartadanAyirlganda);
                                                }
                                                break;
                                            case 4:
                                                if(Double.parseDouble(karta[3]) < 85000){
                                                    System.out.println(lang.equals("uz")?"mablag' yetishmaydi":"no enough money");
                                                }
                                                else {
                                                    System.out.println(lang.equals("uz") ? "Siz tanlagan maxsulot narxi 85ming so'm" :
                                                            "The price of the product you have chosen is 85,000 soums");
                                                    double balande = Double.parseDouble(karta[3]);
                                                    double kartanining = balande - 85000;
                                                    karta[3] = String.valueOf(kartanining);
                                                }

                                                break;
                                            case 5:
                                                if (Double.parseDouble(karta[3]) < 510000){
                                                    System.out.println(lang.equals("uz")?"mablag yetmaydi":"no enough money");
                                                }
                                                else {
                                                    System.out.println(lang.equals("uz") ? "Siz tanlagan maxsulot narxi 510ming so'm" :
                                                            "The price of the product you have chosen is 510,000 soums");
                                                    double balande = Double.parseDouble(karta[3]);
                                                    double kartanining = balande - 510000;
                                                    karta[3] = String.valueOf(kartanining);
                                                }

                                                break;
                                        }
                                        break;
                                    default:
                                        System.out.println(lang.equals("uz") ? "bunday bo'lim yo'q" : "\n" +
                                                "there is no such section");
                                        break;
                                }
                            }

                        } else {
                            System.err.println(lang.equals("uz") ? "avval karta qoshing" : "add a card first");
                        }
                        break;
                    case 4:
                        System.out.println(lang.equals("uz") ? "Kartalarim bo'limiga hush kelibsiz: 0>orqaga, 1>karta qo'shish, 2>Mening hisobim" : "welcome to carts page, 0>Back chooise: 1>add cart, 2>my balance ");
                        int o = scanner.nextInt();
                        switch (o) {
                            case 0:
                                System.out.println(lang.equals("uz") ? "Siz orqaga qaytdingzi" : "You are back");
                            case 1:
                                System.out.println(lang.equals("uz") ? "Karta bo'limiga hush kelibsiz" : "Welcome to carts page");
                                long f = 1000000000;
                                System.out.println(lang.equals("uz") ? "Kartangizni raqamini kiritng" : "enter your cart number");
                                String cartNumber = "";
                                while (cartNumber.length() <= 16) {
                                    f = scanner.nextLong();
                                    cartNumber = String.valueOf(f);
                                    if (cartNumber.length() <= 16) {
                                        System.out.println(lang.equals("uz") ? "Karta raqami hato, karta raqmi 16tadan kichik bo'lmasin" : "error cart number, cart number should consist 16 number");
                                    }
                                }
                                System.out.println(lang.equals("uz") ? "Kartangizni turini kiritng" : "enter your type of cart");
                                String turi = scanner.next();
                                System.out.println(lang.equals("uz") ? "Kartangizni amal qilish muddatini kiriting" :
                                        "Enter your card's expiration date");
                                String muddat = scanner.next();
                                System.out.println(lang.equals("uz") ? "Kartangizga pul kiriting" : "add money to your card");
                                String pul = scanner.next();

                                karta[0] = cartNumber;
                                karta[1] = muddat;
                                karta[2] = turi;
                                karta[3] = pul;
                                break;
                            case 2:
                                for (int i = 0; i < karta.length; i++) {
                                    System.out.println(karta[i]);
                                }
                                break;
                            default:
                                System.out.println(lang.equals("uz") ? "bunday bo'lim mavjud emas" : "Such have not page");
                                break;
                        }
                        break;
                    case 5:
                        if (user[0] != null){
                            int y = -1;
                            while (y != 0) {
                                System.out.println(lang.equals("uz")?"0>orqqaga, 1>Logout":"0>back, 1>Log out");
                                y = scanner.nextInt();
                                if (y == 0) {
                                    System.out.println(lang.equals("uz")?"orqaga qaytdingiz":"you are back");
                                } else if (y == 1) {
                                    user[0] = null;
                                    user[1] = null;
                                    user[2] = null;
                                    user[3] = null;
                                    user[4] = null;
                                    user[5] = null;
                                    user[6] = null;
                                    System.out.println(lang.equals("uz") ? "Siz chiqib ketdingiz" : "You are logout");
                                }
                                else {
                                    System.err.println(lang.equals("uz")?"bunday bo'lim yo'q":"there is no such section");
                                }
                            }
                        }
                        else {
                            System.out.println(lang.equals("uz")?"avval registratsiyadan uting":"please register first");
                        }
                        break;

                    default:
                        System.out.println(lang.equals("uz") ? "bunday bo'lim yo'q" : "there is no such section");
                        break;
                }


            }
        }

    }


    public String generateCode() {
        String kattaHarflar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String kichikHarflar = "abcdefghijklmnopqrstuvwxyz";
        String sonlar = "0123456789";


        String qosh = kattaHarflar + kichikHarflar + sonlar;

        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        int uzunligi = 5;
        for (int i = 0; i < uzunligi; i++) {
            int index = random.nextInt(qosh.length());
            char randomChar = qosh.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();


    }
}

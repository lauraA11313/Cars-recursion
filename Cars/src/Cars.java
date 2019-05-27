import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Car {
    int idn;
    String brand;
    String model;
    int year;
    String color;
    double price;
    int regNum;

    Car(int idn, String brand, String model, int year, String color, double price, int regNum){
        this.idn=idn;
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.regNum=regNum;
    }

}

public class Cars {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n=10;
        int currentYear = 2019;                                                                        //Calendar now = Calendar.getInstance();
        Car[] cars = new Car [n];

        cars[1] = new Car(1, "Hyundai", "Tucson", 2017, "black", 18000, 53867);
        cars[2] = new Car(2, "Tesla", "S", 2016, "blue", 67000, 53327);
        cars[3] = new Car(3, "Nissan", "Rogue", 2015, "black", 20000, 53737);
        cars[4] = new Car(4, "Tesla", "S", 2013, "red", 29000, 53337);
        cars[5] = new Car(5, "Hyundai", "Tucson", 2015, "white", 14500, 53877);
        cars[6] = new Car(6, "Nissan", "Rogue", 2016, "white", 22000, 53747);
        cars[7] = new Car(7, "Porsche", "Panamera", 2017, "black", 139000, 53997);
        cars[8] = new Car(8, "Tesla", "S", 2015, "green", 29000, 53537);
        cars[9] = new Car(9, "Honda", "Accord", 2018, "grey", 21000, 53137);
        cars[0] = new Car(10, "Honda", "Accord", 2012, "black", 10000, 53237);

        Proz proz=new Proz();
        Proz proz1=new Proz(cars);


        System.out.print("Марка: ");
        String mark = stdin.readLine();
        proz.brandlist(cars, mark);
        proz1.brandlist(mark);

        System.out.print("Модель автомобиля: ");
        String mod = stdin.readLine();
        System.out.print("Лет в эксплуатации: ");
        int yexp = Integer.parseInt(stdin.readLine());
        proz.yoModel(cars, mod, yexp, currentYear);
        proz1.yoModel(mod,yexp,currentYear);

        System.out.print("Год выпуска: ");
        int yearmanfct= Integer.parseInt(stdin.readLine());
        System.out.print("Цена от: ");
        int startprice = Integer.parseInt(stdin.readLine());
        proz.priceYears(cars, yearmanfct, startprice);
        proz1.priceYears(yearmanfct,startprice);


    }
}

/* */
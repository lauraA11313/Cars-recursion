
public class Proz {

    Car [] someCars;

    Proz(){
        Car [] someCars = new Car[10];
    }
    Proz(Car [] cars){
        someCars=cars;
    }



    void brandlist( Car [] cars, String mark) {
        for (int i=0;i<cars.length;i++) {
            if (cars[i].brand.equals(mark)){                               //////////////
                printOb(i, cars);
            }
        }
    }

    void brandlist(String mark) {
        for (int i=0;i<someCars.length;i++) {
            if (someCars[i].brand.equals(mark)){                               //////////////
                printOb(i, someCars);
            }
        }
    }

    void yoModel( Car [] cars, String model, int yearsExp, int currenYear) {
        for (int i = 0; i <cars.length; i++) {
            if (cars[i].model.equals(model) & (currenYear - cars[i].year) >= yearsExp) {                               //////////////
                printOb(i, cars);
            }
        }
    }

    void yoModel(String model, int yearsExp, int currenYear) {
        for (int i = 0; i <someCars.length; i++) {
            if (someCars[i].model.equals(model) & (currenYear - someCars[i].year) >= yearsExp) {                               //////////////
                printOb(i, someCars);
            }
        }
    }

    void priceYears (Car [] cars, int yearmanfct, int startprice){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].year==yearmanfct & cars[i].price>startprice)
                printOb(i, cars);
        }
    }

    void priceYears (int yearmanfct, int startprice){
        for (int i = 0; i < someCars.length; i++) {
            if (someCars[i].year==yearmanfct & someCars[i].price>startprice)
                printOb(i, someCars);
        }
    }

    void printOb (int i, Car [] cars){
        System.out.println("ID: "+cars[i].idn+"  Reg. number: "+cars[i].regNum+"  Brand: "+cars[i].brand+"  Model: "+cars[i].model+"  Year: "+cars[i].year+"  Color: "+cars[i].color+"  Price: "+cars[i].price);
    }


}

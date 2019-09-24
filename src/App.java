public class App {
    public static void main(String[] args) {
        //instancia
        XWingStarfighter ship1 = new XWingStarfighter();
        XWingStarfighter ship2 = new XWingStarfighter();
//        variable sin inicializar XWingStarfighter ship3;

        //dar valor a los atributos
        ship1.model = "T-65";
        ship1.maxAcceleration = 16;

        ship2.model = "T-65B";
        ship2.maxAcceleration = 14;

//       al no tener creado el operador "new" no tiene la referencia de objeto
//       ship3.model = "T-85";

        //invocar su metodo
        ship1.shootLaser();
        ship1.shootLaser();

        ship2.shootLaser();
    }
}

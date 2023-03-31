public class bucle {
    public static void main(String[] args) {
        System.out.println("-------------if--------------");

        int numero = 8;
        if (numero < 0) {
            System.out.println("El numero" + numero + " es negativo");
        } else {
            System.out.println("El numero" + numero + " es positovo");
        }
            
        //WHILE
        System.out.println("-------------While--------------");
        int numwhile =0;
        while (numwhile < 3) {
            System.out.println(numwhile);
            numwhile++;
        }
        //DO WHILE
        System.out.println("-------------Do While--------------");
        int numdowhile = 0;
        do {
            System.out.println(numdowhile);
        } while (numdowhile>3);

        //FOR
        System.out.println("-------------For--------------");
       
        for (int nunfor = 0; nunfor <= 3; nunfor++) {
            System.out.println(nunfor);
        }

         //CASE
         System.out.println("-------------case--------------");
         var estacion = "verano";

         switch (estacion) {

            case "primavera":
                System.out.println("Es Primavera");
                break;
            case "verano":
                System.out.println("Es Verano");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;

            default:
                System.out.println("No es una Estacion");
                break;
         }
       

    }
}

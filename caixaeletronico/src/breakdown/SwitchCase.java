package breakdown;

public class SwitchCase {
    public static void main(String[] args) {
        String plano = "M";

        switch(plano){
            case "T" : {
                System.out.println("5gb Youtube");
            }
            case "M" : {
                System.out.println("Whatsapp & Instagram gratis");
            }

            case "B" : {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}

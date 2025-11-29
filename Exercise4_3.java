public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}


STACK DİYAGRAMI
------------------------------
| ping()                     |
| (yerel değişken yok)       |
------------------------------
| baffle()                   |
| (yerel değişken yok)       |
------------------------------
| zoop()                     |
| (yerel değişken yok)       |
------------------------------
| main(String[] args)        |
------------------------------
main → zoop → baffle → ping

TAM ÇIKTI
No, I  wug. You wugga  wug.I  wug.

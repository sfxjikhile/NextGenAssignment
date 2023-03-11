public class HelloWorld {

    // These are called properties or attributes of a class
    private String name = "Isaac";
    private String Complexion = "Fair";
    private int age = 33;
    private String ability = "Strength";
    private String hobbies = "Singing, Dancing, Cooking and Reading";

    public void canSing(){
        System.out.println("I can sing");
    }
    public void canDance(){
        System.out.println("I dance very well");
    }
    public void canCook(){
        System.out.println("I am a very good cook");
    }
    public void canRead(){
        System.out.println("I love reading");
    }
    public static void main(String[] args) {
        HelloWorld firstObject = new HelloWorld();
        firstObject.canSing();

        HelloWorld secondObject = new HelloWorld();
        secondObject.canDance();

        HelloWorld thirdObject = new HelloWorld();
        thirdObject.canCook();

        HelloWorld fourthObject = new HelloWorld();
        fourthObject.canRead();

        Salary printSalary = new Salary();
        printSalary.calculateNetSalary(200000);

        Reservation printReservation = new Reservation("Reserved Table");
        printReservation.ShowTicket();

        Expression printexeculteTheExpression = new Expression();
        printexeculteTheExpression.executeTheExpression();

        Cylinder printVolume = new Cylinder();
        printVolume.calculateVolumeOfCylinder(2, 5);



    }
}
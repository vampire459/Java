public class Demo{
    public static void main(String[] args) {
        
        Car ObjCar_1 = new Car(180,"Silver","Swift");
        Car ObjCar_2 = new Car(140,"Red","Alto"); 
        ObjCar_1.acc();
        ObjCar_1.brake();
        ObjCar_2.acc();
        ObjCar_2.brake();
        
        System.out.println(ObjCar_2.color);
        ObjCar_2.color = "Blue";
        ObjCar_1.model = "Swift_sx";
        System.out.println(ObjCar_2.color);
        System.out.println(ObjCar_1.model);
    }
}

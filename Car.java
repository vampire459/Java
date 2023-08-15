public class Car {
    
    int max_speed;
    String color ;
    String model;
     
    public Car(int max_speed , String color , String model)
    {
        this.max_speed = max_speed;
        this.model = model;
        this.color = color ;
    }

    public void brake()
    {
        if(model.equalsIgnoreCase("Swift")){
            System.out.println("10 mtr for 60 km/hr.");
        }
        else if(model.equalsIgnoreCase("Alto")){
            System.out.println("20 mtr for 60 km/hr");
        }
    }


    public void acc()
    {
        if(model.equalsIgnoreCase("Swift")){
            System.out.println("4.6 sec to reach 100 km/hr.");
        }
        else if(model.equalsIgnoreCase("Alto")){
            System.out.println("12 sec to reach 100 km/hr.");
        }
    }
}

class parent {
    public void add() {
        System.out.println("Hello kawasaki");
    }
}
class Child extends parent{
    void display(){
        System.out.println("home");

    }
} 
public class over{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.display();
    }
}
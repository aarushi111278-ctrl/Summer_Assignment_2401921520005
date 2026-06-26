class outer{
    void display(){
        System.out.println("Display method of Outer Class");
    }
    class inner{
        void display(){
            System.out.println("Display method of Inner Class");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        outer o=new outer();
        o.display();
        outer.inner i=o.new inner();
        i.display();
    }
}
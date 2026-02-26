class MathOp{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    void info(){
        System.out.println("Hello");
    }
}

class AdvMath extends MathOp{
    void info(){
        System.out.println("Hi");
    }
}

public class Demo{
    public static void main(String[] args){
        MathOp m=new MathOp();
        System.out.println("Overloading 1:"+m.add(5,10));
        System.out.println("Overloading 2:"+m.add(5,10,15));
        
        m.info();
        AdvMath a=new AdvMath();
        a.info();
    }
}

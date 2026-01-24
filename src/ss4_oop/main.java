package ss4_oop;

public class main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -3, 2);

        if(quadraticEquation.getDiscriminant()<0){
            System.out.println("vô nghiệm");
        }else if(quadraticEquation.getDiscriminant()>0){
            System.out.println("hai nghiêm");
            System.out.println("x1="+quadraticEquation.getRoot1());
            System.out.println("x2"+quadraticEquation.getRoot2());

    }else{
            System.out.println("nghiệm kép");
            System.out.println("x1=x2="+quadraticEquation.getRoot2());
        }
    }
}

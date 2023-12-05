// addition of two numbres 


class test{
    int a,b;
    int sum(int x,int y){
        a=x;
        b=y;
        return a+b;
    }
}
class add1{
    public static void main(String [] args){
        test t;
        t=new test();
        System.out.println(t.sum(9,6));
    }
}
package Examples.E016Temp;

class atg {
    void a() {
        int b[]={1,2,3,4,5,6,7}; //метод а
        c(b);
    }

    void c(int b[]) {
        int e=b.length;
        for(int f=0;f<e;f++) {
            System.out.print(b[f]+" ");//Single Space
        }
    }

    public static void main(String args[]) {
        atg ob=new atg();
        ob.a();
    }
}
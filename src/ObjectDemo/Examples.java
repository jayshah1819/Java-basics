package ObjectDemo;

public class Examples {

    int num;
    float gpa;

    public Examples(int num, float gpa){
        this.num=num;
        this.gpa=gpa;
    }



// this will give human readable representation of an object.
    @Override
    public String toString() {
        return "examples{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

// this is called when garbagge is collected.
    //@Override
   // protected void finalize() throws Throwable {
    //    super.finalize();

    public static void main(String[] args){
        Examples obj1=new Examples(19,44.4f);
        Examples obj2=new Examples(19,22.5f);

        System.out.println(obj1.hashCode());// this object will give hash number of it.Just to check thats how hashfunction works.
        if(obj1==obj2){
            System.out.println("Same");
        }
        if(obj1.equals(obj2)){
            System.out.println("same");// problem occurs here that what we are looking gpa or nums because it has 2 parameters.

        }
    }

}

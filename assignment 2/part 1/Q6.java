class Animal{
    String name,color,type;
    Animal(String name,String color, String type){
        this.name=name;
        this.color=color;
        this.type=type;
    }
    public int getHashCode(){
        return this.hashCode();
    }
}
public class Q6
{
    public static void main(String[] args) {
        Animal a1 = new Animal("Rabi","Brown","Pet");
        Animal a2 = new Animal("Pratik","White","Wild");
        Animal a3 = new Animal("Smruti","Black","Pet");
        Animal a4 = new Animal("Satya","Black","Wild");
        System.out.println("HashCode for Rabi: "+a1.getHashCode());
        System.out.println("HashCode for Pratik: "+a2.getHashCode());
        System.out.println("HashCode for Smruti: "+a3.getHashCode());
        System.out.println("HashCode for Satya: "+a4.getHashCode());
    }
}

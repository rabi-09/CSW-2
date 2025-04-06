import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address{
    int plotNo;
    String at, post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "PlotNo=" + plotNo + ", At=" + at + ", Post=" + post;
    }
}
public class Q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> tm = new TreeMap<>();
        tm.put("Rabi",new Address(1,"Jagamohan Nagar","Khandagiri"));
        tm.put("Pratik",new Address(2,"Kishore Nagar","Cuttack Sadar"));
        tm.put("Smruti",new Address(3,"Jagamara","Bhubana"));
        tm.put("Naresh",new Address(4,"Bhandari Pokhari","Bhadrak"));

        Iterator<Map.Entry<String, Address>> itr = tm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String, Address> map = itr.next();
            System.out.println(map.getKey()+" Address: "+map.getValue());
        }
    }
}


import java.util.*;

class VehicleModel
{
    String make;
    String model;
    long units;
    double price;
    public VehicleModel(String make,String model,long n)
    {
this.units=n;this.make=make;this.model=model;
    }
    public String toString()
    {
        return make+" "+model+" "+units;
    }

}
public class ArrayListDemo {

    public static void main(String[] args) {

        //List allows duplicate values, stores values in the order given/added
        //Dynamic Arrays, can shrink or increase size dynamically unlike normal arrays
	/*	ArrayList<String> atmp = new ArrayList<String>();
		atmp.add("hgdf");

		ArrayList<String> al = new ArrayList<String>();
		al.addAll(atmp);
		al.add("BCD");
		al.add("A1");
		al.add("A2");
		al.add("A2");
	*/
        HashSet<VehicleModel> a1=new HashSet<>();
        a1.add(new VehicleModel("Ford","fiesta",10));
        a1.add(new VehicleModel("Ford","fiesta",10));
        a1.add(new VehicleModel("Ford","fiesta",10));
        a1.add(new VehicleModel("Ford","Mustang",3));
        a1.add(new VehicleModel("Nissan","micra",3));
        dArrayList("Original ArrayList: ", a1);

       // Collections.reverse(a1);

        //dArrayList("After Reversing: ",a1);
        System.out.println("-------------------------");

       // Collections.shuffle(a1);


      //  dArrayList("After Shuffling ",a1);
    }

    static void dArrayList(String str, HashSet<VehicleModel> al)
    {
        System.out.println("------------------------------");
        System.out.println(str);
        Iterator<VehicleModel> itr = al.iterator();
        //using Iterator, we can traverse only in forward direction
        for(;itr.hasNext();)
        {
            VehicleModel tStr = itr.next(); //returns Object
            System.out.println(tStr.toString()+" ");
        }
    }

}

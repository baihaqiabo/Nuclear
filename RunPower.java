
package nuclear;

public abstract class RunPower implements Socket{

public static void main (String[] args) {

    Socket socNuclear = new NuclearPower();
    Socket socPanas = new PanasPower();
    Socket socBom = new BomPower();

    socNuclear.countPower();
    socPanas.countPower();
    socBom.countPower();
    
    System.out.println("Nuklir : "+socNuclear.getPower());
    System.out.println("Panas : "+socPanas.getPower());
    System.out.println("Bom : "+socBom.getPower());
    System.out.println(x); //pemanggilan variable static
    System.out.println(y); //pemanggilan variable 
}
}

package nuclear;

public class NuclearPower implements Socket{
    
    @Override
    public String getPower(){
    return "ini adalah tenaga nuklir";
}
    @Override
    public void countPower(){
        System.out.println("Senjata Nuklir sangat berbahaya");
    }
}
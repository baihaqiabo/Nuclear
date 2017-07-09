
package nuclear;

public class PanasPower implements Socket,Socket2,Socket3{ //kelas meng-implements banyak interface
    
    @Override
    public String getPower(){
    return "ini adalah tenaga panas";
}
    @Override
    public void countPower(){
        System.out.println("Radiasi Panas sangat berbahaya tingkat 1");
    }
     @Override
    public String getPower2(){
    return "ini adalah tenaga panas";
}
    @Override
    public void countPower2(){
        System.out.println("Radiasi Panas sangat berbahaya tingkat 2");
    }
     @Override
    public String getPower3(){
    return "ini adalah tenaga panas";
}
    @Override
    public void countPower3(){
        System.out.println("Radiasi Panas sangat berbahaya tingkat 3");
    }
}
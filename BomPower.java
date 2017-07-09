/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuclear;

/**
 *
 * @author baihaqi
 */
public class BomPower implements Socket{
    
    @Override
    public String getPower(){
    return "ini adalah tenaga bom";
}
    @Override
    public void countPower(){
        System.out.println("Senjata bom sangat berbahaya");
    }
}

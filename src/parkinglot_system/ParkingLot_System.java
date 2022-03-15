/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parkinglot_system;

/**
 *
 * @author 0040962113047
 */
public class ParkingLot_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carros carro;
        
        
        carro = new Carros("GIJ-JOE14", "Confort-Flex", 2030, 10000);
        
        carro.disponivel();
        carro.oferta(15000);
        carro.venderCarro("Roberto", 15000);
        carro.comissao();
        carro.imprimeDados();
        
    }
    
}

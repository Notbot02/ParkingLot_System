/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkinglot_system;

/**
 *
 * @author 0040962113047
 */
public class Carros {
    
    String placa, modelo, Vendedor;
    
    int AnoFabri;
    double Valor_Compra, ValorVenda;
    boolean Dispo;
    
    public Carros(String placa, String modelo, int AnoFabri, double Valor_Compra)
    {
        this.placa = placa;
        this.modelo = modelo;
        this.AnoFabri = AnoFabri;
        this.Valor_Compra = Valor_Compra;
        Dispo = true;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabri() {
        return AnoFabri;
    }

    public double getValor_Compra() {
        return Valor_Compra;
    }
    
     public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabri(int AnoFabri) {
        this.AnoFabri = AnoFabri;
    }

    public void setValor_Compra(double Valor_Compra) {
        this.Valor_Compra = Valor_Compra;
    }

    public boolean isDispo() {
        return Dispo;
    }
    
    public boolean disponivel()
    {
        if(Dispo == true)
        {
            
            return true;
        }
        else
        {
            
            return false;
        }
    }
    
    public boolean oferta(double valor)
    {
        return valor >= Valor_Compra*1.1;
        
    }
    
    public boolean venderCarro(String vendedor, double ValorVenda)
    {
        if(oferta(ValorVenda) == true && disponivel() == true)
        {
            this.Vendedor = vendedor;
            this.ValorVenda = ValorVenda;
            System.out.println("Carro Vendido");
            Dispo = false;
            return true;
        }
        else
        {
            if(oferta(ValorVenda) == false)
            {
               System.out.println("O valor não aceitável"); 
            }
            else if(disponivel() == false)
            {
                System.out.println("Carro Indisponível");
            }
            return false;
        }
    }
    
    public double comissao()
    {
        if(Dispo == false)
        {
            return ((ValorVenda - Valor_Compra) * 0.1);
        }
        else
        {
            return 0;
        }
    }
    
    public void imprimeDados()
    {
        System.out.println("Placa: " + placa + "\n" +
        "Modelo: " + modelo + "\n" +
        "Ano de Fabricação: " + AnoFabri + "\n" +
        "Valor de Compra: " + Valor_Compra + "\n" +
        disponivel());
        if(Dispo == false)
        {
            System.out.println("O carro foi vendido pelo vendendor " + Vendedor + " pelo valor de " + ValorVenda);
            System.out.println("A comissão recebida pelo vendedor foi de " + comissao());
        }
        else
        {
            System.out.println("0");
        }
        
    }
    
}


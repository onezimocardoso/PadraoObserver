/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttest.estacaotempoteste;

/**
 *
 * @author onezi
 */
public class Display1 implements Observer, DisplayElemento {
    private float temperatura;
    private float umidade;
    private EstacaoTempo estacaotempo;
    
    public Display1(EstacaoTempo estacaotempo){
        this.estacaotempo = estacaotempo;
        estacaotempo.registrarObserver(this); 
    }
    
    public void update(float temperatura, float umidade, float pressao){
        this.temperatura=temperatura;
        this.umidade=umidade;
        display();
    }
    
    public void display(){
        System.out.println("Condicao Atual.");
        System.out.println("Temperatura: "+temperatura+"ºC");
        System.out.println("Umidade"+umidade+" %");         
    }
            
}

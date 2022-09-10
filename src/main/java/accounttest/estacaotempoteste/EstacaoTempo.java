/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttest.estacaotempoteste;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author onezi
 */
public class EstacaoTempo implements Subject{
   
    //variáveis de instância
    private List<Observer> observers;
    private float temperatura;
    private float umidade;
    private float pressao;
    
    //construtor
    
    public EstacaoTempo(){
    observers = new ArrayList<Observer>();
    }
    
    public void registrarObserver(Observer o){
        observers.add(o); //adiciona um observador no final da lista
    }
    
    public void removerObserver(Observer o){
        observers.remove(o);
    }
    
    public void notificarObserver(){
        for(Observer itemobserver : observers){
            itemobserver.update(temperatura, umidade, pressao);
        }
    }
    
    public void mudancaMedidas(float temperatura, float umidade, float pressao){
        this.temperatura=temperatura;
        this.umidade=umidade;
        this.pressao=pressao;
        notificarObserver();
    }
    
}

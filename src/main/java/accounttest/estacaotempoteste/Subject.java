/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package accounttest.estacaotempoteste;

/**
 *
 * @author onezi
 */
public interface Subject {
    public void registrarObserver(Observer o);
    public void removerObserver(Observer o);
    public void notificarObserver();
}

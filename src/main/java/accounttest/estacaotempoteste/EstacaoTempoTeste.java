/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package accounttest.estacaotempoteste;

/**
 *
 * @author onezi
 */
public class EstacaoTempoTeste {

    public static void main(String[] args) {
        EstacaoTempo estacaoTempo = new EstacaoTempo();
        
        Display1 display1 = new Display1(estacaoTempo);
        
        Display2 display2 = new Display2(estacaoTempo);
        
        estacaoTempo.mudancaMedidas(32f, 20f, 1.5f);
        System.out.println("\n");
        estacaoTempo.mudancaMedidas(31f, 19f, 1.2f);
        System.out.println("\n");
        estacaoTempo.mudancaMedidas(29f, 18f, 1.1f);
        
        estacaoTempo.removerObserver(display2);
        System.out.println("------\n\n\n");
        
        estacaoTempo.mudancaMedidas(32f, 20f, 1.5f);
        System.out.println("\n");
        estacaoTempo.mudancaMedidas(31f, 19f, 1.2f);
        System.out.println("\n");
        estacaoTempo.mudancaMedidas(29f, 18f, 1.1f);
    }
}

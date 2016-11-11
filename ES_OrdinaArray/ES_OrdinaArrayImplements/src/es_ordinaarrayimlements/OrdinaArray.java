/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_ordinaarrayimlements;

/**
 * Classe necessaria per ordinare il vettore passato in input
 * @author Nurul
 */
public class OrdinaArray implements Runnable {
    public int[] vet;
    private String s;
    
    public int[] getVet()
    {
        return vet;
    }
    /**
     * Costruttore
     * @param vet Vettore passato in input
     */
    public OrdinaArray(int[] vet)
    {
        this.vet = vet;
    }
    
    /**
     * Metodo per ordinare in maniera crescente un vettore
     * @param vet Vettore da ordinare
     * @return vettore ordinato
     */
    public int[] ordina(int[] vet)
    {
        for(int i=0; i<vet.length -1; i++) 
        { 
            int min = i;

            for(int j=i+1; j<vet.length; j++) 
              if(vet[j] < vet[min])  
                min = j;

            int temp=vet[min]; 
            vet[min]=vet[i]; 
            vet[i]=temp; 
        }
        return vet;
    }
    
    /**
     * Metodo per visualizzaregli elementi del vettore
     * @param vet Vettore da visualizzare
     * @return Stringa contenente gli elementi del vettore
     */
    public String toString(int[] vet)
    {
        String s = "";
        for(int i = 0; i < 100; i++)
            s += vet[i] + " ";
        return s;
    }
    
    @Override
    public void run()
    {
        ordina(vet);
        System.out.println("");
        System.out.println("ORDINATO");
        System.out.println(toString(vet));
    }
}

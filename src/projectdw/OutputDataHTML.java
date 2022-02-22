/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdw;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class OutputDataHTML {
    private String titoloBorsistico;
    private String piazzaDiScambiio;
    private String nomeAzienda;
    private String inidirizzoQuartierGenerale;
    private String descrizione;
    private Elaborations elaborazioni;

    public OutputDataHTML(String titoloBorsistico, String piazzaDiScambiio, String nomeAzienda, String inidirizzoQuartierGenerale, String descrizione, Elaborations elaborazioni) {
        this.titoloBorsistico = titoloBorsistico;
        this.piazzaDiScambiio = piazzaDiScambiio;
        this.nomeAzienda = nomeAzienda;
        this.inidirizzoQuartierGenerale = inidirizzoQuartierGenerale;
        this.descrizione = descrizione;
        this.elaborazioni = elaborazioni;
    }

    
    
}

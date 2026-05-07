/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlversiones;

/**
 *
 * @author Matius
 */
public class ClasePrueba {

    String prueba;
    String commit;
    String push;

    public ClasePrueba(String prueba, String commit, String push) {
        this.prueba = prueba;
        this.commit = commit;
        this.push = push;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public String getPush() {
        return push;
    }

    public void setPush(String push) {
        this.push = push;
    }

    
}

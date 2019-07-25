package br.com.BancoOnline.Controladores;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ControladorHome implements Serializable {

    private String usuario;
    private String saldo;

    @PostConstruct
    public void init() {
        this.usuario = "Luanderson";
        this.saldo = "200";
    }

   public String usuarioLogado(){

       return this.usuario;
   }

   public String saldoUsuario(){

       return this.saldo;
   }

    public ControladorHome() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}

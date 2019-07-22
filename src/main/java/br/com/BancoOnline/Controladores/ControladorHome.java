package br.com.BancoOnline.Controladores;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named
@RequestScoped
public class ControladorHome {


    private String text = "Hello World!";

    @PostConstruct
    public void initialize() {
        System.out.println( " was constructed");
    }

    public String getText() {
        return text;
    }

}

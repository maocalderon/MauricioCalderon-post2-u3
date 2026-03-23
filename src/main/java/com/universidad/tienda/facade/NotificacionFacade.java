package com.universidad.tienda.facade;
import org.springframework.stereotype.Service;

@Service
public class NotificacionFacade {
    public void notificarCompraExitosa(String correo, String telefono, String pushToken, String ordenId) {
        String msg = "Su orden " + ordenId + " ha sido procesada exitosamente.";
        System.out.println("EMAIL enviado a: " + correo);
        System.out.println("SMS enviado a: " + telefono);
        System.out.println("PUSH enviado a: " + pushToken);
    }
}
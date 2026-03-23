package com.universidad.tienda.decorator;
public class LoggingDecorator extends OrdenServicioDecorator {
    public LoggingDecorator(OrdenServicio wrapped) { super(wrapped); }
    @Override
    public String procesarOrden(String ordenId, double monto) {
        System.out.println("[LOG] Iniciando procesamiento: " + ordenId);
        String resultado = wrapped.procesarOrden(ordenId, monto);
        System.out.println("[LOG] Completado. Resultado: " + resultado);
        return resultado;
    }
}
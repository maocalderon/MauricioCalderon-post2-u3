package com.universidad.tienda;
import com.universidad.tienda.decorator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    @Test
    void testOrdenValida() {
        OrdenServicio base = new OrdenServicioBase();
        OrdenServicio svc = new AuditoriaDecorator(new ValidacionDecorator(new LoggingDecorator(base)));
        String result = svc.procesarOrden("ORD-001", 50000.0);
        assertTrue(result.startsWith("PROCESADA:"));
    }
}
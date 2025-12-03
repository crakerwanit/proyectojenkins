/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.miclase.MiClase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author David Catena
 */

 // @Test
    // public void x() {}

public class NewEmptyJUnitTest {
    
    @Test
    public void dia_laboral() {
        assertTrue(MiClase.dia_laboral("lunes"));
        assertTrue(MiClase.dia_laboral("Lunes"));
        
        assertTrue(MiClase.dia_laboral("martes"));
        assertTrue(MiClase.dia_laboral("Martes"));
        
        assertTrue(MiClase.dia_laboral("miércoles"));
        assertTrue(MiClase.dia_laboral("Miércoles"));
        
        assertTrue(MiClase.dia_laboral("jueves"));
        assertTrue(MiClase.dia_laboral("Jueves"));
        
        assertTrue(MiClase.dia_laboral("viernes"));
        assertTrue(MiClase.dia_laboral("Viernes"));
        
        assertTrue(MiClase.dia_laboral("sábado"));
        assertTrue(MiClase.dia_laboral("Sábado"));
        
        assertTrue(MiClase.dia_laboral("domingo"));
        assertTrue(MiClase.dia_laboral("Domingo"));
    }
    
  
    @Test
    public void dia_laboralLunes() {
        assertEquals(MiClase.dia_laboral("martes"), false);
    }
    
    @Test
    public void dia_laboralMartes() {
        assertEquals(MiClase.dia_laboral("martes"), true);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   
}

package base.tipoDato;

import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 *
 * @author Omar Paché
 */
public class CorreoTest {

    private static final Logger LOG = Logger.getLogger(CorreoTest.class);

    public CorreoTest() {
    }

    /**
     * Probando que se cree un correo electrónico válido.
     */
    @Test
    public void test_crearCorreo_OK() {
        LOG.info("Probando que se cree un correo electrónico válido");
        String correoValido = "guantanamena@gmail.com";
        Correo correo = new Correo(correoValido);
        assertEquals(correoValido, correo.toString());
    }

    /**
     * Probando que falle la creación de un correo electrónico por no ingresar una dirección.
     */
    @Test(expected = NullPointerException.class)
    public void test_crearCorreo_Nulo() {
        LOG.info("Probando que falle la creación de un correo electrónico por no ingresar una dirección");
        String correoNull = null;
        Correo correo = new Correo(correoNull);
        assertNull(correo);
    }

    /**
     * Probando que falle la creación de un correo electrónico por ingresarlo con un formato inválido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_crearCorreo_invalido_sinNombre() {
        LOG.info("Probando que falle la creación de un correo electrónico al ingresarlo con un formato inválido");
        String correoInvalido = "@gmail.com";
        Correo correo = new Correo(correoInvalido);
    }

    /**
     * Probando que falle la creación de un correo electrónico por ingresarlo con un formato inválido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_crearCorreo_invalido_sinArroba() {
        LOG.info("Probando que falle la creación de un correo electrónico al ingresarlo con un formato inválido");
        String correoInvalido = "nombregmail.com";
        Correo correo = new Correo(correoInvalido);
    }

    /**
     * Probando que falle la creación de un correo electrónico por ingresarlo con un formato inválido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_crearCorreo_invalido_sinHosting() {
        LOG.info("Probando que falle la creación de un correo electrónico al ingresarlo con un formato inválido");
        String correoInvalido = "nombre@.com";
        Correo correo = new Correo(correoInvalido);
    }

    /**
     * Probando que falle la creación de un correo electrónico por ingresarlo con un formato inválido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void test_crearCorreo_invalido_sinDominio() {
        LOG.info("Probando que falle la creación de un correo electrónico al ingresarlo con un formato inválido");
        String correoInvalido = "nombre@gmail";
        Correo correo = new Correo(correoInvalido);
    }

}

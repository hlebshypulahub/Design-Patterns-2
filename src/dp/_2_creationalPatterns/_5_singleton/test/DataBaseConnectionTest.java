package dp._2_creationalPatterns._5_singleton.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import org.junit.Ignore;
import org.junit.Test;

import dp._2_creationalPatterns._5_singleton.code.DataBaseConnection;

import static org.junit.Assert.*;

/**
 * TASK 2.5 - Try to think about repairing the tests, check Enum-singleton
 * solution
 *
 * @author apuchals
 */
public class DataBaseConnectionTest {

    /**
     *
     */
    @Test
    public void shouldReturnInstance() {
        // when
        DataBaseConnection connection = DataBaseConnection.getInstance();

        // then
        assertNotNull(connection);
    }

    /**
     *
     */
    @Test
    public void shouldReturnTheSameInstance() {
        // when
        DataBaseConnection connection1 = DataBaseConnection.getInstance();
        DataBaseConnection connection2 = DataBaseConnection.getInstance();

        // then
        assertSame(connection1, connection2);
    }

    /**
     * @throws Throwable some exception
     */
    @SuppressWarnings("unchecked")
//	@Ignore("A Bit silly... but?")
    @Test
    public void shouldForbidInstantiation() throws Throwable {
        // given
        Constructor<DataBaseConnection> constructor = (Constructor<DataBaseConnection>) DataBaseConnection.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);

        // when
        DataBaseConnection connection1 = DataBaseConnection.getInstance();

        Exception exception = assertThrows(IllegalArgumentException.class, constructor::newInstance);

        String expectedMessage = "Cannot reflectively create enum objects";
        String actualMessage = exception.getMessage();

        // then
        assertTrue(actualMessage.contains(expectedMessage));

        // then
//        assertSame(connection1, connection2);
    }

    /**
     * @throws Throwable some exception
     */
//	@Ignore("Hey! I am not even exporting this in the class API!")
    @Test
    public void shouldForbidStreamDeserialization() throws Throwable {
        // given
        byte[] serializedConnection = toBytes(DataBaseConnection.getInstance());

        // when
        DataBaseConnection deserializedConnection = (DataBaseConnection) fromBytes(serializedConnection);

        // then
        assertSame(deserializedConnection, DataBaseConnection.getInstance());
    }

    private byte[] toBytes(Object object) throws Throwable {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream(); //
             ObjectOutput out = new ObjectOutputStream(bos);) {
            out.writeObject(object);
            return bos.toByteArray();
        }
    }

    private Object fromBytes(byte[] array) throws Throwable {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(array); //
             ObjectInput in = new ObjectInputStream(bis);) {
            return in.readObject();
        }
    }

}

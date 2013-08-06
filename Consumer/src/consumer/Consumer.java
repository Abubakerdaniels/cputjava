/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consumer;
import javax.jms.*;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
/**
 *
 * @author Wallied
 */
public class Consumer 
{

    
    private static String url=ActiveMQConnection.DEFAULT_BROKER_URL;
    
    private static  String subject="TESTQUEUE";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JMSException
    {
        // TODO code application logic here
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp:155.238.39.112:61626");
        Connection        connection = connectionFactory.createConnection();
        connection.start();
        
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        
        Destination destination = session.createQueue(subject);
        
        MessageConsumer consumer =session.createConsumer(destination);
        
        Message message = consumer.receive();
        
        if(message instanceof  TextMessage)
        {
            TextMessage  textMessage=(TextMessage)message;
            System.out.println("Recieved message "+textMessage.getText());
        }
        
        connection.close();
        
    }
}

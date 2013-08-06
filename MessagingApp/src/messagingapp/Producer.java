/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapp;


import javax.jms.*;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 *
 * @author Wallied
 */
public class Producer
{
    private static String url =ActiveMQConnection.DEFAULT_BROKER_URL;
    
    private static String subject ="TESTQUEUE";
    
    public static void main (String[] args) throws JMSException
    {
        
        ConnectionFactory  connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection= connectionFactory.createConnection();
        connection.start();
        
        Session session =connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        
        Destination destination = session.createQueue(subject);
        
        MessageProducer producer= session.createProducer(destination);
        
        TextMessage message = session.createTextMessage("Yah my brue");
        
        producer.send(message);
        
        System.out.println("Sent message ' "+ message.getText());
        
        connection.close();
        
        
    }
}

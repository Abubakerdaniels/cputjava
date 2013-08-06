/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapp;

import java.net.URI;
import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.broker.TransportConnector;

/**
 *
 * @author Wallied
 */
public class MessagingApp 
{
    /**
     * @param args the command line arguments
     *///"tcp://155.238.35.144:6061"
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        BrokerService broker=new  BrokerService();
        
        TransportConnector connector = new TransportConnector();
        connector.setUri(new URI("tcp://localhost:61626"));
        
        broker.addConnector(connector);
        broker.start();
        System.out.println("Messaging Middleware Started");
    }
    
}

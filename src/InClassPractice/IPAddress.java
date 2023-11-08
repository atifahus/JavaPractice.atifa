package InClassPractice;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddress {
    public static void main(String[] args) throws UnknownHostException {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter host name: ");
        String hostName=sc.next().toLowerCase();

        InetAddress ipAddress=InetAddress.getByName(hostName);
        System.out.println("The IP Address for the host is: "+ ipAddress.getHostAddress());
    }
}

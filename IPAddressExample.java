import java.net.*;

public class IPAddressExample{
	public static void main(String[] args){
		try{
			//try to get the local host information
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("local host name is " + address.getHostName());
			System.out.println("local host ip address is " + address.getHostAddress());
			//try to get the host information from a given input 
			String[] addressList = args;
			for (int i = 0; i < addressList.length; i++){
				InetAddress[] tempAddressList = InetAddress.getAllByName(addressList[i]);
				for (int j = 0; j < tempAddressList.length; j++){
					System.out.println(tempAddressList[j].getHostName());
					System.out.println(tempAddressList[j].getHostAddress());
				}
			}
		}catch(UnknownHostException e){
			System.out.println("unable to determine the host address");
		}
	}
}
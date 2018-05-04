package GUI;

import java.net.*;
import java.io.*;

public class Server {

	private ServerSocket server;

	public Server(GUIController gui){
		
		try {
			server = new ServerSocket(22223);
			new WaitingForConnection(server, gui);
		}catch(IOException i) {
			System.out.println(i);
		}
	}
}
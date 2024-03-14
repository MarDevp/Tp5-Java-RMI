package Client;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Reverse extends UnicastRemoteObject implements ReverseInterface {
    public Reverse() throws RemoteException {}

    public String reverseString(String input) throws RemoteException {
        return new StringBuilder(input).reverse().toString();
    }
}

package servidor_c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ra21504533
 */
public class Servidor_C {

    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Aguardando Conexão na porta 1234");
            ServerSocket servidor = new ServerSocket(1234); // Prepara o servidor para receber conexoes na porta 1234
            Socket socket = servidor.accept(); //Interrompe a execução esperando um cliente
            System.out.println("Recebi Uma conexão" + socket.getInetAddress().getHostAddress());

        } catch (Exception e) {
            System.out.println("Erro na Conexão!");

        }
        System.out.println("Fim");

    }

}

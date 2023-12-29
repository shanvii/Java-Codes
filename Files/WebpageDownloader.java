import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class WebpageDownloader {
    public static void main(String[] args)
     {
        String url = "https://vitbhopal.ac.in";  

        try {
            URL webpageUrl = new URL(url);
            URLConnection connection = webpageUrl.openConnection();
            InputStream inputStream = connection.getInputStream();

            // Save the webpage content to a file
            try (OutputStream outputStream = new FileOutputStream("webpage.html")) 
            {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) 
                {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("Webpage downloaded successfully.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}

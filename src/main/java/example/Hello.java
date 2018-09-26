package example;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.services.lambda.runtime.Context; 

public class Hello implements RequestStreamHandler{
   
    
    @Override 
    public void handleRequest(InputStream input,OutputStream output,Context context) throws IOException  {
      int letter;
        while((letter = input.read()) != -1)
        {
            output.write(Character.toLowerCase(letter));
        }
    
    }
}
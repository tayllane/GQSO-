package app;
import io.jooby.annotations.*;
import io.jooby.exception.*;

public class Soma{
    @Path ( "/soma/{b}/{m}")
    @GET 
    public String rotaDaSoma(@PathParam String b, @PathParam String m){
        try {
            double s = Double.parseDouble(b) + Double.parseDouble(m);

            return String.format("%.2f", s);
        } 
        catch (NumberFormatException nfe) {
           throw new BadRequestException(String.format("paramêtro inválido"));
        }
        
    }
}
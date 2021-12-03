package app;
import io.jooby.annotations.*;
import io.jooby.exception.*;

public class Soma{
    @Path ( "/soma/{b}/{m}")
    @GET 
    public String rotaDaSoma(@PathParam String b, @PathParam String m) throws BadRequestException{
        try{
        double s = Double.parseDouble(b) + Double.parseDouble(m);
          return String.format("%.2f", s);
        } catch (IllegalArgumentException iae){
            throw new BadRequestException(iae.getMessage());
        }
    }
    public double soma(String op) throws IllegaArgumentException {
        try {
        } 
        catch (NumberFormatException nfe) {
           throw new BadRequestException(String.format("paramêtro inválido"));
        }
        
    }
}
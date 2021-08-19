package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;
public class RaizQuadrada{

    @Path("/raiz/{op}")
    @GET
    public string rotaRaizQuadrada(@PathParam String op){
        
        try{
            //converter op para double(verificar erros)
            //calcula a raiz quadrada
         return Math.sqrt (Double.parseDouble(op));


           //retorna raiz quadrada para o usuario com duas casas decimais
           return String.format("%.2f", sqrt);
        } catch (NumberFormatException nfe){
            new BadRequestException(String.format("parâmetro inválido:\%s\", op));
        }
        
        //retornar raiz quadrada de op


        System.out.printf("Operador: %s", op);
        return "Raiz Quadrada";
    }
}
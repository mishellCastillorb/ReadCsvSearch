import java.io.*;

public class LecturaDatosBufer
{
    public static Metodo leer () throws IOException
    {
        String str;
        File archivoEntrada= new File("denue_inegi_11_.csv");
        FileReader  lectorArchivo=new FileReader(archivoEntrada);
        BufferedReader lectorBuf = new BufferedReader(lectorArchivo);
        Metodo m=new Metodo();
        Establecimiento estable=null;
      while (lectorArchivo.ready())
      {
        str=lectorBuf.readLine();
        String [] pps=str.split(",");
        String id=pps[0].replace("|", ",");
        String establecimiento=pps[2].replace("|", ",");
        String municipio=pps[30].replace("|", ",");
        String entidad=pps[28].replace("|", ",");
        estable=new Establecimiento(id,establecimiento,municipio, entidad);
        System.out.println(estable);
        m.agregarEstablecimiento(estable);
        }
        lectorBuf.close();
        return m;
    }
}

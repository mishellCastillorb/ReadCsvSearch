
public class Establecimiento 
{
   private String id;
   private String establecimiento;
   private String municipio;
   private String entidad;
   public Establecimiento(String i,String e, String m, String en)
   {
       id=i;
       establecimiento=e;
       municipio=m;
       entidad=en;
    }
    public void setEstablecimiento(String e)
    {
        establecimiento=e;
    }
    public String getEstablecimiento()
    {
        return establecimiento;
    }
    public void setMunicipio(String m)
    {
        municipio=m;
    }
    public String getMunicipio()
    {
        return municipio;
    }
    public void setEntidad(String en)
    {
        entidad=en;
    }
    public String getEntidad()
    {
        return entidad;
    }
    public void setId(String i)
    {
        id=i;
    }
    public String getId()
    {
        return id;
    }
    
   public String toString() {
       return id+", "+establecimiento+", "+municipio+", "+entidad;
   }
}

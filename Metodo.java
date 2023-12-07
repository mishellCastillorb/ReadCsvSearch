import java.util.Vector;

public class Metodo
{
    private Vector<Establecimiento> e;
    public Metodo()
    {
        e=new Vector();
    }
    public void agregarEstablecimiento(Establecimiento ei)
    {
        e.add(ei);
    }
    public Metodo filtroNomEstable(String ne){
        Metodo otro=new Metodo();
        for(int i=0;i<e.size();i++){
            if(e.get(i).getEstablecimiento().equals(ne)){
                otro.agregarEstablecimiento(e.get(i));
            }
        }
        return otro;
    }
    public Metodo filtroNomEntidad(String ne){
        Metodo otro=new Metodo();
        for(int i=0;i<e.size();i++){
            if(e.get(i).getEntidad().equals(ne)){
                otro.agregarEstablecimiento(e.get(i));
            }
        }
        return otro;
    }
    public Metodo filtroNomMunicipio(String ne){
        Metodo otro=new Metodo();
        for(int i=0;i<e.size();i++){
            if(e.get(i).getMunicipio().equals(ne)){
                otro.agregarEstablecimiento(e.get(i));
            }
        }
        return otro;
    }
    public Metodo filtroId(String ne){
        Metodo otro=new Metodo();
        for(int i=0;i<e.size();i++){
            if(e.get(i).getId().equals(ne)){
                otro.agregarEstablecimiento(e.get(i));
            }
        }
        return otro;
    }
    public void imprimir()
    {
        for(int i=0;i<e.size();i++)
        {
            System.out.println("Id: "+e.get(i).getId()+ " Establecimiento: "+e.get(i).getEstablecimiento()+" Municipio: "+e.get(i).getMunicipio()+" Entidad: "+e.get(i).getEntidad());
        }
    }
}

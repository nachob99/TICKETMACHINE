public class EstacionDeTren
{
   private String ciudad;
   private TicketMachine maquina1;
   private TicketMachine maquina2;
   
   /**
    * Ya tengo mis 2 máquinas
    */
   public EstacionDeTren(String nombreCiudad,int precioMaquina1,int precioMaquina2)
   {
     ciudad = nombreCiudad;
     maquina1 = new TicketMachine(precioMaquina1);
     maquina2 = new TicketMachine(precioMaquina2);
    }
    
    /**
     * VeENTA BILLETES MAQUINA1
     */
    public void ventaBilleteMaquina1()
    {
        maquina1.insertMoney(500);
        maquina1.printTicket();
    }
    /**
     * VENTA BILLETES MAQUINA 2
     */
    public void ventaBilleteMaquina2()
    {
        maquina2.insertMoney(600);
        maquina2.printTicket();
    }
    /**
     * 
     * Devuelve el total del dinero recaudado por las máquinas de la estación
     */
    
    
    public int devolverTotal()
    {
        return maquina1.getTotal() + maquina2.getTotal();
    }
    
    /**
     * 
     * Devolver el total de dinero recaudado por la maquina 1 hasta el momento
     */
    public int devolverMaquina1()
    {
        return maquina1.getTotal();
    }
    
    /**
     * Devolver Total maquina 2
     */
    public int devolverMaquina2()
    {
        return maquina2.getTotal();
    }
    /**
     * Imprime por pantalla la cantidad recaudada por la maquina 1,por la 2 y el total ambas
     */
    public void cantidadTotal()
    {
       System.out.println ("Maquina1 " + maquina1.getTotal());
       System.out.println ("Maquina2 " + maquina2.getTotal());
       System.out.println ("Total de las maquinas " + (maquina1.getTotal() + maquina2.getTotal()));
    }
   
}
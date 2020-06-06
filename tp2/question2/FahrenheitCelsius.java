package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
      public static void main(String[] args){
       
        int fahrenheit = 0;
        float celsius = 0;
        for(int i = 0; i<args.length; i++){
            try{
                    fahrenheit = java.lang.Integer.parseInt(args[i]);
                    celsius = fahrenheitEnCelsius(fahrenheit);
                    System.out.println(fahrenheit + "\u00B0F -> " +((int)(celsius*10)/10.0) + "\u00B0C");
            }catch(NumberFormatException nfe){
                   System.out.println("error : " + nfe.getMessage());
              }
       
        }
       
     }

     /**Test fahrenheitEnCelsius.
     * 
     * plusieurs tests de bon fonctionnement.
     */
    public void test_fahrenheitEnCelsius() {
        assertEquals("    0 °F -> -17.7 °C ? ", -17.7, 
			question1.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
        assertEquals("  100 °F -> 37.7 °C ? ", 37.7, 
			question1.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
        assertEquals(" 2000 °F -> 1093.3 °C ?", 1093.3, 
			question1.FahrenheitCelsius.fahrenheitEnCelsius(2000), 0.1);
        assertEquals("   54 °F -> 12.2 °C ?", 12.2, 
			question1.FahrenheitCelsius.fahrenheitEnCelsius(54), 0.1);
        assertEquals("   37 °F -> 2.7 °C ?", 2.7, 
			question1.FahrenheitCelsius.fahrenheitEnCelsius(37), 0.1);
        assertEquals("   500 °F -> 260.0°C ?", 260.0, 
			question1.FahrenheitCelsius.fahrenheitEnCelsius(500), 0.1);
        assertEquals("   356 °F -> 180.0 °C ?", 180.0, 
			question1.FahrenheitCelsius.fahrenheitEnCelsius(356), 0.1);
        assertTrue("0°F < 100°F",question1.FahrenheitCelsius.fahrenheitEnCelsius(0)< 
			question1.FahrenheitCelsius.fahrenheitEnCelsius(100));
        
    }

}

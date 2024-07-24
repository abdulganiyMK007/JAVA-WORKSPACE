package chapter19;

public class CountrySec9 {
   private String name;
   private int population;
   private String continent;

   public static CountrySec9 parse(String line) {
      String[] fields = line.split("\\|");
      CountrySec9 country = new CountrySec9();
      country.name = fields[0];
      country.continent = fields[1];
      country.population = Integer.parseInt(fields[2]);
      return country;
   }

   public String getName() {
      return name;
   }

   public String getContinent() {
      return continent;
   }

   public int getPopulation() {
      return population;
   }

   public String toString() {
      return name + "|" + continent + "|" + population;
   }
}

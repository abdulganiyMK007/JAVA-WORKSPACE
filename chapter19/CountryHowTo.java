package chapter19;

public class CountryHowTo {
   private String name;
   private int population;
   private String continent;

   public static CountryHowTo parse(String line) {
      String[] fields = line.split("\\|");
      CountryHowTo country = new CountryHowTo();
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
      return name;
   }
}

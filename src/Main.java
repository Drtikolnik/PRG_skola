public class Main {
    public static void main(String[] args) {
        Skola malaSkola= new Skola("Malicka skola", "Klatovy", 3);

        System.out.println("Škola " +malaSkola.getNazevSkoly()+ " ve městě " +malaSkola.getMesto()+ " má počet tříd " +malaSkola.getPocetTrid());
        malaSkola.vypis();
    }
}
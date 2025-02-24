public class Zak {

    private String jmeno;
    private String prijmeni;
    private String email;

    public Zak(String jmeno, String prijmneni, String email) {
        this.jmeno = jmeno;
        this.prijmeni = prijmneni;
        this.email = email;
    }

    public String toString(){
        return "Jméno:" +jmeno+ ", Přijmení:" +prijmeni+ ", Email:" +email;
    }




}

public class Academico {
    protected String nombre;
    protected String ocupacion;
    protected int edad;
    protected String paper;

    public void comer() {
            System.out.println("Ñom Ñom comida casera");
        }
    public void dormir() {
            System.out.println("ZzZzZzZ");
        }
    public String hacerLoSuyo() { return "Aprender a ocupar Zoom y hacer cuarentena"; }

    public String publicarPaper() { return paper;}

}

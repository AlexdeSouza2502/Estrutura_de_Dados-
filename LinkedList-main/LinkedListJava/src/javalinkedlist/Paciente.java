
package javalinkedlist;
//import java.lang.Comparable;
public class Paciente implements Comparable<Paciente>{
    private String nomePet;
    private String nomeTutor;
    private int prioridade;
    private int tempo;

   

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    public int compareTo(Paciente outroPaciente){
      return this.getNomePet().
              compareTo(outroPaciente.getNomePet());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paciente outroPaciente = (Paciente) o;

        return this.nomePet != null ? (outroPaciente.nomePet).equals(this.nomePet) : outroPaciente.nomePet == null;
    }

    
     @Override
    public String toString(){
        return getNomeTutor() + " : " + getNomePet() +" : "+ getPrioridade() + " - " + getTempo() ;
    }// fim toString

    /**
     * @return the nomeTutor
     */
    public String getNomeTutor() {
        return nomeTutor;
    }

    /**
     * @param nomeTutor the nomeTutor to set
     */
    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    /**
     * @return the nomePet
     */
    public String getNomePet() {
        return nomePet;
    }

    /**
     * @param nomePet the nomePet to set
     */
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }
    
}

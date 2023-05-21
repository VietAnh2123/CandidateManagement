
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class TuyenSinh {
    private List<Candidate> candidates;

    public TuyenSinh() {
        this.candidates = new ArrayList<>();
    }
    
    public void addCandidate(Candidate candidate){
        this.candidates.add(candidate);
    }
    
    public void showInfor() {
        this.candidates.forEach(candidate -> System.out.println(candidate.toString()));
    }
    
    public Candidate searchById(String id){
        return this.candidates.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }
}

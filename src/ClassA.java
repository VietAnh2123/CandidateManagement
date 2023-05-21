/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class ClassA extends Candidate {
    public static final String monToan = "Toan";
    public static final String monLy = "Ly";
    public static final String monHoa = "Hoa";

    public ClassA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "Candidate A" + "\n" + 
                "ID: " + id + "\n" + 
                "Name: " + name + "\n" + 
                "Address: " + address + "\n" + 
                "Priority: " + priority;
    }
    
    
}

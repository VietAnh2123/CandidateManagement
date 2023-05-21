/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class ClassB extends Candidate {
    public static final String monToan = "Toan";
    public static final String monHoa = "Hoa";
    public static final String monSinh = "Sinh";

    public ClassB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }
    
    public String toString() {
        return "Candidate B" + "\n" + 
                "ID: " + id + "\n" + 
                "Name: " + name + "\n" + 
                "Address: " + address + "\n" + 
                "Priority: " + priority;
    }
}

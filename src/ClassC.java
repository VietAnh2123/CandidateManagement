/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class ClassC extends Candidate{
    public static final String monVan = "Van";
    public static final String monSu = "Su";
    public static final String monDia = "Dia";

    public ClassC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public String toString() {
        return "Candidate C" + "\n" + 
                "ID: " + id + "\n" + 
                "Name: " + name + "\n" + 
                "Address: " + address + "\n" + 
                "Priority: " + priority;
    }
}

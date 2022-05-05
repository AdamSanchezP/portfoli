package Bloque6.departamentos_empleados;

import java.util.Arrays;
import java.util.Scanner;

public class pr7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String telefon;
        pr_employees[] treballadors = new pr_employees[5];
        pr7_departaments[] departaments = new pr7_departaments[3];

        emplenaEmpleats(treballadors);
        emplenaDepartaments(departaments);

        // Cerca dades per departament
        System.out.println("Intro departament: ");
        String dep = in.nextLine();
        compDepartament(dep, departaments);
        
        cercaDadesDepartament(departaments, treballadors, dep);

        //Cambiar telefon
        System.out.println(" Introdueix el telefon ");
        telefon = in.nextLine();
        
        treballadors[0].telefonClass(telefon);
        

    }

    public static void cercaDadesDepartament(
            pr7_departaments[] deps,
            pr_employees[] emp,
            String dep) {
        int hores = 1;
        double sou = 1;
        for (int i = 0; i < deps.length; i++) {
            if (deps[i].getNom().equals(dep)) {
                hores = deps[i].getHores();
                sou = deps[i].getSou();
            }
            break;
        }
        int treballador = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartament().equals(dep)) {
                treballador++;
            }
        }

        System.out.println("Departament:" + dep);
        System.out.println("Trebaladors: " + treballador);
        System.out.println("Sous: " + (sou * treballador));
        System.out.println("Hores: " + (hores * treballador));

    }

    public static void emplenaEmpleats(pr_employees[] workers) {
        workers[0] = new pr_employees("Pepe", 23, "625458965", "Comptable");
        workers[1] = new pr_employees("Lluis", 25, "625458965", "Comptable");
        workers[2] = new pr_employees("Maria", 27, "626458965", "Direcció");
        workers[3] = new pr_employees("Julia", 23, "645458965", "Comptable");
        workers[4] = new pr_employees("José Luis", 43, "625458955", "Vendes");
    }

    public void  emplenaDepartaments(pr7_departaments[] departaments) {
        departaments[0] = new pr7_departaments("Comptable", 40, 1500);
        departaments[1] = new pr7_departaments("Direcció", 38, 1700);
        departaments[2] = new pr7_departaments("Vendes", 39, 1600);
    }
    
    public  void compDepartament(String dep, pr7_departaments[] departaments){
        if (dep.equals(departaments[0])){
            departaments[0].set
        }
            
    }

}

             


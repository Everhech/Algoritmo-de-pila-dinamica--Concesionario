package proyectopiladinamica;

import Message.Aviso;
import TAD.Pila;

import javax.swing.JOptionPane;

public class Control {

    public static void main(String[] args) {
        Pila ppalabras = new Pila();
        Pila auxiliar = new Pila();
        int opcion = 0;
        Object select;
        Aviso aviso= new Aviso();
        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        
                        "Menú de Opciones\n\n"
                        + "1. Insertar un coche\n"
                        + "2. Sacar un coche\n"
                        + "3. ¿El parqueadero está vacio?\n"
                        + "4. ¿Cual es el coche ingresado en el parqueadero?\n"
                        + "5. ¿Cuantos coches tiene la pila?\n"
                        + "6. Sacar coches del parqueadero\n"
                        + "7. Mostrar coches en el parqueadero\n"
                        + "8. Salir.\n\n"));
                
                switch (opcion) {
                    case 1:
                        select = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Porfavor ingresa un valor para el coche a guardar"));
                        ppalabras.Apilar(select);
                        break;
                        
                    case 2:
                        if(!ppalabras.PilaVacia()){
                            select = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingresa el valor del coche a eliminar"));
                            ppalabras=ppalabras.eliminarDinamico(ppalabras, auxiliar, select);
                            
                            JOptionPane.showMessageDialog(null, "Se ha sacado el coche llamado: "
                            + select);
                        }else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                        
                    case 3:
                        /*if(pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila NO vacia");
                        }
                        break;*/
                        
                    case 4:
                        if(!ppalabras.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El último coche ingresado es: "
                             );
                            ppalabras.MostrarCoches();
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                        
                    case 5:
                        //JOptionPane.showMessageDialog(null, "La pila contiene " + pila.TamanoPila() + " nodos.");
                        break;
                        
                    case 6:
                        /*if(!ppalabras.PilaVacia()){
                            ppalabras.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }*/
                        break;
                        
                    case 7:
                        ppalabras.MostrarCoches();
                        break;
                        
                    case 8:
                        opcion = 8;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                        break;
                }
                

            } catch (NumberFormatException e) {

            }
        } while (opcion != 8);       
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/** 
 * @author Daniela Batz 19214
 */


public class Main {
	public static void main(String[] args) {

        ArrayList<Association> Dicc = new ArrayList();
        File archivo = new File( "diccionario.txt" );
        BufferedReader Tx1;
        File texto = new File( "texto.txt" );
        BufferedReader Tx2;
        int c=0;
        String[] palabras=null;
        try {
            Tx2 = new BufferedReader( new FileReader( archivo ) );
            String linea1;
            linea1 = Tx2.readLine();
            palabras= linea1.split(" ");
            c=palabras.length;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
		Tx1 = new BufferedReader( new FileReader( archivo ) );
        String linea;
        linea = Tx1.readLine();       
            while(Tx1.ready()){
                linea = Tx1.readLine();
                String vector[] = linea.split(",");
                Association separ = new Association();
                separ.addAsociation( vector[0].substring(1), vector[1].substring(0,vector[1].length()-1));
                Dicc.add(separ);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        BinaryTree Diccionario = new BinaryTree();
        int co=Dicc.size();
        String[][] pe = new String[co][2];
        for (int x = 0; x <co ; x++){
            pe[x][0]=Dicc.get(x).getKey().toString();
            pe[x][1]=Dicc.get(x).getValor().toString();
        }
        
        /**
         * El arbol se maneja "in order"
         */
        Diccionario.inOrTree(Diccionario.root);
        String traduccion = "";
        boolean t=false;
        int p=0;
        for (int x =0; x <c; x++){
            for(int y =0; y<co;y++){
                if(palabras[x].equalsIgnoreCase(pe[y][0])){
                    p=y;
                    t=true;
                    break;
                }else{
                    t=false;
                }
            }
            if(t==true){
                traduccion=traduccion+pe[p][1]+" ";
            }else{
                traduccion=traduccion+palabras[x]+" ";
            }
         }
         System.out.println(traduccion);
    }
}
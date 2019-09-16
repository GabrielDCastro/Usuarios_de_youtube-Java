package javaapplication1;
public class javaapplication1{
    public static void main(String[] args){
    Video v[] = new Video[5];
    v[0] = new Video("Vídeo de gatinhos fofos");
        System.out.println(v[0].toString());
        
    Usuario u[] = new Usuario[2];
    u[0] = new Usuario("Gabriel", 24, "GabrielD");
        System.out.println(u[0].toString());
    }
}

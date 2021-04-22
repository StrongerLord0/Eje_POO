
package github;

public class GitHubb {
    public static void main(String args[]){
        String cabecera="\n\tPronóstico de clima\n";
        cabecera+="\tDia\t\tMañana\tNoche\tCondiciones\n";
        cabecera+="\t----\t\t-----\t-----\t-------\n";
        String pronostico="\tDomingo\t\t25C\t33C\tSoleado\n";
        pronostico+="\tLunes\t\t18C\t19C\tNublado\n";
        pronostico+="\tMartes\t\t40C\t29C\tCaluroso\n";
        System.out.print(cabecera+pronostico);
    }
}

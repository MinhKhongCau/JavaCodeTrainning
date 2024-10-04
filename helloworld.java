import java.util.Scanner;
public class helloworld{
    /**
     * Đây là chương trình helloworld
     * @param MSSV N22DCCN053
     * @since 2024-08-20
     */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String in = sc.nextLine();
      String[] sp = in.split("[/]");
        if (sp[0].length() == 1) {
            sp[0] = "0" + sp[0];
        }
        if (sp[1].length() == 1) {
            sp[1] = "0" + sp[1];
        }
      System.out.println(sp[0]+"/"+sp[1]+"/"+sp[2]);
    sc.close();
  }

}
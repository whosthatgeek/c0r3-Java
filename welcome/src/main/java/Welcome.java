public class Welcome {

  public static void main(@org.jetbrains.annotations.NotNull String[] args) {
    var welcome = args[0];
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < welcome.length(); i++) sb.append("=");
    var deco = sb.toString();
    System.out.println(deco);
    System.out.println(welcome);
    System.out.println(deco);
  }
}

public class Exercise05 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Hello");
        System.out.println("Après append('Hello') : " + sb.toString());
        
        sb.append(" World");
        System.out.println("Après append(' World') : " + sb.toString());
        
        sb.insert(5, ",");
        System.out.println("Après insert(5, ',') : " + sb.toString());
        
        sb.replace(0, 5, "Hi");
        System.out.println("Après replace(0, 5, 'Hi') : " + sb.toString());
        
        sb.delete(2, 3);
        System.out.println("Après delete(2, 3) : " + sb.toString());
        
        System.out.println("Longueur : " + sb.length());
        
        String finale = sb.toString();
        System.out.println("String finale : " + finale);
    }
}


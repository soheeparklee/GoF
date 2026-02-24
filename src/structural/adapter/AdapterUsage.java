package structural.adapter;

import java.util.*;

public class AdapterUsage {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(list);
        ArrayList<String> listEnum = Collections.list(enumeration);
    }
}

//        try {
//            InputStream is = new FileInputStream("input.txt");
//            InputStreamReader isr = new InputStreamReader(is);
//            BufferedReader reader = new BufferedReader(isr){
//                while(reader.ready())
//                {
//                    System.out.println(reader.readLine());
//                }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
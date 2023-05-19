import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String>officeTool=new HashMap<>();//так объявляется хэш таблица,в ней хранится ПАРА, нельзя
        // найти ключ по значению, только наоборот
        officeTool.put("India","1234567902");//добавляем в хэш таблицы значения через .put
        officeTool.put("China","3215433414");
        String tool = officeTool.get("China");//получаем значение по хэш-ключу
        System.out.println("Hello world!"+officeTool+" maybe "+tool);
        officeTool.clear();
        HashMap<String, Integer>officeTools=new HashMap<>();
        officeTools.put("N",1);
        officeTools.put("S", 2);
        officeTools.put("D",3);
        for (Integer ent : officeTools.values()) {
        if (ent.equals(3));
        System.out.println(ent);
        }
        for (String enter : officeTools.keySet()){
        System.out.println(enter);
        }// просто получаем все хэш ключи через цикл for
        System.out.println(officeTools.containsKey("N"));//проверка на наличие по ключу, boolean
        System.out.println(officeTools.containsValue(2));//проверка на наличие по значению, boolean
        System.out.println(officeTools.containsValue(2));
        System.out.println("bye");
        System.out.println("baby");
    }
}
package study;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Study {
	
    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";
    
    public static void main(String[] args) {
    	List<String> shohinList = new LinkedList<String>();
		shohinList.add(SHOP_SHOHIN_00);
		shohinList.add(SHOP_SHOHIN_01);
		shohinList.add(SHOP_SHOHIN_02);
		shohinList.add(SHOP_SHOHIN_03);
		
    	//shohInList.get(1)に180を対応づける
    	
    	 LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
         shopMap.put(shohinList.get(0), 125);
         shopMap.put(shohinList.get(1), 180);
         shopMap.put(shohinList.get(2), 350);
         shopMap.put(shohinList.get(3), 100);
         
         for (Map.Entry<String , Integer> entry : shopMap.entrySet()) {
        	 System.out.println(entry.getKey() + "=" + entry.getValue() + "円になります！");
         }
         
         
	}

}

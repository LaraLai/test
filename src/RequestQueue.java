
import java.util.*;


public class RequestQueue {

	public static void main(String[] args) {
        Queue<String> requests = new LinkedList<String>();
        offerRequestTo(requests);
        process(requests);
    }

    static void offerRequestTo(Queue<String> requests) {
        // 模擬將請求加入佇列
        for (int i = 1; i < 6; i++) {
        	Formatter format = new Formatter() ; 
            requests.offer("處理資料:"+format.format("%f", Math.random()));
        }
    }
    // 處理佇列中的請求
    static void process(Queue<String> requests) {
        while(requests.peek() != null) {
        	String s = requests.poll();
           System.out.println(s);
           System.out.println(s);
        }
    }

}

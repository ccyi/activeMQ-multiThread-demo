import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
	public static void main(String[] args) {
		ExecutorService pool = null;
		try {
			pool=Executors.newFixedThreadPool(5);
			MessageAdapter bJTaxi = new BJTaxi();
			pool.submit(bJTaxi);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pool!=null){
				pool.shutdown();
			}
		}
	}

}

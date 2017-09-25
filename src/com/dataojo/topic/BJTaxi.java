import javax.jms.JMSException;
import javax.swing.plaf.basic.BasicOptionPaneUI;

import com.dataojo.common.DataProducer;
import com.dataojo.common.MessageAdapter;
import com.dataojo.entity.Message;


public class BJTaxi extends MessageAdapter {

	protected BJTaxi() throws JMSException {
		super("bjTaxiTopic", "v2");
	}

	@Override
	public void run() {
		try {
			System.out.println("启动成功");
			this.start();
		} catch (Exception e) {
			System.out.println("启动失败");
			e.printStackTrace();

		}

	}

	@Override
	public void start() throws Exception {
		DataProducer dataProducer = this.getDataProducer();
		
		// 操作

		dateProduce.sendMessage(ASDF);
		

	}
}

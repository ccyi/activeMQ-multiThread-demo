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
			System.out.println("�����ɹ�");
			this.start();
		} catch (Exception e) {
			System.out.println("����ʧ��");
			e.printStackTrace();

		}

	}

	@Override
	public void start() throws Exception {
		DataProducer dataProducer = this.getDataProducer();
		
		// ����

		dateProduce.sendMessage(ASDF);
		

	}
}

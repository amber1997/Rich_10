package bigRich_10shi;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;

 class ShowHelpInformation extends JFrame{
	    //private String rules
	    ShowHelpInformation() {
		this.setSize(600, 600);
		this.setTitle("��Ϸ����˵��");
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		//��ʾ������Ϣ�����
		JPanel jPanelText=new JPanel();
		jPanelText.setLayout(new BorderLayout());
		//��ʾ������Ϣ���ı���
		JTextArea helpInformation=new JTextArea(20,1);
		JScrollPane jtxt=new JScrollPane(helpInformation);
		String Rule_1="һ��  S������㣬T��������ݣ�G������Ʒ�ݣ�H����ҽԺ��P���������$������;\n";
		String Rule_2="����  0����յأ��ض�1���������һ�У�ÿ��200Ԫ���ض�2�����Ҷ˵�һ�У�ÿ��500Ԫ��\n          �ض�3���������һ�У�ÿ��300Ԫ;\n";
		String Rule_3="����  H��ҽԺ����ұ�ը�˺󣬽����͵�ҽԺҽ��3�죨�ֿ�3�Σ�   \n";
		String Rule_4="�ġ� S����أ�������������Ϊ20��80��100��40��80��60�� \n";
		String Rule_5="�塢 �ʽ𣺿����ڹ��ء��Ƿ���֧����·��\n";
		String Rule_6="���� ���������ڹ�����ߣ��������ʱ���Ի�ȡ����\n";
		String Rule_7="�ߡ� ���ߣ�����ʹ��ը��\n";
		String Rule_8="�ˡ� ը�������Խ�ը�����õ��뵱ǰλ��ǰ��10���ľ��룬\n        ��һ���ͣ����λ�ý���ը�ˣ�����ҽԺ��סԺ����\n";
		String Rule_9="�š� ��Ʒ������2000Ԫ�� ������;200��\n";
		String Rule_10="ʮ�� ���ͣ�����Լ��Ŀյػ�¥������ϵͳ��ʾ�Ƿ�������\n        �������ʽ��㹻ʱ�������ɹ������ݷ�������ÿ��һ���ķ���ͬ����յصķ���\n";
		String Rule_11="ʮһ��  ���ͣ����������ҵķ�����ʱ������Ҫ֧����·�ѣ�����Ϊ�ô�������ֵ��1/2\n";
		String Rule_12="ʮ����  ����ʽ����0ʱ�������Ʋ��������ռ�е����ع黹ϵͳ����ʼ��Ϊ�յأ��ɹ�����������¹���\n";
		String Rule_13="ʮ����  ֻʣһ�����ʱ����Ϸ����������һ�ʤ\n";
		//////////////////////////////////////////////////////////
		helpInformation.setFont(new Font(null, 10, 15));
		helpInformation.setText(Rule_1+Rule_2+Rule_3+Rule_4+Rule_5+Rule_6+Rule_7+Rule_8+Rule_9+Rule_10+Rule_11+Rule_12+Rule_13);
		helpInformation.setEditable(false);
		jPanelText.add(jtxt,BorderLayout.CENTER);
		this.add(jPanelText,BorderLayout.CENTER);
		
	}
	

}

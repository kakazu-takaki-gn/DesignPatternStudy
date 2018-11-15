package kopipe.Builder.A4;

public class TextBuilder extends Builder {
    private String buffer = "";                                 // ���Υե�����ɤ�ʸ����ۤ��Ƥ���
    public void makeTitle(String title) {                       // �ץ졼��ƥ����ȤǤΥ����ȥ�
        buffer += "==============================\n";               // ������
        buffer += "��" + title + "��\n";                            // �ء٤Ĥ��Υ����ȥ�
        buffer += "\n";                                             // ����
    }
    public void makeString(String str) {                        // �ץ졼��ƥ����ȤǤ�ʸ����
        buffer += '��' + str + "\n";                                // ���Ĥ���ʸ����
        buffer += "\n";                                             // ����
    }
    public void makeItems(String[] items) {                     // �ץ졼��ƥ����ȤǤβվ��
        for (int i = 0; i < items.length; i++) {
            buffer += "����" + items[i] + "\n";                     // ���Ĥ��ι���
        }
        buffer += "\n";                                             // ����
    }
    public void close() {                                       // ʸ��δ���
        buffer += "==============================\n";               // ������
    }
    public String getResult() {                                 // ��������ʸ��
        return buffer;
    }
}

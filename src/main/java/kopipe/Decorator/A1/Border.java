package kopipe.Decorator.A1;

public abstract class Border extends Display {
    protected Display display;          // ���ξ����Ȥ������Ǥ������ȡפ�ؤ�
    protected Border(Display display) { // ���󥹥����������ˡ���ȡפ�����ǻ���
        this.display = display;
    }
}

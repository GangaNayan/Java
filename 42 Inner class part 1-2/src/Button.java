
public class Button {  // M3
    private String title;
    private OnClickListener onClickLister;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickLister = onClickListener;
    }

    public void on1Click() {

        this.onClickLister.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);
        // we do not describe any method here
    }

}

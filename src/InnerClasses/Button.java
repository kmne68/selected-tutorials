/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClasses;

/**
 *
 * @author Keith
 */
public class Button {
    
    private String title;
    private OnClickListener onClickListener;
    
    public Button(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    
    public void onClick() {
        this.onClickListener.onClick(this.title);
    }
    
    public interface OnClickListener {
        public void onClick(String title);
    }
}



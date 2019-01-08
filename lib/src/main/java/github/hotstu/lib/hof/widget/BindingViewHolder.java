package github.hotstu.lib.hof.widget;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import github.hotstu.lib.hof.BR;


public class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    private T binding;
    private Object item;

    public BindingViewHolder(T binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public T getBinding() {
        return  binding;
    }

    public void setItem( Object value) {
        this.item = value;
        binding.setVariable(BR.item, value);
        binding.executePendingBindings();
    }

    public Object getItem() {
        return item;
    }
}
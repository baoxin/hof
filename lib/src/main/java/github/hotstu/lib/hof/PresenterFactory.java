package github.hotstu.lib.hof;

import androidx.recyclerview.widget.RecyclerView;

/**
 * @author hglf <a href="https://github.com/hotstu">hglf</a>
 * @desc
 * @since 2019/1/8
 */
public interface PresenterFactory {
    Presenter create(RecyclerView rvleft, RecyclerView rvRight);
}
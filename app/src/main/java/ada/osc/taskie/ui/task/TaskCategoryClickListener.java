package ada.osc.taskie.ui.task;

import android.view.View;

import ada.osc.taskie.model.Category;

/**
 * Created by avukelic on 30-Apr-18.
 */
public interface TaskCategoryClickListener {
    void onClick(Category category, int visibility);
}
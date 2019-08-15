package nn.vv.ss.testaap;


import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class TestExerciser implements Exerciser {

    int position;
    View convertView;
    ViewGroup parent;
    Context context;
    Activity activity;


    TestExerciser (Activity activity) {
        this.activity = activity;
        this.context = context;
        this.convertView = convertView;
        this.parent = parent;
    }


    @Override
    public void exercise() {

        //ViewHolderSample viewholder = new ViewHolderSample();
        ViewHolderSample.Adapter3 holder = new ViewHolderSample.Adapter3(context);
        holder.getView(position, convertView, parent);
        //View gView1 = viewholder.getView(position, convertView, parent);
        //viewholder.getView(position, convertView, parent);
        //lapTimesView.setAdapter(viewholder);
        //lapTimesView.setAdapter(lapTimesAdapter);
    }
}
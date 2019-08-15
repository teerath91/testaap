package nn.vv.ss.testaap;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public abstract class ViewHolderSample extends BaseAdapter {

/*    Context context;
    public ViewHolderSample(Context context) {
        this.context = context;
    }*/

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    LayoutInflater mInflater;
    Context context;

    public static class Adapter3 extends ViewHolderSample {
        public Adapter3(Context context) {
            context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //LayoutInflater infalInflater = (LayoutInflater) this.context
            //      .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = LayoutInflater.from(context).inflate(R.layout.your_layout, null);
            //convertView = infalInflater.inflate(R.layout.your_layout, null);

            TextView text = (TextView) convertView.findViewById(R.id.text);
            text.setText("Position " + position);

            return convertView;
        }
    }

/*    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.your_layout, null);

        TextView text = (TextView) convertView.findViewById(R.id.text);
        text.setText("Position " + position);

        return convertView;
    }*/

    private static class R {
        public static class layout {
            public static final int your_layout = 2;
        }
        public static class id {
            public static final int text = 2;
        }
    }
}

package sceneofframe.vintagebokeh.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Axebuddy on 8/16/15 AD.
 */
public class MyAdapter extends BaseAdapter {

    // Explicit
    private Context objContext;
    private String[] titleStrings;
    private int[] iconAnInt;

    //Constructor สร้าง method กด cmd+N


    public MyAdapter(Context objContext, String[] titleStrings, int[] iconAnInt) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.iconAnInt = iconAnInt;
    } // Constructor


    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView = objLayoutInflater.inflate(R.layout.list_traffic, parent, false);

        //Show Icon
        ImageView iconImageView = (ImageView) objView.findViewById(R.id.imgIcon);
        iconImageView.setImageResource(iconAnInt[position]);

        //Show Title
        TextView titleTextView = (TextView) objView.findViewById(R.id.txtListShow);
        // ผิด titleTextView.setText(iconAnInt[position]);
        titleTextView.setText(titleStrings[position]);

        return objView;

    }  // getView

}  // Main Class



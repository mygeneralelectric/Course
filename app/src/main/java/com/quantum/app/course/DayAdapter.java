package com.quantum.app.course;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hua on 2016/1/15.
 */
public class DayAdapter extends ArrayAdapter<String> {

    private int itemViewId;

    public DayAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        itemViewId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String courseMsg = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(itemViewId, null);
        RelativeLayout courseListItem = (RelativeLayout) view.findViewById(R.id.course_list_item);
        TextView courseNumber = (TextView) view.findViewById(R.id.course_number);
        TextView coursePlace = (TextView) view.findViewById(R.id.course_place);
        TextView courseName = (TextView) view.findViewById(R.id.course_name);
        courseListItem.getBackground().setAlpha(100);
        courseNumber.getBackground().setAlpha(100);
        int num = position + 1;
        String number = "" + num;
        courseNumber.setText(number);
        coursePlace.setText(courseMsg.split("@")[0]);
        courseName.setText(courseMsg.split("@")[1]);
        return view;
    }

}

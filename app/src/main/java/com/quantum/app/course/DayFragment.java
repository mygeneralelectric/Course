package com.quantum.app.course;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hua on 2016/1/15.
 */
public class DayFragment extends Fragment {

    public DayFragment() {

    }

    private List<String> courseList = new ArrayList<String>();

    private ListView course;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_day, container, false);

        initCourseMsg();
        DayAdapter adapter = new DayAdapter(getActivity(), R.layout.day_list_item, courseList);
        course = (ListView) view.findViewById(R.id.day_list);
        course.setAdapter(adapter);

        return view;
    }

    private void initCourseMsg() {

        String courseMsg1 = "马兰芳教学楼101" + "@" + "IT项目管理";
        courseList.add(courseMsg1);

        String courseMsg2 = "马兰芳教学楼101" + "@" + "IT项目管理";
        courseList.add(courseMsg2);

        String courseMsg3 = "马兰芳教学楼101" + "@" + "IT项目管理";
        courseList.add(courseMsg3);

        String courseMsg4 = "马兰芳教学楼101" + "@" + "IT项目管理";
        courseList.add(courseMsg4);

        String courseMsg5 = "马兰芳教学楼101" + "@" + "IT项目管理";
        courseList.add(courseMsg5);

    }

}

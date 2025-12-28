package com.mybill.frag_record;

import androidx.fragment.app.Fragment;
import com.mybill.R;
import com.mybill.db.DBManager;
import com.mybill.db.TypeBean;
import com.mybill.db.TypeBean;

import java.util.List;
/**
 * A simple {@link Fragment} subclass.
 */
public class OutFragment extends BaseRecordFragment {


    // 重写
    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        //获取数据库当中的数据源
        List<TypeBean> outlist = DBManager.getTypeList(0);
        typeList.addAll(outlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("其他");
        typeIv.setImageResource(R.mipmap.ic_qita_fs);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(0);
        DBManager.insertItemToAccounttb(accountBean);
    }
}
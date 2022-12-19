package com.mgnggg.study_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.mgnggg.study_servlets.beans.MemberBean;

public class DatasInfo {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "찬희");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DatasInfo datasInfo = new DatasInfo();
        HashMap<String, String> searchForm = datasInfo.getSearchFormData();
        ArrayList<String> tablesListWithString = datasInfo.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        bundlesData.put("dataWithMemberBean", datasInfo.getDataWithMemberBean());
        bundlesData.put("dataListWithMemberBean", datasInfo.getDataListWithMemberBean());
        return bundlesData;
    }

    
        public MemberBean getDataWithMemberBean(){
       MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");

        return memberBean;
    }

    public  ArrayList<MemberBean> getDataListWithMemberBean() {
        ArrayList<MemberBean> membersList = new ArrayList<>();

        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        membersList.add(memberBean);

        MemberBean memberBean2 = new MemberBean();
        memberBean2.setFirstName("Jacob");
        memberBean2.setSecondName("Thornton");
        memberBean2.setHandleName("@fat");
        membersList.add(memberBean2);

        MemberBean memberBean3 = new MemberBean();
        memberBean3.setFirstName("Larry");
        memberBean3.setSecondName("Bird");
        memberBean3.setHandleName("@twiiter");
        membersList.add(memberBean3);

        return membersList;
    }
}

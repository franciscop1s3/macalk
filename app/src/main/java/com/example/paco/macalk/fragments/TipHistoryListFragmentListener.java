package com.example.paco.macalk.fragments;

import com.example.paco.macalk.models.TipRecord;
/**
 * Created by paco on 11/11/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}

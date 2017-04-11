package com.example.cis.mazeminotaurs;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by My PC on 4/10/2017.
 */

public class LoadCharacterFragment extends ListFragment {
    private static final String TAG = "Family List Fragment";
    private CharacterList mCharacterList;

    public LoadCharacterFragment(){
        super();
        mCharacterList = CharacterList.get();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        /*FamilyMember newMember = new Guardian("CL4P","TP");
        mFamily.addFamilyMember(newMember);
        FamilyMemberAdapter adapter = new FamilyMemberAdapter(mFamily.getFamily());
        setListAdapter(adapter);*/
        mCharacterList.addCharacter(new Character());
        mCharacterList.addCharacter(new Character());
        mCharacterList.addCharacter(new Character());
        CharacterListAdapter adapter = new CharacterListAdapter(mCharacterList.getList());
        setListAdapter(adapter);
    }

    private class CharacterListAdapter extends ArrayAdapter<Character> {
        public CharacterListAdapter(ArrayList<Character> list) {
            super(getActivity(), 0, list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_character, null);
            }

            Character character = getItem(position);

            TextView nameTextView =
                    (TextView)convertView
                            .findViewById(R.id.character_list_item_nameTextView);
            nameTextView.setText(character.get());

            return convertView;
        }
    }
}

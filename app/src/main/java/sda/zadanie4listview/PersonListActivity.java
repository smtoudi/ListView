package sda.zadanie4listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.List;

public class PersonList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_list);

        ListView listView = (ListView) findViewById(R.id.person_list);
        PersonProvider personProvider = new PersonProvider();

        PersonListAdapter adapter = new PersonListAdapter(personProvider.getpersons());
       listView.setAdapter(adapter);
    }

    class PersonListAdapter extends BaseAdapter {

        private List<Person> person;

        public PersonListAdapter (List<Person> person) {
            this.person = person;
        }


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}

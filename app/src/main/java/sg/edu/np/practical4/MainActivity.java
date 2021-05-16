package sg.edu.np.practical4;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User u1 = new User("Name 162666887", "Description 838837177", 1, true);
        userList.add(u1);

        User u2 = new User("Name 188447711","Description 18838134",2,false);
        userList.add(u2);

        User u3 = new User("Name 677329392","Description 59698848",3,false);
        userList.add(u3);

        User u4 = new User("Name 959282888","Description 145772994",4,true);
        userList.add(u4);

        User u5 = new User("Name 472742667","Description 245675773",5,false);
        userList.add(u5);

        User u6 = new User("Name 834888883","Description 143424564",6,false);
        userList.add(u6);

        User u7 = new User("Name 005487472","Description 424556576",7,false);
        userList.add(u7);

        User u8 = new User("Name 677452435","Description 132244456",8,true);
        userList.add(u8);

        User u9 = new User("Name 858747752","Description 434356756",9,false);
        userList.add(u9);

        User u10 = new User("Name 77137137","Description 773773993",10,true);
        userList.add(u10);

        User u11 = new User("Name 55656523", "Description 245456562", 11, true);
        userList.add(u1);

        User u12 = new User("Name 246667676","Description 56567676",12,false);
        userList.add(u2);

        User u13 = new User("Name 45466292","Description 45635676",13,false);
        userList.add(u3);

        User u14 = new User("Name 456678798","Description 23455565",14,true);
        userList.add(u4);

        User u15 = new User("Name 12343567","Description 12233232",15,false);
        userList.add(u5);

        User u16 = new User("Name 38288283","Description 994723772",16,false);
        userList.add(u6);

        User u17 = new User("Name 48858992","Description 323242442",17,false);
        userList.add(u7);

        User u18 = new User("Name 96050388","Description 132324456",18,true);
        userList.add(u8);

        User u19 = new User("Name 58488999","Description 44455888",19,false);
        userList.add(u9);

        User u20 = new User("Name 758488923","Description 424242323",20,true);
        userList.add(u20);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        Adaptor mAdaptor = new Adaptor(userList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdaptor);

    }

}
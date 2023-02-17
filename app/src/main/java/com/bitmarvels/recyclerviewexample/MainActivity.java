package com.bitmarvels.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerview=findViewById(R.id.recyclerContact);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.image_a, "Student001", "1000000001"));
        arrContacts.add(new ContactModel(R.drawable.image_b, "Student002", "1000000002"));
        arrContacts.add(new ContactModel(R.drawable.image_c, "Student003", "1000000003"));
        arrContacts.add(new ContactModel(R.drawable.image_d, "Student004", "1000000004"));
        arrContacts.add(new ContactModel(R.drawable.image_e, "Student005", "1000000005"));
        arrContacts.add(new ContactModel(R.drawable.image_f, "Student006", "1000000006"));
        arrContacts.add(new ContactModel(R.drawable.image_g, "Student007", "1000000007"));
        arrContacts.add(new ContactModel(R.drawable.image_h, "Student008", "1000000008"));
        arrContacts.add(new ContactModel(R.drawable.image_i, "Student009", "1000000009"));
        arrContacts.add(new ContactModel(R.drawable.image_j, "Student010", "1000000010"));
        arrContacts.add(new ContactModel(R.drawable.image_k, "Student011", "1000000011"));
        arrContacts.add(new ContactModel(R.drawable.image_l, "Student012", "1000000012"));
        arrContacts.add(new ContactModel(R.drawable.image_m, "Student013", "1000000013"));
        arrContacts.add(new ContactModel(R.drawable.image_n, "Student014", "1000000014"));
        arrContacts.add(new ContactModel(R.drawable.image_o, "Student015", "1000000015"));
        arrContacts.add(new ContactModel(R.drawable.image_p, "Student016", "1000000016"));
        arrContacts.add(new ContactModel(R.drawable.image_q, "Student017", "1000000017"));
        arrContacts.add(new ContactModel(R.drawable.image_r, "Student018", "1000000018"));
        arrContacts.add(new ContactModel(R.drawable.image_s, "Student019", "1000000019"));
        arrContacts.add(new ContactModel(R.drawable.image_t, "Student020", "1000000020"));
        arrContacts.add(new ContactModel(R.drawable.image_u, "Student021", "1000000021"));
        arrContacts.add(new ContactModel(R.drawable.image_v, "Student022", "1000000022"));
        arrContacts.add(new ContactModel(R.drawable.image_w, "Student023", "1000000023"));
        arrContacts.add(new ContactModel(R.drawable.image_x, "Student024", "1000000024"));
        arrContacts.add(new ContactModel(R.drawable.image_y, "Student025", "1000000025"));
        arrContacts.add(new ContactModel(R.drawable.image_z, "Student026", "1000000026"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter( this, arrContacts );
        recyclerview.setAdapter(adapter);

    }
}
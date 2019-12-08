package com.recycleview.topic5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("OMEGALUL","9898989898",R.drawable.omegalul));
        contactsList.add(new Contacts("PepeHands","123123123",R.drawable.pepehands));
        contactsList.add(new Contacts("Sombra","9932489889",R.drawable.sombra));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

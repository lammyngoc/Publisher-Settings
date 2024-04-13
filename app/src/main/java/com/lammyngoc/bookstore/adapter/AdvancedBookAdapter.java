package com.lammyngoc.bookstore.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.lammyngoc.bookstore.R;
import com.lammyngoc.bookstore.model.Book;

public class AdvancedBookAdapter extends ArrayAdapter<Book> {
    Activity context;
    int resource;
    public AdvancedBookAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context=context;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // nhân bản giao diện
        View view=context.getLayoutInflater().inflate(resource,null);
        // truy xuất từng view trong giao diện
        TextView txtBookId=view.findViewById(R.id.txtBookId);
        TextView txtBookName=view.findViewById(R.id.txtBookName);
        TextView txtUnitPrice=view.findViewById(R.id.txtUnitPrice);

        ImageView imgBook=view.findViewById(R.id.imgBook);

        // lấy thông tin tại vị trí mà nó nhân bản
        Book book=getItem(position);
        // hiển thị view đã laays
        txtBookId.setText(book.getBookId());
        txtBookName.setText(book.getBookName());
        txtUnitPrice.setText(book.getUnitPrice()+"");

        imgBook.setImageResource(book.getImageId());

        return view;
    }
}

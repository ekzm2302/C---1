package com.example.and11_allview.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

// 2. 밑에서 만든 (ViewHolder)를 이용해서 RecyclerViewAdapter를 상속 받는다.
// (BaseAdapter 아님 ) RecyclerView.Adapter<RecvAdapter.PcjViewHolder> 내가 만든 클래스를 상속
public class RecvAdapter extends RecyclerView.Adapter<RecvAdapter.PcjViewHolder>{
    // ※ LayoutInflater : 어댑터가 붙일수있는 공간을 마련, 직접 붙이는 처리를 하기위한 객체 ※
    LayoutInflater inflater;

    public RecvAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }


    //3. 우리가 만들어놓은 ViewHolder를 실제로 만들고 return 해주는 부분
    // ViewHolder == 몇개의 위젯이 들어있는지 OS가 판단 x, 우리가 커스텀해서 사용함
    // 어떤 아이템에는 이미지뷰가 3개, 어떤 아이템에는 텍스트뷰가 3개로 다를수가있음.
    // BaseAdapter (getView 메소드)  <===> onCreateViewHolder
    @NonNull
    @Override
    public PcjViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_gridf_gridv, parent, false);

        PcjViewHolder viewHolder = new PcjViewHolder(v);
        return viewHolder;
    }


    // 5. 데이터가 있다면 position holder에 담아져있는 (칸) 위젯과 연결 부분 ( Binding )
    @Override
    public void onBindViewHolder(@NonNull PcjViewHolder h, int i) {
        h.btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(h.imgv1.getVisibility() == View.VISIBLE ){
                    h.imgv1.setVisibility(View.GONE);
                    h.imgv2.setVisibility(View.VISIBLE);
                }else {
                    h.imgv2.setVisibility(View.GONE);
                    h.imgv1.setVisibility(View.VISIBLE);

                }
            }
        });
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    // 4. 아이템의 갯수를 지정하는 부분
    @Override
    public int getItemCount() {
        return 30;
    }

    // 일반 ==> ViewHolder타입임.
    // 1. ViewHolder타입을 상속받은 innerClass ViewHolder를 만든다.
    // ( 이름은 관례상 ViewHolder )
    public class PcjViewHolder extends RecyclerView.ViewHolder {
    ImageView imgv1, imgv2;
    Button btn_change;
        public PcjViewHolder(@NonNull View v) {
            super(v);
            imgv1 = v.findViewById(R.id.imgv1);
            imgv2 = v.findViewById(R.id.imgv2);
            btn_change = v.findViewById(R.id.btn_change);
            // 위젯들을 찾아서 초기화하는 기능을 했음. v.find ...
        }
    }

}

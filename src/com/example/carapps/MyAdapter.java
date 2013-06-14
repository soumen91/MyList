package com.example.carapps;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyAdapter  extends ArrayAdapter<UserBean>{
	private Context mCtx;
	private ArrayList<UserBean> mItems = new ArrayList<UserBean>();
	private ViewHolder mHolder;
	
	

	public MyAdapter(Context context, int textViewResourceId,	ArrayList<UserBean> items) {
		super(context, textViewResourceId, items);
		this.mCtx = context;
		this.mItems = items;
		
	
	}		  

	@Override
	public int getCount() {
		return mItems.size();
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}


	@Override
	public View getView( final int position,  View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) mCtx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.row, null);

			mHolder = new ViewHolder();
			v.setTag(mHolder);
			
			mHolder.mName = (TextView)v.findViewById(R.id.txtname);
			mHolder.mAddress = (TextView)v.findViewById(R.id.bttnaddress);
			
			
		}
		else {
			mHolder =  (ViewHolder) v.getTag();
		}			
		
		final UserBean mRoomLightBean = mItems.get(position);
		
		if(mRoomLightBean != null){
			mHolder.mName.setText(mRoomLightBean.getName());
			mHolder.mAddress.setText(mRoomLightBean.getAddress());
			
		}		
		return v;
	}

	

	class ViewHolder {
	
		public TextView mName;
		public TextView mAddress;
		
	}
	
	
}
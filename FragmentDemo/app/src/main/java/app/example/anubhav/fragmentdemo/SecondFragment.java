package app.example.anubhav.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anubhav on 04/11/16.
 */
public class SecondFragment extends Fragment
{
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
  {
      return inflater.inflate(R.layout.fragment_second,container,false);
  }
}

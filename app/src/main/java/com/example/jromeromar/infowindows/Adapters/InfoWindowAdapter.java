package com.example.jromeromar.infowindows.Adapters;

import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private Context context;
    private View contentView;
    private SimpleDateFormat dateFormatFrom,dateFormatTo;
   // private SessionManager manager;
    public InfoWindowAdapter(View contentView, Context context){
        this.contentView=contentView;
        this.context=context;
       // this.dateFormatFrom=new SimpleDateFormat(Constants.DATE_FORMAT_ISO8601);
       // this.dateFormatTo=new SimpleDateFormat(Constants.DATE_FORMAT_INFO_WINDOW);
       // this.manager=new SessionManager(context);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
     //   Sismo sismo = new Gson().fromJson(marker.getSnippet(), Sismo.class);
     //   TextView tvMagnitud = (TextView) contentView.findViewById(R.id.tv_magnitud);
     //   TextView tvUbicacion = (TextView) contentView.findViewById(R.id.tvUbicacion);
     //   TextView tvPeligroDescripcion = (TextView) contentView.findViewById(R.id.tvPeligroDescripcion);
     //   TextView tvFecha=(TextView)contentView.findViewById(R.id.tvFecha);
     //   TextView tvDistancia=(TextView)contentView.findViewById(R.id.tvDistancia);
     //   tvMagnitud.setText(String.valueOf(sismo.getMagnitud()));
     //   tvMagnitud.setTextColor(Utils.getColorByMagnitud(this.context,sismo.getMagnitud()));
     //   tvUbicacion.setText(sismo.getDetalles());
     //   tvPeligroDescripcion.setText(Utils.getDescripcionByMagnitud(this.context,sismo.getMagnitud()));
     //   tvFecha.setText(getFormatoFecha(sismo.getFecha()));
     //   if(manager.getString(Constants.CURRENT_LNG)!=null && manager.getString(Constants.CURRENT_LAT)!=null) {
     //       double currentLng= Double.parseDouble(manager.getString(Constants.CURRENT_LNG));
      //      double currentLat= Double.parseDouble(manager.getString(Constants.CURRENT_LAT));
      //      int kilometrosDistancia = Utils.getDistanciaTotal(
      //             Double.parseDouble(sismo.getLaltitud()),
       //            Double.parseDouble(sismo.getLongitud()),currentLat,currentLng);
        //    if(tvDistancia!=null) {
        //        tvDistancia.setText("A ".concat(String.valueOf(kilometrosDistancia)).concat(" km de aquí"));
        //    }
      //  }

        return  contentView;
    }

    public String getFormatoFecha(String fecha){
        String result=fecha;
        try {
            Date selectedDate=dateFormatFrom.parse(fecha);
            result=dateFormatTo.format(selectedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}

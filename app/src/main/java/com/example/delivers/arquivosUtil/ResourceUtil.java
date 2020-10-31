package com.example.delivers.arquivosUtil;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ResourceUtil {
    public static Drawable criaDrawable(Context contexto, String drawableEmTexto ){
        Resources resource = contexto.getResources();
        int idDoDrawable = resource.getIdentifier(drawableEmTexto, "drawable",
                contexto.getPackageName());
        return resource.getDrawable(idDoDrawable);
    }
}

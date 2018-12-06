package com.example.phale.pictoprojectproto.CoreClasses;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;

import java.util.Dictionary;

/**
 * Extension of the default Canvas class.
 * Will support basic Canvas drawing abilities, as well as a list of previous inputs
 * as to support an "undo" feature.
 */
public class PictoCanvas extends Canvas {

    Dictionary<Path,Color> pathList;

    public PictoCanvas()
    {

    }
}

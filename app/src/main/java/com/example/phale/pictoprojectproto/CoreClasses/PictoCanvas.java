package com.example.phale.pictoprojectproto.CoreClasses;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;

import java.util.ArrayList;
import java.util.Dictionary;

/**
 * Extension of the default Canvas class.
 * Will support basic Canvas drawing abilities, as well as a list of previous inputs
 * as to support an "undo" feature.
 */
public class PictoCanvas extends Canvas {

    private ArrayList<Path> pathList;
    private Bitmap mBitmap;

    // private Dictionary<Path,Int> pathDict;

    // Takes in a Bitmap used to draw to when used with the canvas.
    public PictoCanvas(Bitmap bitmap)
    {
        // Init super and custom variables
        super(bitmap);
        mBitmap = bitmap;
        pathList = new ArrayList<>();
    }

    public void undoLast()
    {
        // Remove last Path added
        pathList.remove(pathList.size() - 1);

        // Do corresponding functions
    }

    // Might change this function if I can have the path's colour in the path variable
    public void addPath(Path path)
    {
        // Add path and colour to dictionary
        pathList.add(path);

        // Game Session should invalidate the canvas go the new path gets rendered

    }
}

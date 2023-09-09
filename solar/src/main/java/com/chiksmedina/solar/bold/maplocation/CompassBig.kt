package com.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MapLocationGroup

public val MapLocationGroup.CompassBig: ImageVector
    get() {
        if (_compassBig != null) {
            return _compassBig!!
        }
        _compassBig = Builder(name = "CompassBig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5543f, 21.5288f)
                curveTo(5.3513f, 22.75f, 8.4975f, 21.4915f, 14.7898f, 18.9746f)
                curveTo(16.132f, 18.4377f, 16.8031f, 18.1693f, 17.3295f, 17.7076f)
                curveTo(17.4637f, 17.59f, 17.59f, 17.4637f, 17.7076f, 17.3295f)
                curveTo(18.1693f, 16.8031f, 18.4377f, 16.132f, 18.9746f, 14.7898f)
                curveTo(21.4915f, 8.4975f, 22.75f, 5.3513f, 21.5288f, 3.5543f)
                curveTo(21.2393f, 3.1282f, 20.8718f, 2.7607f, 20.4457f, 2.4712f)
                curveTo(18.6487f, 1.25f, 15.5025f, 2.5085f, 9.2102f, 5.0254f)
                curveTo(7.868f, 5.5623f, 7.1969f, 5.8307f, 6.6705f, 6.2924f)
                curveTo(6.5363f, 6.41f, 6.41f, 6.5363f, 6.2924f, 6.6705f)
                curveTo(5.8307f, 7.1969f, 5.5623f, 7.868f, 5.0254f, 9.2102f)
                curveTo(2.5085f, 15.5025f, 1.25f, 18.6487f, 2.4712f, 20.4457f)
                curveTo(2.7607f, 20.8718f, 3.1282f, 21.2393f, 3.5543f, 21.5288f)
                close()
                moveTo(8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 14.0711f, 14.0711f, 15.75f, 12.0f, 15.75f)
                curveTo(9.9289f, 15.75f, 8.25f, 14.0711f, 8.25f, 12.0f)
                close()
                moveTo(9.75f, 12.0f)
                curveTo(9.75f, 10.7574f, 10.7574f, 9.75f, 12.0f, 9.75f)
                curveTo(13.2426f, 9.75f, 14.25f, 10.7574f, 14.25f, 12.0f)
                curveTo(14.25f, 13.2426f, 13.2426f, 14.25f, 12.0f, 14.25f)
                curveTo(10.7574f, 14.25f, 9.75f, 13.2426f, 9.75f, 12.0f)
                close()
            }
        }
        .build()
        return _compassBig!!
    }

private var _compassBig: ImageVector? = null

package com.chiksmedina.solar.lineduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MapLocationGroup

val MapLocationGroup.CompassBig: ImageVector
    get() {
        if (_compassBig != null) {
            return _compassBig!!
        }
        _compassBig = Builder(
            name = "CompassBig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.7898f, 18.9746f)
                curveTo(8.4975f, 21.4915f, 5.3513f, 22.75f, 3.5543f, 21.5288f)
                curveTo(3.1282f, 21.2393f, 2.7607f, 20.8718f, 2.4712f, 20.4457f)
                curveTo(1.25f, 18.6487f, 2.5085f, 15.5025f, 5.0254f, 9.2102f)
                curveTo(5.5623f, 7.868f, 5.8307f, 7.1969f, 6.2924f, 6.6705f)
                curveTo(6.41f, 6.5363f, 6.5363f, 6.41f, 6.6705f, 6.2924f)
                curveTo(7.1969f, 5.8307f, 7.868f, 5.5623f, 9.2102f, 5.0254f)
                curveTo(15.5025f, 2.5085f, 18.6487f, 1.25f, 20.4457f, 2.4712f)
                curveTo(20.8718f, 2.7607f, 21.2393f, 3.1282f, 21.5288f, 3.5543f)
                curveTo(22.75f, 5.3513f, 21.4915f, 8.4975f, 18.9746f, 14.7898f)
                curveTo(18.4377f, 16.132f, 18.1693f, 16.8031f, 17.7076f, 17.3295f)
                curveTo(17.59f, 17.4637f, 17.4637f, 17.59f, 17.3295f, 17.7076f)
                curveTo(16.8031f, 18.1693f, 16.132f, 18.4377f, 14.7898f, 18.9746f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
            .build()
        return _compassBig!!
    }

private var _compassBig: ImageVector? = null

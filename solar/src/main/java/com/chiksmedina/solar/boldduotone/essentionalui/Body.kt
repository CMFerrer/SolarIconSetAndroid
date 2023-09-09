package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.Body: ImageVector
    get() {
        if (_body != null) {
            return _body!!
        }
        _body = Builder(name = "Body", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0463f, 18.0611f)
                lineTo(9.4278f, 20.8641f)
                lineTo(15.584f, 2.1536f)
                lineTo(15.32f, 2.2778f)
                curveTo(15.2507f, 2.3105f, 15.1916f, 2.3596f, 15.1487f, 2.4203f)
                curveTo(13.6508f, 4.5359f, 10.3492f, 4.5359f, 8.8513f, 2.4203f)
                curveTo(8.8084f, 2.3596f, 8.7493f, 2.3105f, 8.68f, 2.2778f)
                lineTo(8.416f, 2.1536f)
                curveTo(7.9747f, 1.9458f, 7.4545f, 1.9464f, 7.0221f, 2.1703f)
                curveTo(6.4383f, 2.4726f, 5.6085f, 2.9256f, 5.0358f, 3.3365f)
                curveTo(4.884f, 3.4454f, 4.7268f, 3.5682f, 4.5681f, 3.6994f)
                curveTo(3.5198f, 4.5665f, 2.9956f, 5.0f, 3.0f, 5.6905f)
                curveTo(3.0045f, 6.3809f, 3.5955f, 6.8579f, 4.7774f, 7.8119f)
                lineTo(4.9848f, 7.9792f)
                curveTo(5.537f, 8.4249f, 5.8132f, 8.6478f, 5.9602f, 8.9488f)
                curveTo(6.1072f, 9.2498f, 6.1072f, 9.5922f, 6.1072f, 10.2771f)
                verticalLineTo(15.5403f)
                curveTo(6.1072f, 16.2412f, 6.1072f, 16.5917f, 6.228f, 16.9159f)
                curveTo(6.3488f, 17.2402f, 6.5813f, 17.5138f, 7.0463f, 18.0611f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9376f, 22.0f)
                horizontalLineTo(12.0622f)
                curveTo(12.8212f, 22.0f, 13.2008f, 22.0f, 13.5308f, 21.8506f)
                curveTo(13.8608f, 21.7013f, 14.0979f, 21.4222f, 14.5721f, 20.8641f)
                lineTo(16.9536f, 18.0611f)
                curveTo(17.4186f, 17.5138f, 17.6511f, 17.2402f, 17.7719f, 16.9159f)
                curveTo(17.8927f, 16.5917f, 17.8927f, 16.2412f, 17.8927f, 15.5403f)
                verticalLineTo(10.2771f)
                curveTo(17.8927f, 9.5922f, 17.8927f, 9.2498f, 18.0397f, 8.9488f)
                curveTo(18.1868f, 8.6478f, 18.4629f, 8.4249f, 19.0151f, 7.9792f)
                lineTo(19.2225f, 7.8119f)
                curveTo(20.4044f, 6.8579f, 20.9954f, 6.3809f, 20.9999f, 5.6905f)
                curveTo(21.0043f, 5.0f, 20.4802f, 4.5665f, 19.4318f, 3.6994f)
                curveTo(19.2731f, 3.5682f, 19.1159f, 3.4454f, 18.9641f, 3.3365f)
                curveTo(18.3914f, 2.9256f, 17.5617f, 2.4726f, 16.9778f, 2.1703f)
                curveTo(16.5454f, 1.9464f, 16.0252f, 1.9458f, 15.5839f, 2.1536f)
                lineTo(9.4277f, 20.8641f)
                curveTo(9.9019f, 21.4222f, 10.139f, 21.7013f, 10.469f, 21.8506f)
                curveTo(10.7991f, 22.0f, 11.1786f, 22.0f, 11.9376f, 22.0f)
                close()
            }
        }
        .build()
        return _body!!
    }

private var _body: ImageVector? = null

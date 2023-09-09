package com.chiksmedina.solar.bold.maplocation

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
import com.chiksmedina.solar.bold.MapLocationGroup

public val MapLocationGroup.PointOnMap: ImageVector
    get() {
        if (_pointOnMap != null) {
            return _pointOnMap!!
        }
        _pointOnMap = Builder(name = "PointOnMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.8292f)
                verticalLineTo(11.1625f)
                curveTo(21.0f, 10.1189f, 21.0f, 9.5971f, 20.7169f, 9.2043f)
                curveTo(20.4881f, 8.8869f, 20.1212f, 8.7183f, 19.4667f, 8.4912f)
                curveTo(19.3328f, 10.0974f, 18.8009f, 11.7377f, 17.9655f, 13.1734f)
                curveTo(16.9928f, 14.845f, 15.5484f, 16.3395f, 13.697f, 17.1472f)
                curveTo(12.618f, 17.6179f, 11.382f, 17.6179f, 10.303f, 17.1472f)
                curveTo(8.4516f, 16.3395f, 7.0072f, 14.845f, 6.0345f, 13.1734f)
                curveTo(5.4009f, 12.0844f, 4.9418f, 10.8778f, 4.6986f, 9.6575f)
                curveTo(4.3161f, 9.6012f, 4.0225f, 9.6301f, 3.7692f, 9.7714f)
                curveTo(3.6681f, 9.8278f, 3.5739f, 9.8957f, 3.4884f, 9.9738f)
                curveTo(3.0f, 10.4199f, 3.0f, 11.2493f, 3.0f, 12.9082f)
                verticalLineTo(17.8379f)
                curveTo(3.0f, 18.8815f, 3.0f, 19.4033f, 3.2831f, 19.7961f)
                curveTo(3.5663f, 20.189f, 4.0613f, 20.354f, 5.0513f, 20.684f)
                lineTo(5.4349f, 20.8118f)
                lineTo(5.4349f, 20.8118f)
                curveTo(7.0119f, 21.3375f, 7.8004f, 21.6003f, 8.6069f, 21.6018f)
                curveTo(8.8498f, 21.6023f, 9.0924f, 21.5851f, 9.3328f, 21.5503f)
                curveTo(10.131f, 21.4347f, 10.8809f, 21.0597f, 12.3806f, 20.3099f)
                curveTo(13.5299f, 19.7352f, 14.1046f, 19.4479f, 14.715f, 19.3146f)
                curveTo(14.9292f, 19.2678f, 15.1463f, 19.2352f, 15.3648f, 19.2169f)
                curveTo(15.9875f, 19.1648f, 16.6157f, 19.2695f, 17.8721f, 19.4789f)
                curveTo(19.1455f, 19.6911f, 19.7821f, 19.7972f, 20.247f, 19.5303f)
                curveTo(20.4048f, 19.4396f, 20.5449f, 19.321f, 20.6603f, 19.1802f)
                curveTo(21.0f, 18.7655f, 21.0f, 18.1201f, 21.0f, 16.8292f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(8.6863f, 2.0f, 6.0f, 4.5521f, 6.0f, 7.7003f)
                curveTo(6.0f, 10.8238f, 7.915f, 14.4687f, 10.9028f, 15.7721f)
                curveTo(11.5993f, 16.076f, 12.4007f, 16.076f, 13.0972f, 15.7721f)
                curveTo(16.085f, 14.4687f, 18.0f, 10.8238f, 18.0f, 7.7003f)
                curveTo(18.0f, 4.5521f, 15.3137f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 9.1046f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8954f, 13.1046f, 6.0f, 12.0f, 6.0f)
                curveTo(10.8954f, 6.0f, 10.0f, 6.8954f, 10.0f, 8.0f)
                curveTo(10.0f, 9.1046f, 10.8954f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _pointOnMap!!
    }

private var _pointOnMap: ImageVector? = null

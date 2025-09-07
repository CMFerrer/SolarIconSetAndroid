package com.chiksmedina.solar.lineduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MapLocationGroup

val MapLocationGroup.MapPointWave: ImageVector
    get() {
        if (_mapPointWave != null) {
            return _mapPointWave!!
        }
        _mapPointWave = Builder(
            name = "MapPointWave", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 8.5146f)
                curveTo(5.0f, 4.9167f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 4.9167f, 19.0f, 8.5146f)
                curveTo(19.0f, 12.0844f, 16.7658f, 16.2499f, 13.2801f, 17.7396f)
                curveTo(12.4675f, 18.0868f, 11.5325f, 18.0868f, 10.7199f, 17.7396f)
                curveTo(7.2342f, 16.2499f, 5.0f, 12.0844f, 5.0f, 8.5146f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 10.1046f, 13.1046f, 11.0f, 12.0f, 11.0f)
                curveTo(10.8954f, 11.0f, 10.0f, 10.1046f, 10.0f, 9.0f)
                curveTo(10.0f, 7.8954f, 10.8954f, 7.0f, 12.0f, 7.0f)
                curveTo(13.1046f, 7.0f, 14.0f, 7.8954f, 14.0f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.9605f, 15.5f)
                curveTo(21.6259f, 16.1025f, 22.0f, 16.7816f, 22.0f, 17.5f)
                curveTo(22.0f, 19.9853f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 19.9853f, 2.0f, 17.5f)
                curveTo(2.0f, 16.7816f, 2.3741f, 16.1025f, 3.0395f, 15.5f)
            }
        }
            .build()
        return _mapPointWave!!
    }

private var _mapPointWave: ImageVector? = null

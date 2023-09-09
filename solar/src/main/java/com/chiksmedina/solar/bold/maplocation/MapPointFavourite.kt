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

public val MapLocationGroup.MapPointFavourite: ImageVector
    get() {
        if (_mapPointFavourite != null) {
            return _mapPointFavourite!!
        }
        _mapPointFavourite = Builder(name = "MapPointFavourite", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 5.6459f, 4.0f, 10.1433f)
                curveTo(4.0f, 14.6055f, 6.5533f, 19.8124f, 10.5371f, 21.6744f)
                curveTo(11.4657f, 22.1085f, 12.5343f, 22.1085f, 13.4629f, 21.6744f)
                curveTo(17.4467f, 19.8124f, 20.0f, 14.6055f, 20.0f, 10.1433f)
                curveTo(20.0f, 5.6459f, 16.4183f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.0f, 8.7573f)
                curveTo(9.0f, 9.7769f, 10.1649f, 10.8543f, 11.0429f, 11.5215f)
                curveTo(11.4626f, 11.8405f, 11.6725f, 12.0f, 12.0f, 12.0f)
                curveTo(12.3275f, 12.0f, 12.5374f, 11.8405f, 12.9571f, 11.5215f)
                curveTo(13.8352f, 10.8543f, 15.0f, 9.7769f, 15.0f, 8.7573f)
                curveTo(15.0f, 7.0243f, 13.35f, 6.3773f, 12.0f, 7.716f)
                curveTo(10.65f, 6.3773f, 9.0f, 7.0243f, 9.0f, 8.7573f)
                close()
            }
        }
        .build()
        return _mapPointFavourite!!
    }

private var _mapPointFavourite: ImageVector? = null

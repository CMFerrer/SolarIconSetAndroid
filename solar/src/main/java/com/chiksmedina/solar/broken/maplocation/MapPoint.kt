package com.chiksmedina.solar.broken.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MapLocationGroup

public val MapLocationGroup.MapPoint: ImageVector
    get() {
        if (_mapPoint != null) {
            return _mapPoint!!
        }
        _mapPoint = Builder(name = "MapPoint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 7.0415f)
                curveTo(12.3374f, 7.0142f, 12.1704f, 7.0f, 12.0f, 7.0f)
                curveTo(10.3431f, 7.0f, 9.0f, 8.3432f, 9.0f, 10.0f)
                curveTo(9.0f, 11.6569f, 10.3431f, 13.0f, 12.0f, 13.0f)
                curveTo(13.6569f, 13.0f, 15.0f, 11.6569f, 15.0f, 10.0f)
                curveTo(15.0f, 9.8296f, 14.9858f, 9.6626f, 14.9585f, 9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 15.2161f)
                curveTo(4.3525f, 13.5622f, 4.0f, 11.8013f, 4.0f, 10.1433f)
                curveTo(4.0f, 5.6459f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.6459f, 20.0f, 10.1433f)
                curveTo(20.0f, 14.6055f, 17.4467f, 19.8124f, 13.4629f, 21.6744f)
                curveTo(12.5343f, 22.1085f, 11.4657f, 22.1085f, 10.5371f, 21.6744f)
                curveTo(9.2647f, 21.0797f, 8.1383f, 20.1439f, 7.1944f, 19.0f)
            }
        }
        .build()
        return _mapPoint!!
    }

private var _mapPoint: ImageVector? = null

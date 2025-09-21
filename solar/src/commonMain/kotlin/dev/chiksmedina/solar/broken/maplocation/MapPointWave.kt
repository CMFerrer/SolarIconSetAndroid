package dev.chiksmedina.solar.broken.maplocation

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
import dev.chiksmedina.solar.broken.MapLocationGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.875f, 12.5729f)
                curveTo(5.3085f, 11.2498f, 5.0f, 9.8411f, 5.0f, 8.5146f)
                curveTo(5.0f, 4.9167f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 4.9167f, 19.0f, 8.5146f)
                curveTo(19.0f, 12.0844f, 16.7658f, 16.2499f, 13.2801f, 17.7396f)
                curveTo(12.4675f, 18.0868f, 11.5325f, 18.0868f, 10.7199f, 17.7396f)
                curveTo(9.6066f, 17.2638f, 8.621f, 16.5151f, 7.7951f, 15.6f)
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
                curveTo(22.0f, 18.4251f, 21.3797f, 19.285f, 20.3161f, 20.0f)
                moveTo(3.0395f, 15.5f)
                curveTo(2.3741f, 16.1025f, 2.0f, 16.7816f, 2.0f, 17.5f)
                curveTo(2.0f, 19.9853f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(13.6529f, 22.0f, 15.2122f, 21.8195f, 16.5858f, 21.5f)
            }
        }
            .build()
        return _mapPointWave!!
    }

private var _mapPointWave: ImageVector? = null

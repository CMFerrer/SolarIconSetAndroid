package dev.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MapLocationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0003f)
                curveTo(17.5228f, 22.0003f, 22.0f, 19.9856f, 22.0f, 17.5003f)
                curveTo(22.0f, 16.2337f, 20.837f, 15.0892f, 18.9654f, 14.2715f)
                curveTo(17.8233f, 16.3673f, 16.0817f, 18.1738f, 13.8695f, 19.1192f)
                curveTo(12.6804f, 19.6274f, 11.3196f, 19.6274f, 10.1305f, 19.1192f)
                curveTo(7.9183f, 18.1738f, 6.1767f, 16.3673f, 5.0346f, 14.2715f)
                curveTo(3.163f, 15.0892f, 2.0f, 16.2337f, 2.0f, 17.5003f)
                curveTo(2.0f, 19.9856f, 6.4771f, 22.0003f, 12.0f, 22.0003f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.0f, 8.5146f)
                curveTo(5.0f, 4.9167f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 4.9167f, 19.0f, 8.5146f)
                curveTo(19.0f, 12.0844f, 16.7658f, 16.2499f, 13.2801f, 17.7396f)
                curveTo(12.4675f, 18.0868f, 11.5325f, 18.0868f, 10.7199f, 17.7396f)
                curveTo(7.2342f, 16.2499f, 5.0f, 12.0844f, 5.0f, 8.5146f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(13.1046f, 11.0f, 14.0f, 10.1046f, 14.0f, 9.0f)
                curveTo(14.0f, 7.8954f, 13.1046f, 7.0f, 12.0f, 7.0f)
                curveTo(10.8954f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 10.8954f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
            .build()
        return _mapPointWave!!
    }

private var _mapPointWave: ImageVector? = null

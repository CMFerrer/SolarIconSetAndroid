package dev.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.MapPoint: ImageVector
    get() {
        if (_mapPoint != null) {
            return _mapPoint!!
        }
        _mapPoint = Builder(
            name = "MapPoint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 6.0026f, 4.0f, 10.5f)
                curveTo(4.0f, 14.9622f, 6.5533f, 19.8124f, 10.5371f, 21.6744f)
                curveTo(11.4657f, 22.1085f, 12.5343f, 22.1085f, 13.4629f, 21.6744f)
                curveTo(17.4467f, 19.8124f, 20.0f, 14.9622f, 20.0f, 10.5f)
                curveTo(20.0f, 6.0026f, 16.4183f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.1046f, 12.0f, 14.0f, 11.1046f, 14.0f, 10.0f)
                curveTo(14.0f, 8.8954f, 13.1046f, 8.0f, 12.0f, 8.0f)
                curveTo(10.8954f, 8.0f, 10.0f, 8.8954f, 10.0f, 10.0f)
                curveTo(10.0f, 11.1046f, 10.8954f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
            .build()
        return _mapPoint!!
    }

private var _mapPoint: ImageVector? = null

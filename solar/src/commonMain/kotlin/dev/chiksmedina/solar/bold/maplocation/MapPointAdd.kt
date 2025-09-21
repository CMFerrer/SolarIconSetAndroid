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

val MapLocationGroup.MapPointAdd: ImageVector
    get() {
        if (_mapPointAdd != null) {
            return _mapPointAdd!!
        }
        _mapPointAdd = Builder(
            name = "MapPointAdd", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 5.6459f, 4.0f, 10.1433f)
                curveTo(4.0f, 14.6055f, 6.5533f, 19.8124f, 10.5371f, 21.6744f)
                curveTo(11.4657f, 22.1085f, 12.5343f, 22.1085f, 13.4629f, 21.6744f)
                curveTo(17.4467f, 19.8124f, 20.0f, 14.6055f, 20.0f, 10.1433f)
                curveTo(20.0f, 5.6459f, 16.4183f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(12.4142f, 6.75f, 12.75f, 7.0858f, 12.75f, 7.5f)
                verticalLineTo(9.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 9.25f, 15.25f, 9.5858f, 15.25f, 10.0f)
                curveTo(15.25f, 10.4142f, 14.9142f, 10.75f, 14.5f, 10.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.5f)
                curveTo(12.75f, 12.9142f, 12.4142f, 13.25f, 12.0f, 13.25f)
                curveTo(11.5858f, 13.25f, 11.25f, 12.9142f, 11.25f, 12.5f)
                verticalLineTo(10.75f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 10.75f, 8.75f, 10.4142f, 8.75f, 10.0f)
                curveTo(8.75f, 9.5858f, 9.0858f, 9.25f, 9.5f, 9.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.5f)
                curveTo(11.25f, 7.0858f, 11.5858f, 6.75f, 12.0f, 6.75f)
                close()
            }
        }
            .build()
        return _mapPointAdd!!
    }

private var _mapPointAdd: ImageVector? = null

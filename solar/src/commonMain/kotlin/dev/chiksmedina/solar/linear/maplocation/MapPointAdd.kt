package dev.chiksmedina.solar.linear.maplocation

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
import dev.chiksmedina.solar.linear.MapLocationGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 10.1433f)
                curveTo(4.0f, 5.6459f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.6459f, 20.0f, 10.1433f)
                curveTo(20.0f, 14.6055f, 17.4467f, 19.8124f, 13.4629f, 21.6744f)
                curveTo(12.5343f, 22.1085f, 11.4657f, 22.1085f, 10.5371f, 21.6744f)
                curveTo(6.5533f, 19.8124f, 4.0f, 14.6055f, 4.0f, 10.1433f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 10.0f)
                horizontalLineTo(14.5f)
                moveTo(12.0f, 12.5f)
                lineTo(12.0f, 7.5f)
            }
        }
            .build()
        return _mapPointAdd!!
    }

private var _mapPointAdd: ImageVector? = null

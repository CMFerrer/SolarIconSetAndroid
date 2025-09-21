package dev.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.MapPointHospital: ImageVector
    get() {
        if (_mapPointHospital != null) {
            return _mapPointHospital!!
        }
        _mapPointHospital = Builder(
            name = "MapPointHospital", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 5.6459f, 4.0f, 10.1433f)
                curveTo(4.0f, 14.6055f, 6.5533f, 19.8124f, 10.5371f, 21.6744f)
                curveTo(11.4657f, 22.1085f, 12.5343f, 22.1085f, 13.4629f, 21.6744f)
                curveTo(17.4467f, 19.8124f, 20.0f, 14.6055f, 20.0f, 10.1433f)
                curveTo(20.0f, 5.6459f, 16.4183f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(14.2091f, 14.0f, 16.0f, 12.2091f, 16.0f, 10.0f)
                curveTo(16.0f, 7.7909f, 14.2091f, 6.0f, 12.0f, 6.0f)
                curveTo(9.7909f, 6.0f, 8.0f, 7.7909f, 8.0f, 10.0f)
                curveTo(8.0f, 12.2091f, 9.7909f, 14.0f, 12.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 14.0f)
                curveTo(14.2091f, 14.0f, 16.0f, 12.2091f, 16.0f, 10.0f)
                curveTo(16.0f, 7.7909f, 14.2091f, 6.0f, 12.0f, 6.0f)
                curveTo(9.7909f, 6.0f, 8.0f, 7.7909f, 8.0f, 10.0f)
                curveTo(8.0f, 12.2091f, 9.7909f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.75f, 8.5f)
                curveTo(12.75f, 8.0858f, 12.4142f, 7.75f, 12.0f, 7.75f)
                curveTo(11.5858f, 7.75f, 11.25f, 8.0858f, 11.25f, 8.5f)
                verticalLineTo(9.25f)
                horizontalLineTo(10.5f)
                curveTo(10.0858f, 9.25f, 9.75f, 9.5858f, 9.75f, 10.0f)
                curveTo(9.75f, 10.4142f, 10.0858f, 10.75f, 10.5f, 10.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.5f)
                curveTo(11.25f, 11.9142f, 11.5858f, 12.25f, 12.0f, 12.25f)
                curveTo(12.4142f, 12.25f, 12.75f, 11.9142f, 12.75f, 11.5f)
                verticalLineTo(10.75f)
                horizontalLineTo(13.5f)
                curveTo(13.9142f, 10.75f, 14.25f, 10.4142f, 14.25f, 10.0f)
                curveTo(14.25f, 9.5858f, 13.9142f, 9.25f, 13.5f, 9.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.5f)
                close()
            }
        }
            .build()
        return _mapPointHospital!!
    }

private var _mapPointHospital: ImageVector? = null

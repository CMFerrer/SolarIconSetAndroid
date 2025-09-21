package dev.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(
            name = "Lightning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.9391f, 17.6364f)
                curveTo(17.8624f, 18.4046f, 17.689f, 18.9217f, 17.2971f, 19.3077f)
                curveTo(16.5941f, 20.0f, 15.4627f, 20.0f, 13.2f, 20.0f)
                horizontalLineTo(10.8f)
                curveTo(8.5373f, 20.0f, 7.4059f, 20.0f, 6.7029f, 19.3077f)
                curveTo(6.0f, 18.6154f, 6.0f, 17.5012f, 6.0f, 15.2727f)
                verticalLineTo(12.7273f)
                curveTo(6.0f, 10.4988f, 6.0f, 9.3846f, 6.7029f, 8.6923f)
                curveTo(7.4059f, 8.0f, 8.5373f, 8.0f, 10.8f, 8.0f)
                horizontalLineTo(13.2f)
                curveTo(15.4627f, 8.0f, 16.5941f, 8.0f, 17.2971f, 8.6923f)
                curveTo(18.0f, 9.3846f, 18.0f, 10.4988f, 18.0f, 12.7273f)
                verticalLineTo(13.9091f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.0f)
                verticalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                lineTo(10.5f, 14.0f)
                horizontalLineTo(13.5f)
                lineTo(12.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 5.0f)
                horizontalLineTo(13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 8.0f)
                verticalLineTo(5.5f)
                curveTo(15.5f, 4.0955f, 15.5f, 3.3933f, 15.1629f, 2.8889f)
                curveTo(15.017f, 2.6705f, 14.8295f, 2.483f, 14.6111f, 2.3371f)
                curveTo(14.1067f, 2.0f, 13.4045f, 2.0f, 12.0f, 2.0f)
                curveTo(10.5955f, 2.0f, 9.8933f, 2.0f, 9.3889f, 2.3371f)
                curveTo(9.1705f, 2.483f, 8.983f, 2.6705f, 8.8371f, 2.8889f)
                curveTo(8.5f, 3.3933f, 8.5f, 4.0955f, 8.5f, 5.5f)
                verticalLineTo(8.0f)
            }
        }
            .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null

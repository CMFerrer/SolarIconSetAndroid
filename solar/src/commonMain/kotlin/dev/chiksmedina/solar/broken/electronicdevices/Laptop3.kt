package dev.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.Laptop3: ImageVector
    get() {
        if (_laptop3 != null) {
            return _laptop3!!
        }
        _laptop3 = Builder(
            name = "Laptop3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 2.0f)
                curveTo(6.6716f, 2.0f, 5.2574f, 2.0f, 4.3787f, 2.8787f)
                curveTo(3.5f, 3.7574f, 3.5f, 5.1716f, 3.5f, 8.0f)
                verticalLineTo(11.0f)
                curveTo(3.5f, 12.8856f, 3.5f, 13.8284f, 4.0858f, 14.4142f)
                curveTo(4.6716f, 15.0f, 5.6144f, 15.0f, 7.5f, 15.0f)
                horizontalLineTo(16.5f)
                curveTo(18.3856f, 15.0f, 19.3284f, 15.0f, 19.9142f, 14.4142f)
                curveTo(20.5f, 13.8284f, 20.5f, 12.8856f, 20.5f, 11.0f)
                verticalLineTo(8.0f)
                curveTo(20.5f, 5.1716f, 20.5f, 3.7574f, 19.6213f, 2.8787f)
                curveTo(18.7426f, 2.0f, 17.3284f, 2.0f, 14.5f, 2.0f)
                horizontalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 22.0f, 2.0f, 20.6569f, 2.0f, 19.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 17.4477f, 2.4477f, 17.0f, 3.0f, 17.0f)
                horizontalLineTo(7.3333f)
                curveTo(7.7661f, 17.0f, 8.1871f, 17.1404f, 8.5333f, 17.4f)
                lineTo(9.4667f, 18.1f)
                curveTo(9.8129f, 18.3596f, 10.2339f, 18.5f, 10.6667f, 18.5f)
                horizontalLineTo(13.3333f)
                curveTo(13.7661f, 18.5f, 14.1871f, 18.3596f, 14.5333f, 18.1f)
                lineTo(15.4667f, 17.4f)
                curveTo(15.8129f, 17.1404f, 16.2339f, 17.0f, 16.6667f, 17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 17.0f, 22.0f, 17.4477f, 22.0f, 18.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 20.6569f, 20.6569f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(16.0f)
            }
        }
            .build()
        return _laptop3!!
    }

private var _laptop3: ImageVector? = null

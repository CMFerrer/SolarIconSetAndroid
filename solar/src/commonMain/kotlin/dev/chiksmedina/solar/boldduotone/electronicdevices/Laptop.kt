package dev.chiksmedina.solar.boldduotone.electronicdevices

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
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(
            name = "Laptop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.9388f, 3.5858f)
                curveTo(4.353f, 4.1716f, 4.353f, 5.1144f, 4.353f, 7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.6471f)
                verticalLineTo(7.0f)
                curveTo(19.6471f, 5.1144f, 19.6471f, 4.1716f, 19.0614f, 3.5858f)
                curveTo(18.4756f, 3.0f, 17.5328f, 3.0f, 15.6471f, 3.0f)
                horizontalLineTo(8.353f)
                curveTo(6.4674f, 3.0f, 5.5246f, 3.0f, 4.9388f, 3.5858f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.3911f, 16.3358f)
                curveTo(21.4356f, 16.3818f, 21.4579f, 16.4048f, 21.4787f, 16.4276f)
                curveTo(21.7998f, 16.7802f, 21.9843f, 17.2358f, 21.999f, 17.7124f)
                curveTo(22.0f, 17.7433f, 22.0f, 17.7753f, 22.0f, 17.8393f)
                curveTo(22.0f, 17.9885f, 22.0f, 18.0631f, 21.996f, 18.1261f)
                curveTo(21.9325f, 19.1314f, 21.1314f, 19.9325f, 20.1261f, 19.996f)
                curveTo(20.0631f, 20.0f, 19.9885f, 20.0f, 19.8393f, 20.0f)
                horizontalLineTo(4.1607f)
                curveTo(4.0115f, 20.0f, 3.9369f, 20.0f, 3.8739f, 19.996f)
                curveTo(2.8686f, 19.9325f, 2.0675f, 19.1314f, 2.004f, 18.1261f)
                curveTo(2.0f, 18.0631f, 2.0f, 17.9885f, 2.0f, 17.8393f)
                curveTo(2.0f, 17.7753f, 2.0f, 17.7433f, 2.001f, 17.7124f)
                curveTo(2.0157f, 17.2358f, 2.2002f, 16.7802f, 2.5213f, 16.4276f)
                curveTo(2.542f, 16.4048f, 2.5643f, 16.3819f, 2.6087f, 16.336f)
                lineTo(3.9031f, 15.0f)
                horizontalLineTo(20.0969f)
                lineTo(21.3911f, 16.3358f)
                close()
                moveTo(8.75f, 18.0f)
                curveTo(8.75f, 17.5858f, 9.0858f, 17.25f, 9.5f, 17.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 17.25f, 15.25f, 17.5858f, 15.25f, 18.0f)
                curveTo(15.25f, 18.4142f, 14.9142f, 18.75f, 14.5f, 18.75f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 18.75f, 8.75f, 18.4142f, 8.75f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 5.75f)
                curveTo(12.75f, 6.1642f, 12.4142f, 6.5f, 12.0f, 6.5f)
                curveTo(11.5858f, 6.5f, 11.25f, 6.1642f, 11.25f, 5.75f)
                curveTo(11.25f, 5.3358f, 11.5858f, 5.0f, 12.0f, 5.0f)
                curveTo(12.4142f, 5.0f, 12.75f, 5.3358f, 12.75f, 5.75f)
                close()
            }
        }
            .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null

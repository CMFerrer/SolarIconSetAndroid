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

val ElectronicDevicesGroup.SsdSquare: ImageVector
    get() {
        if (_ssdSquare != null) {
            return _ssdSquare!!
        }
        _ssdSquare = Builder(
            name = "SsdSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 3.0f)
                horizontalLineTo(7.5f)
                curveTo(6.3954f, 3.0f, 5.5f, 3.5294f, 5.0f, 5.1177f)
                lineTo(2.1574f, 14.9263f)
                curveTo(2.2029f, 14.7794f, 2.2615f, 14.6491f, 2.3371f, 14.5294f)
                curveTo(2.483f, 14.2982f, 2.6705f, 14.0996f, 2.8889f, 13.9451f)
                curveTo(3.3933f, 13.5882f, 4.0955f, 13.5882f, 5.5f, 13.5882f)
                horizontalLineTo(18.5f)
                curveTo(19.9045f, 13.5882f, 20.6067f, 13.5882f, 21.1111f, 13.9451f)
                curveTo(21.3295f, 14.0996f, 21.517f, 14.2982f, 21.6629f, 14.5294f)
                curveTo(21.7435f, 14.6571f, 21.8049f, 14.7968f, 21.8515f, 14.9557f)
                lineTo(19.0f, 5.1177f)
                curveTo(18.5f, 3.5294f, 17.6046f, 3.0f, 16.5f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.5f, 13.5879f)
                horizontalLineTo(18.5f)
                curveTo(19.9045f, 13.5879f, 20.6067f, 13.5879f, 21.1111f, 13.9448f)
                curveTo(21.3295f, 14.0993f, 21.517f, 14.2978f, 21.6629f, 14.529f)
                curveTo(21.7435f, 14.6567f, 21.8049f, 14.7965f, 21.8515f, 14.9554f)
                curveTo(22.0f, 15.4611f, 22.0f, 16.1618f, 22.0f, 17.2929f)
                curveTo(22.0f, 18.7799f, 22.0f, 19.5244f, 21.6629f, 20.0585f)
                curveTo(21.517f, 20.2897f, 21.3295f, 20.4883f, 21.1111f, 20.6428f)
                curveTo(20.6067f, 20.9997f, 19.9045f, 20.9997f, 18.5f, 20.9997f)
                horizontalLineTo(5.5f)
                curveTo(4.0955f, 20.9997f, 3.3933f, 20.9997f, 2.8889f, 20.6428f)
                curveTo(2.6705f, 20.4883f, 2.483f, 20.2897f, 2.3371f, 20.0585f)
                curveTo(2.0f, 19.5244f, 2.0f, 18.7809f, 2.0f, 17.2938f)
                curveTo(2.0f, 16.1949f, 2.0f, 15.502f, 2.136f, 14.9997f)
                curveTo(2.1428f, 14.9746f, 2.1499f, 14.95f, 2.1574f, 14.9259f)
                curveTo(2.2029f, 14.7791f, 2.2615f, 14.6488f, 2.3371f, 14.529f)
                curveTo(2.483f, 14.2978f, 2.6705f, 14.0993f, 2.8889f, 13.9448f)
                curveTo(3.3933f, 13.5879f, 4.0955f, 13.5879f, 5.5f, 13.5879f)
                close()
                moveTo(19.0f, 16.25f)
                curveTo(19.4142f, 16.25f, 19.75f, 16.5858f, 19.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(19.75f, 18.4142f, 19.4142f, 18.75f, 19.0f, 18.75f)
                curveTo(18.5858f, 18.75f, 18.25f, 18.4142f, 18.25f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(18.25f, 16.5858f, 18.5858f, 16.25f, 19.0f, 16.25f)
                close()
                moveTo(17.25f, 17.0f)
                curveTo(17.25f, 16.5858f, 16.9142f, 16.25f, 16.5f, 16.25f)
                curveTo(16.0858f, 16.25f, 15.75f, 16.5858f, 15.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(15.75f, 18.4142f, 16.0858f, 18.75f, 16.5f, 18.75f)
                curveTo(16.9142f, 18.75f, 17.25f, 18.4142f, 17.25f, 18.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(14.0f, 16.25f)
                curveTo(14.4142f, 16.25f, 14.75f, 16.5858f, 14.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(14.75f, 18.4142f, 14.4142f, 18.75f, 14.0f, 18.75f)
                curveTo(13.5858f, 18.75f, 13.25f, 18.4142f, 13.25f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(13.25f, 16.5858f, 13.5858f, 16.25f, 14.0f, 16.25f)
                close()
                moveTo(12.25f, 17.0f)
                curveTo(12.25f, 16.5858f, 11.9142f, 16.25f, 11.5f, 16.25f)
                curveTo(11.0858f, 16.25f, 10.75f, 16.5858f, 10.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(10.75f, 18.4142f, 11.0858f, 18.75f, 11.5f, 18.75f)
                curveTo(11.9142f, 18.75f, 12.25f, 18.4142f, 12.25f, 18.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
            .build()
        return _ssdSquare!!
    }

private var _ssdSquare: ImageVector? = null

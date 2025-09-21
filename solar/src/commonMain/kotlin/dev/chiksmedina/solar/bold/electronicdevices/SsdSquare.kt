package dev.chiksmedina.solar.bold.electronicdevices

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
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.4999f, 3.0f)
                horizontalLineTo(16.4999f)
                curveTo(17.6045f, 3.0f, 18.4999f, 3.5294f, 18.9999f, 5.1177f)
                lineTo(21.2505f, 12.8823f)
                curveTo(20.9286f, 12.7426f, 20.5913f, 12.675f, 20.2502f, 12.6383f)
                curveTo(19.782f, 12.5878f, 19.2096f, 12.5879f, 18.5508f, 12.5879f)
                horizontalLineTo(5.4493f)
                curveTo(4.7904f, 12.5879f, 4.218f, 12.5878f, 3.7498f, 12.6383f)
                curveTo(3.4086f, 12.675f, 3.0712f, 12.7427f, 2.7493f, 12.8824f)
                lineTo(4.9999f, 5.1177f)
                curveTo(5.4999f, 3.5294f, 6.3953f, 3.0f, 7.4999f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.6629f, 14.529f)
                curveTo(21.74f, 14.6512f, 21.7995f, 14.7844f, 21.8454f, 14.9348f)
                lineTo(21.8514f, 14.9557f)
                curveTo(21.9999f, 15.4616f, 21.9999f, 16.1626f, 21.9999f, 17.2941f)
                curveTo(21.9999f, 18.3241f, 21.9999f, 18.9974f, 21.8879f, 19.4915f)
                curveTo(21.8786f, 19.5324f, 21.8686f, 19.5721f, 21.8577f, 19.6107f)
                curveTo(21.8103f, 19.7786f, 21.7471f, 19.9251f, 21.6629f, 20.0585f)
                curveTo(21.517f, 20.2897f, 21.3295f, 20.4883f, 21.1111f, 20.6428f)
                curveTo(20.6067f, 20.9997f, 19.9045f, 20.9997f, 18.5f, 20.9997f)
                horizontalLineTo(5.5f)
                curveTo(4.0955f, 20.9997f, 3.3933f, 20.9997f, 2.8889f, 20.6428f)
                curveTo(2.6705f, 20.4883f, 2.483f, 20.2897f, 2.3371f, 20.0585f)
                curveTo(2.0f, 19.5244f, 2.0f, 18.7809f, 2.0f, 17.2938f)
                curveTo(2.0f, 16.2196f, 2.0f, 15.5333f, 2.1271f, 15.0337f)
                lineTo(2.1349f, 15.0037f)
                curveTo(2.1393f, 14.9875f, 2.1439f, 14.9712f, 2.1485f, 14.9554f)
                lineTo(2.149f, 14.9535f)
                curveTo(2.1956f, 14.7953f, 2.2568f, 14.6562f, 2.3371f, 14.529f)
                curveTo(2.483f, 14.2978f, 2.6705f, 14.0993f, 2.8889f, 13.9448f)
                curveTo(3.3933f, 13.5879f, 4.0955f, 13.5879f, 5.5f, 13.5879f)
                horizontalLineTo(18.5f)
                curveTo(19.9045f, 13.5879f, 20.6067f, 13.5879f, 21.1111f, 13.9448f)
                curveTo(21.3295f, 14.0993f, 21.517f, 14.2978f, 21.6629f, 14.529f)
                close()
                moveTo(12.25f, 17.0f)
                curveTo(12.25f, 16.5858f, 11.9142f, 16.25f, 11.5f, 16.25f)
                curveTo(11.0858f, 16.25f, 10.75f, 16.5858f, 10.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(10.75f, 18.4142f, 11.0858f, 18.75f, 11.5f, 18.75f)
                curveTo(11.9142f, 18.75f, 12.25f, 18.4142f, 12.25f, 18.0f)
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
                moveTo(17.25f, 17.0f)
                curveTo(17.25f, 16.5858f, 16.9142f, 16.25f, 16.5f, 16.25f)
                curveTo(16.0858f, 16.25f, 15.75f, 16.5858f, 15.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(15.75f, 18.4142f, 16.0858f, 18.75f, 16.5f, 18.75f)
                curveTo(16.9142f, 18.75f, 17.25f, 18.4142f, 17.25f, 18.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(19.75f, 17.0f)
                curveTo(19.75f, 16.5858f, 19.4142f, 16.25f, 19.0f, 16.25f)
                curveTo(18.5858f, 16.25f, 18.25f, 16.5858f, 18.25f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(18.25f, 18.4142f, 18.5858f, 18.75f, 19.0f, 18.75f)
                curveTo(19.4142f, 18.75f, 19.75f, 18.4142f, 19.75f, 18.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
            .build()
        return _ssdSquare!!
    }

private var _ssdSquare: ImageVector? = null

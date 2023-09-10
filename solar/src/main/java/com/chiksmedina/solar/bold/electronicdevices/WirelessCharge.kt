package com.chiksmedina.solar.bold.electronicdevices

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
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.WirelessCharge: ImageVector
    get() {
        if (_wirelessCharge != null) {
            return _wirelessCharge!!
        }
        _wirelessCharge = Builder(
            name = "WirelessCharge", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0646f, 17.9997f)
                curveTo(16.4827f, 18.0354f, 20.0354f, 14.4827f, 19.9997f, 10.0646f)
                curveTo(19.9641f, 5.6464f, 16.3536f, 2.0359f, 11.9354f, 2.0003f)
                curveTo(7.5173f, 1.9646f, 3.9646f, 5.5173f, 4.0003f, 9.9354f)
                curveTo(4.0359f, 14.3536f, 7.6464f, 17.9641f, 12.0646f, 17.9997f)
                close()
                moveTo(13.3739f, 6.4569f)
                curveTo(13.6739f, 6.7426f, 13.6854f, 7.2173f, 13.3998f, 7.5172f)
                lineTo(11.7495f, 9.25f)
                horizontalLineTo(13.9995f)
                curveTo(14.2996f, 9.25f, 14.5707f, 9.4288f, 14.6889f, 9.7046f)
                curveTo(14.8071f, 9.9803f, 14.7495f, 10.3f, 14.5426f, 10.5172f)
                lineTo(11.6855f, 13.5172f)
                curveTo(11.3998f, 13.8172f, 10.9251f, 13.8288f, 10.6251f, 13.5431f)
                curveTo(10.3252f, 13.2574f, 10.3136f, 12.7827f, 10.5993f, 12.4828f)
                lineTo(12.2495f, 10.75f)
                horizontalLineTo(9.9995f)
                curveTo(9.6995f, 10.75f, 9.4284f, 10.5712f, 9.3102f, 10.2954f)
                curveTo(9.192f, 10.0197f, 9.2495f, 9.7f, 9.4564f, 9.4828f)
                lineTo(12.3136f, 6.4828f)
                curveTo(12.5992f, 6.1828f, 13.074f, 6.1712f, 13.3739f, 6.4569f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.1173f, 20.9242f)
                curveTo(11.1584f, 20.9412f, 11.2019f, 20.9544f, 11.25f, 20.9647f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(12.4142f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                verticalLineTo(20.9647f)
                curveTo(12.7981f, 20.9544f, 12.8416f, 20.9412f, 12.8827f, 20.9242f)
                curveTo(13.1277f, 20.8227f, 13.3224f, 20.628f, 13.4239f, 20.383f)
                curveTo(13.5f, 20.1992f, 13.5f, 19.9663f, 13.5f, 19.5003f)
                verticalLineTo(18.8964f)
                curveTo(13.0303f, 18.9685f, 12.5481f, 19.004f, 12.0565f, 19.0f)
                curveTo(11.526f, 18.9958f, 11.0059f, 18.9457f, 10.5f, 18.8535f)
                verticalLineTo(19.5003f)
                curveTo(10.5f, 19.9663f, 10.5f, 20.1992f, 10.5761f, 20.383f)
                curveTo(10.6776f, 20.628f, 10.8723f, 20.8227f, 11.1173f, 20.9242f)
                close()
            }
        }
            .build()
        return _wirelessCharge!!
    }

private var _wirelessCharge: ImageVector? = null

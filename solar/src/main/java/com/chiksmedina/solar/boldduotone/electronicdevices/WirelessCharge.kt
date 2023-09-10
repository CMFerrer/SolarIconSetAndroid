package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.9997f, 10.0726f)
                curveTo(21.0398f, 15.043f, 17.043f, 19.0398f, 12.0726f, 18.9997f)
                curveTo(7.1022f, 18.9596f, 3.0404f, 14.8978f, 3.0003f, 9.9274f)
                curveTo(2.9602f, 4.957f, 6.957f, 0.9602f, 11.9274f, 1.0003f)
                curveTo(16.8978f, 1.0404f, 20.9596f, 5.1022f, 20.9997f, 10.0726f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.3744f, 6.4569f)
                curveTo(13.6743f, 6.7426f, 13.6859f, 7.2173f, 13.4003f, 7.5172f)
                lineTo(11.75f, 9.25f)
                horizontalLineTo(14.0f)
                curveTo(14.3f, 9.25f, 14.5712f, 9.4288f, 14.6894f, 9.7046f)
                curveTo(14.8076f, 9.9803f, 14.75f, 10.3f, 14.5431f, 10.5172f)
                lineTo(11.686f, 13.5172f)
                curveTo(11.4003f, 13.8172f, 10.9256f, 13.8288f, 10.6256f, 13.5431f)
                curveTo(10.3257f, 13.2574f, 10.3141f, 12.7827f, 10.5998f, 12.4828f)
                lineTo(12.25f, 10.75f)
                horizontalLineTo(10.0f)
                curveTo(9.7f, 10.75f, 9.4288f, 10.5712f, 9.3107f, 10.2954f)
                curveTo(9.1925f, 10.0197f, 9.25f, 9.7f, 9.4569f, 9.4828f)
                lineTo(12.3141f, 6.4828f)
                curveTo(12.5997f, 6.1828f, 13.0745f, 6.1712f, 13.3744f, 6.4569f)
                close()
            }
        }
            .build()
        return _wirelessCharge!!
    }

private var _wirelessCharge: ImageVector? = null

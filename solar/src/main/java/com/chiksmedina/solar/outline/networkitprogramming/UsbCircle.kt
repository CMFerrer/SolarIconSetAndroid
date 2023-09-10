package com.chiksmedina.solar.outline.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.UsbCircle: ImageVector
    get() {
        if (_usbCircle != null) {
            return _usbCircle!!
        }
        _usbCircle = Builder(
            name = "UsbCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.5303f, 6.4697f)
                lineTo(12.5303f, 5.4697f)
                curveTo(12.2374f, 5.1768f, 11.7626f, 5.1768f, 11.4697f, 5.4697f)
                lineTo(10.4697f, 6.4697f)
                curveTo(10.1768f, 6.7626f, 10.1768f, 7.2374f, 10.4697f, 7.5303f)
                curveTo(10.6807f, 7.7414f, 10.9862f, 7.8003f, 11.25f, 7.7073f)
                verticalLineTo(12.7415f)
                curveTo(11.1787f, 12.7115f, 11.1055f, 12.6847f, 11.0306f, 12.6613f)
                lineTo(9.6272f, 12.2227f)
                curveTo(9.1053f, 12.0596f, 8.75f, 11.5763f, 8.75f, 11.0296f)
                verticalLineTo(10.5816f)
                curveTo(9.3412f, 10.3007f, 9.75f, 9.6981f, 9.75f, 9.0f)
                curveTo(9.75f, 8.0335f, 8.9665f, 7.25f, 8.0f, 7.25f)
                curveTo(7.0335f, 7.25f, 6.25f, 8.0335f, 6.25f, 9.0f)
                curveTo(6.25f, 9.6981f, 6.6588f, 10.3007f, 7.25f, 10.5816f)
                verticalLineTo(11.0296f)
                curveTo(7.25f, 12.2324f, 8.0317f, 13.2957f, 9.1797f, 13.6544f)
                lineTo(10.5832f, 14.093f)
                curveTo(10.9799f, 14.217f, 11.25f, 14.5844f, 11.25f, 15.0f)
                verticalLineTo(15.4184f)
                curveTo(10.6588f, 15.6993f, 10.25f, 16.3019f, 10.25f, 17.0f)
                curveTo(10.25f, 17.9665f, 11.0335f, 18.75f, 12.0f, 18.75f)
                curveTo(12.9665f, 18.75f, 13.75f, 17.9665f, 13.75f, 17.0f)
                curveTo(13.75f, 16.3605f, 13.4069f, 15.8011f, 12.8948f, 15.4958f)
                curveTo(13.0124f, 15.3081f, 13.1948f, 15.1624f, 13.4168f, 15.093f)
                lineTo(14.8203f, 14.6544f)
                curveTo(15.9683f, 14.2957f, 16.75f, 13.2324f, 16.75f, 12.0296f)
                verticalLineTo(11.7084f)
                curveTo(16.9502f, 11.6695f, 17.1831f, 11.5847f, 17.3839f, 11.3839f)
                curveTo(17.6197f, 11.1481f, 17.6955f, 10.8679f, 17.725f, 10.6486f)
                curveTo(17.7502f, 10.4614f, 17.7501f, 10.2396f, 17.75f, 10.0345f)
                verticalLineTo(9.9656f)
                curveTo(17.7501f, 9.7605f, 17.7502f, 9.5386f, 17.725f, 9.3514f)
                curveTo(17.6955f, 9.1321f, 17.6197f, 8.8519f, 17.3839f, 8.6161f)
                curveTo(17.1481f, 8.3803f, 16.8679f, 8.3045f, 16.6486f, 8.275f)
                curveTo(16.4614f, 8.2498f, 16.2396f, 8.2499f, 16.0344f, 8.25f)
                horizontalLineTo(15.9656f)
                curveTo(15.7604f, 8.2499f, 15.5386f, 8.2498f, 15.3514f, 8.275f)
                curveTo(15.1321f, 8.3045f, 14.8519f, 8.3803f, 14.6161f, 8.6161f)
                curveTo(14.3803f, 8.8519f, 14.3045f, 9.1321f, 14.275f, 9.3514f)
                curveTo(14.2498f, 9.5386f, 14.2499f, 9.7604f, 14.25f, 9.9655f)
                verticalLineTo(10.0344f)
                curveTo(14.2499f, 10.2396f, 14.2498f, 10.4614f, 14.275f, 10.6486f)
                curveTo(14.3045f, 10.8679f, 14.3803f, 11.1481f, 14.6161f, 11.3839f)
                curveTo(14.8169f, 11.5847f, 15.0498f, 11.6695f, 15.25f, 11.7084f)
                verticalLineTo(12.0296f)
                curveTo(15.25f, 12.5763f, 14.8947f, 13.0596f, 14.3728f, 13.2227f)
                lineTo(12.9694f, 13.6613f)
                curveTo(12.8945f, 13.6847f, 12.8213f, 13.7115f, 12.75f, 13.7415f)
                verticalLineTo(7.7073f)
                curveTo(13.0138f, 7.8003f, 13.3193f, 7.7414f, 13.5303f, 7.5303f)
                curveTo(13.8232f, 7.2374f, 13.8232f, 6.7626f, 13.5303f, 6.4697f)
                close()
                moveTo(16.2488f, 10.2488f)
                curveTo(16.1794f, 10.25f, 16.0991f, 10.25f, 16.0f, 10.25f)
                curveTo(15.9009f, 10.25f, 15.8206f, 10.25f, 15.7512f, 10.2488f)
                curveTo(15.75f, 10.1794f, 15.75f, 10.0991f, 15.75f, 10.0f)
                curveTo(15.75f, 9.9009f, 15.75f, 9.8206f, 15.7512f, 9.7512f)
                curveTo(15.8206f, 9.75f, 15.9009f, 9.75f, 16.0f, 9.75f)
                curveTo(16.0991f, 9.75f, 16.1794f, 9.75f, 16.2488f, 9.7512f)
                curveTo(16.25f, 9.8206f, 16.25f, 9.9009f, 16.25f, 10.0f)
                curveTo(16.25f, 10.0991f, 16.25f, 10.1794f, 16.2488f, 10.2488f)
                close()
                moveTo(12.0f, 16.75f)
                curveTo(11.8619f, 16.75f, 11.75f, 16.8619f, 11.75f, 17.0f)
                curveTo(11.75f, 17.1381f, 11.8619f, 17.25f, 12.0f, 17.25f)
                curveTo(12.1381f, 17.25f, 12.25f, 17.1381f, 12.25f, 17.0f)
                curveTo(12.25f, 16.8619f, 12.1381f, 16.75f, 12.0f, 16.75f)
                close()
                moveTo(8.25f, 9.0f)
                curveTo(8.25f, 9.1381f, 8.1381f, 9.25f, 8.0f, 9.25f)
                curveTo(7.8619f, 9.25f, 7.75f, 9.1381f, 7.75f, 9.0f)
                curveTo(7.75f, 8.8619f, 7.8619f, 8.75f, 8.0f, 8.75f)
                curveTo(8.1381f, 8.75f, 8.25f, 8.8619f, 8.25f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                close()
            }
        }
            .build()
        return _usbCircle!!
    }

private var _usbCircle: ImageVector? = null

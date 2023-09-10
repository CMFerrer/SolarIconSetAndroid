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

val NetworkItProgrammingGroup.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(
            name = "Usb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(12.2508f, 1.25f, 12.4849f, 1.3753f, 12.624f, 1.584f)
                lineTo(14.624f, 4.584f)
                curveTo(14.8538f, 4.9286f, 14.7607f, 5.3943f, 14.416f, 5.624f)
                curveTo(14.0714f, 5.8538f, 13.6057f, 5.7607f, 13.376f, 5.416f)
                lineTo(12.75f, 4.4771f)
                verticalLineTo(14.9919f)
                curveTo(12.8713f, 14.93f, 12.9983f, 14.8767f, 13.1304f, 14.8326f)
                lineTo(16.3953f, 13.7443f)
                curveTo(16.9057f, 13.5742f, 17.25f, 13.0965f, 17.25f, 12.5585f)
                verticalLineTo(10.7084f)
                curveTo(17.0498f, 10.6695f, 16.8169f, 10.5847f, 16.6161f, 10.3839f)
                curveTo(16.3803f, 10.1481f, 16.3045f, 9.8679f, 16.275f, 9.6486f)
                curveTo(16.2498f, 9.4614f, 16.2499f, 9.2396f, 16.25f, 9.0345f)
                verticalLineTo(8.9656f)
                curveTo(16.2499f, 8.7605f, 16.2498f, 8.5386f, 16.275f, 8.3514f)
                curveTo(16.3045f, 8.1321f, 16.3803f, 7.8519f, 16.6161f, 7.6161f)
                curveTo(16.8519f, 7.3803f, 17.1321f, 7.3045f, 17.3514f, 7.275f)
                curveTo(17.5386f, 7.2498f, 17.7604f, 7.2499f, 17.9656f, 7.25f)
                horizontalLineTo(18.0344f)
                curveTo(18.2396f, 7.2499f, 18.4614f, 7.2498f, 18.6486f, 7.275f)
                curveTo(18.8679f, 7.3045f, 19.1481f, 7.3803f, 19.3839f, 7.6161f)
                curveTo(19.6197f, 7.8519f, 19.6955f, 8.1321f, 19.725f, 8.3514f)
                curveTo(19.7502f, 8.5386f, 19.7501f, 8.7604f, 19.75f, 8.9655f)
                verticalLineTo(9.0344f)
                curveTo(19.7501f, 9.2395f, 19.7502f, 9.4614f, 19.725f, 9.6486f)
                curveTo(19.6955f, 9.8679f, 19.6197f, 10.1481f, 19.3839f, 10.3839f)
                curveTo(19.1831f, 10.5847f, 18.9502f, 10.6695f, 18.75f, 10.7084f)
                verticalLineTo(12.5585f)
                curveTo(18.75f, 13.7422f, 17.9926f, 14.793f, 16.8696f, 15.1674f)
                lineTo(13.6047f, 16.2557f)
                curveTo(13.122f, 16.4166f, 12.7879f, 16.8525f, 12.753f, 17.3544f)
                curveTo(13.9057f, 17.6818f, 14.75f, 18.7423f, 14.75f, 20.0f)
                curveTo(14.75f, 21.5188f, 13.5188f, 22.75f, 12.0f, 22.75f)
                curveTo(10.4812f, 22.75f, 9.25f, 21.5188f, 9.25f, 20.0f)
                curveTo(9.25f, 18.7412f, 10.0957f, 17.68f, 11.25f, 17.3535f)
                verticalLineTo(14.4415f)
                curveTo(11.25f, 13.9035f, 10.9057f, 13.4258f, 10.3953f, 13.2557f)
                lineTo(7.1304f, 12.1674f)
                curveTo(6.0074f, 11.793f, 5.25f, 10.7422f, 5.25f, 9.5585f)
                verticalLineTo(7.5816f)
                curveTo(4.6588f, 7.3007f, 4.25f, 6.6981f, 4.25f, 6.0f)
                curveTo(4.25f, 5.0335f, 5.0335f, 4.25f, 6.0f, 4.25f)
                curveTo(6.9665f, 4.25f, 7.75f, 5.0335f, 7.75f, 6.0f)
                curveTo(7.75f, 6.6981f, 7.3412f, 7.3007f, 6.75f, 7.5816f)
                verticalLineTo(9.5585f)
                curveTo(6.75f, 10.0965f, 7.0943f, 10.5742f, 7.6047f, 10.7443f)
                lineTo(10.8696f, 11.8326f)
                curveTo(11.0017f, 11.8767f, 11.1287f, 11.93f, 11.25f, 11.9919f)
                verticalLineTo(4.4771f)
                lineTo(10.624f, 5.416f)
                curveTo(10.3943f, 5.7607f, 9.9286f, 5.8538f, 9.584f, 5.624f)
                curveTo(9.2393f, 5.3943f, 9.1462f, 4.9286f, 9.376f, 4.584f)
                lineTo(11.376f, 1.584f)
                curveTo(11.5151f, 1.3753f, 11.7492f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(18.0f, 9.25f)
                curveTo(18.0991f, 9.25f, 18.1794f, 9.25f, 18.2488f, 9.2488f)
                curveTo(18.25f, 9.1794f, 18.25f, 9.0991f, 18.25f, 9.0f)
                curveTo(18.25f, 8.9009f, 18.25f, 8.8206f, 18.2488f, 8.7512f)
                curveTo(18.1794f, 8.75f, 18.0991f, 8.75f, 18.0f, 8.75f)
                curveTo(17.9009f, 8.75f, 17.8206f, 8.75f, 17.7512f, 8.7512f)
                curveTo(17.75f, 8.8206f, 17.75f, 8.9009f, 17.75f, 9.0f)
                curveTo(17.75f, 9.0991f, 17.75f, 9.1794f, 17.7512f, 9.2488f)
                curveTo(17.8206f, 9.25f, 17.9009f, 9.25f, 18.0f, 9.25f)
                close()
                moveTo(10.75f, 20.0f)
                curveTo(10.75f, 19.3096f, 11.3096f, 18.75f, 12.0f, 18.75f)
                curveTo(12.6904f, 18.75f, 13.25f, 19.3096f, 13.25f, 20.0f)
                curveTo(13.25f, 20.6904f, 12.6904f, 21.25f, 12.0f, 21.25f)
                curveTo(11.3096f, 21.25f, 10.75f, 20.6904f, 10.75f, 20.0f)
                close()
                moveTo(6.0f, 6.25f)
                curveTo(6.1381f, 6.25f, 6.25f, 6.1381f, 6.25f, 6.0f)
                curveTo(6.25f, 5.8619f, 6.1381f, 5.75f, 6.0f, 5.75f)
                curveTo(5.8619f, 5.75f, 5.75f, 5.8619f, 5.75f, 6.0f)
                curveTo(5.75f, 6.1381f, 5.8619f, 6.25f, 6.0f, 6.25f)
                close()
            }
        }
            .build()
        return _usb!!
    }

private var _usb: ImageVector? = null

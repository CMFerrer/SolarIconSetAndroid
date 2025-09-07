package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.GamepadMinimalistic: ImageVector
    get() {
        if (_gamepadMinimalistic != null) {
            return _gamepadMinimalistic!!
        }
        _gamepadMinimalistic = Builder(
            name = "GamepadMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.0005f, 3.25f)
                curveTo(15.4147f, 3.25f, 15.7505f, 3.5858f, 15.7505f, 4.0f)
                verticalLineTo(5.0f)
                curveTo(15.7505f, 5.9665f, 14.967f, 6.75f, 14.0005f, 6.75f)
                horizontalLineTo(13.0005f)
                curveTo(12.8624f, 6.75f, 12.7505f, 6.8619f, 12.7505f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.1721f)
                curveTo(15.7112f, 8.0f, 16.9807f, 8.0f, 17.9568f, 8.6137f)
                curveTo(18.2038f, 8.769f, 18.4331f, 8.9508f, 18.6405f, 9.156f)
                curveTo(19.4603f, 9.9668f, 19.7493f, 11.203f, 20.3272f, 13.6753f)
                lineTo(21.3496f, 18.0491f)
                curveTo(21.7091f, 19.5866f, 20.7537f, 21.1243f, 19.216f, 21.483f)
                curveTo(17.9193f, 21.7856f, 16.5855f, 21.1527f, 15.9998f, 19.9569f)
                lineTo(15.8792f, 19.7106f)
                curveTo(15.3414f, 18.6127f, 14.2255f, 17.9167f, 13.003f, 17.9167f)
                horizontalLineTo(10.998f)
                curveTo(9.7755f, 17.9167f, 8.6596f, 18.6127f, 8.1218f, 19.7106f)
                lineTo(8.0012f, 19.9569f)
                curveTo(7.4155f, 21.1527f, 6.0817f, 21.7856f, 4.785f, 21.483f)
                curveTo(3.2473f, 21.1243f, 2.2919f, 19.5866f, 2.6514f, 18.0491f)
                lineTo(3.6738f, 13.6753f)
                curveTo(4.2517f, 11.203f, 4.5407f, 9.9668f, 5.3605f, 9.156f)
                curveTo(5.5679f, 8.9508f, 5.7972f, 8.769f, 6.0442f, 8.6137f)
                curveTo(7.0203f, 8.0f, 8.2898f, 8.0f, 10.8288f, 8.0f)
                horizontalLineTo(11.2505f)
                verticalLineTo(7.0f)
                curveTo(11.2505f, 6.0335f, 12.034f, 5.25f, 13.0005f, 5.25f)
                horizontalLineTo(14.0005f)
                curveTo(14.1386f, 5.25f, 14.2505f, 5.1381f, 14.2505f, 5.0f)
                verticalLineTo(4.0f)
                curveTo(14.2505f, 3.5858f, 14.5863f, 3.25f, 15.0005f, 3.25f)
                close()
                moveTo(16.0005f, 12.0f)
                curveTo(16.0005f, 12.5523f, 15.5528f, 13.0f, 15.0005f, 13.0f)
                curveTo(14.4482f, 13.0f, 14.0005f, 12.5523f, 14.0005f, 12.0f)
                curveTo(14.0005f, 11.4477f, 14.4482f, 11.0f, 15.0005f, 11.0f)
                curveTo(15.5528f, 11.0f, 16.0005f, 11.4477f, 16.0005f, 12.0f)
                close()
                moveTo(8.5005f, 11.25f)
                curveTo(8.9147f, 11.25f, 9.2505f, 11.5858f, 9.2505f, 12.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(10.0005f)
                curveTo(10.4147f, 12.75f, 10.7505f, 13.0858f, 10.7505f, 13.5f)
                curveTo(10.7505f, 13.9142f, 10.4147f, 14.25f, 10.0005f, 14.25f)
                horizontalLineTo(9.2505f)
                verticalLineTo(15.0f)
                curveTo(9.2505f, 15.4142f, 8.9147f, 15.75f, 8.5005f, 15.75f)
                curveTo(8.0863f, 15.75f, 7.7505f, 15.4142f, 7.7505f, 15.0f)
                verticalLineTo(14.25f)
                horizontalLineTo(7.0005f)
                curveTo(6.5863f, 14.25f, 6.2505f, 13.9142f, 6.2505f, 13.5f)
                curveTo(6.2505f, 13.0858f, 6.5863f, 12.75f, 7.0005f, 12.75f)
                horizontalLineTo(7.7505f)
                verticalLineTo(12.0f)
                curveTo(7.7505f, 11.5858f, 8.0863f, 11.25f, 8.5005f, 11.25f)
                close()
                moveTo(17.0005f, 15.5f)
                curveTo(17.5528f, 15.5f, 18.0005f, 15.0523f, 18.0005f, 14.5f)
                curveTo(18.0005f, 13.9477f, 17.5528f, 13.5f, 17.0005f, 13.5f)
                curveTo(16.4482f, 13.5f, 16.0005f, 13.9477f, 16.0005f, 14.5f)
                curveTo(16.0005f, 15.0523f, 16.4482f, 15.5f, 17.0005f, 15.5f)
                close()
            }
        }
            .build()
        return _gamepadMinimalistic!!
    }

private var _gamepadMinimalistic: ImageVector? = null

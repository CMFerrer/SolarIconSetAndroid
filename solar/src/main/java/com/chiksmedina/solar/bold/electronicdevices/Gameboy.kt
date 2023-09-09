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

public val ElectronicDevicesGroup.Gameboy: ImageVector
    get() {
        if (_gameboy != null) {
            return _gameboy!!
        }
        _gameboy = Builder(name = "Gameboy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(7.7574f, 22.0f, 5.636f, 22.0f, 4.318f, 20.5355f)
                curveTo(3.0f, 19.0711f, 3.0f, 16.714f, 3.0f, 12.0f)
                curveTo(3.0f, 7.286f, 3.0f, 4.9289f, 4.318f, 3.4645f)
                curveTo(5.636f, 2.0f, 7.7574f, 2.0f, 12.0f, 2.0f)
                curveTo(16.2426f, 2.0f, 18.364f, 2.0f, 19.682f, 3.4645f)
                curveTo(21.0f, 4.9289f, 21.0f, 7.286f, 21.0f, 12.0f)
                curveTo(21.0f, 16.714f, 21.0f, 19.0711f, 19.682f, 20.5355f)
                curveTo(18.364f, 22.0f, 16.2426f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(9.25f, 14.0f)
                curveTo(9.25f, 13.5858f, 8.9142f, 13.25f, 8.5f, 13.25f)
                curveTo(8.0858f, 13.25f, 7.75f, 13.5858f, 7.75f, 14.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 14.75f, 6.25f, 15.0858f, 6.25f, 15.5f)
                curveTo(6.25f, 15.9142f, 6.5858f, 16.25f, 7.0f, 16.25f)
                horizontalLineTo(7.75f)
                verticalLineTo(17.0f)
                curveTo(7.75f, 17.4142f, 8.0858f, 17.75f, 8.5f, 17.75f)
                curveTo(8.9142f, 17.75f, 9.25f, 17.4142f, 9.25f, 17.0f)
                verticalLineTo(16.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 16.25f, 10.75f, 15.9142f, 10.75f, 15.5f)
                curveTo(10.75f, 15.0858f, 10.4142f, 14.75f, 10.0f, 14.75f)
                horizontalLineTo(9.25f)
                verticalLineTo(14.0f)
                close()
                moveTo(16.3333f, 13.8333f)
                curveTo(16.3333f, 14.2936f, 15.9602f, 14.6667f, 15.5f, 14.6667f)
                curveTo(15.0398f, 14.6667f, 14.6667f, 14.2936f, 14.6667f, 13.8333f)
                curveTo(14.6667f, 13.3731f, 15.0398f, 13.0f, 15.5f, 13.0f)
                curveTo(15.9602f, 13.0f, 16.3333f, 13.3731f, 16.3333f, 13.8333f)
                close()
                moveTo(16.3333f, 17.1667f)
                curveTo(16.3333f, 17.6269f, 15.9602f, 18.0f, 15.5f, 18.0f)
                curveTo(15.0398f, 18.0f, 14.6667f, 17.6269f, 14.6667f, 17.1667f)
                curveTo(14.6667f, 16.7064f, 15.0398f, 16.3333f, 15.5f, 16.3333f)
                curveTo(15.9602f, 16.3333f, 16.3333f, 16.7064f, 16.3333f, 17.1667f)
                close()
                moveTo(13.8333f, 16.3333f)
                curveTo(14.2936f, 16.3333f, 14.6667f, 15.9602f, 14.6667f, 15.5f)
                curveTo(14.6667f, 15.0398f, 14.2936f, 14.6667f, 13.8333f, 14.6667f)
                curveTo(13.3731f, 14.6667f, 13.0f, 15.0398f, 13.0f, 15.5f)
                curveTo(13.0f, 15.9602f, 13.3731f, 16.3333f, 13.8333f, 16.3333f)
                close()
                moveTo(18.0f, 15.5f)
                curveTo(18.0f, 15.9602f, 17.6269f, 16.3333f, 17.1667f, 16.3333f)
                curveTo(16.7064f, 16.3333f, 16.3333f, 15.9602f, 16.3333f, 15.5f)
                curveTo(16.3333f, 15.0398f, 16.7064f, 14.6667f, 17.1667f, 14.6667f)
                curveTo(17.6269f, 14.6667f, 18.0f, 15.0398f, 18.0f, 15.5f)
                close()
                moveTo(7.0511f, 7.1118f)
                curveTo(7.0f, 7.3025f, 7.0f, 7.535f, 7.0f, 8.0f)
                curveTo(7.0f, 8.465f, 7.0f, 8.6975f, 7.0511f, 8.8882f)
                curveTo(7.1898f, 9.4059f, 7.5941f, 9.8102f, 8.1118f, 9.9489f)
                curveTo(8.3025f, 10.0f, 8.535f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(15.0f)
                curveTo(15.465f, 10.0f, 15.6975f, 10.0f, 15.8882f, 9.9489f)
                curveTo(16.4059f, 9.8102f, 16.8102f, 9.4059f, 16.9489f, 8.8882f)
                curveTo(17.0f, 8.6975f, 17.0f, 8.465f, 17.0f, 8.0f)
                curveTo(17.0f, 7.535f, 17.0f, 7.3025f, 16.9489f, 7.1118f)
                curveTo(16.8102f, 6.5941f, 16.4059f, 6.1898f, 15.8882f, 6.0511f)
                curveTo(15.6975f, 6.0f, 15.465f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(8.535f, 6.0f, 8.3025f, 6.0f, 8.1118f, 6.0511f)
                curveTo(7.5941f, 6.1898f, 7.1898f, 6.5941f, 7.0511f, 7.1118f)
                close()
            }
        }
        .build()
        return _gameboy!!
    }

private var _gameboy: ImageVector? = null

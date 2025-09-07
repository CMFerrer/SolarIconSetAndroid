package com.chiksmedina.solar.bold.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Structure: ImageVector
    get() {
        if (_structure != null) {
            return _structure!!
        }
        _structure = Builder(
            name = "Structure", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.9069f, 4.2557f)
                curveTo(7.5759f, 2.9589f, 6.3999f, 2.0f, 5.0f, 2.0f)
                curveTo(3.3431f, 2.0f, 2.0f, 3.3431f, 2.0f, 5.0f)
                curveTo(2.0f, 6.3999f, 2.9589f, 7.5759f, 4.2557f, 7.9069f)
                curveTo(4.2519f, 7.9374f, 4.25f, 7.9685f, 4.25f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(4.25f, 16.0315f, 4.2519f, 16.0626f, 4.2557f, 16.093f)
                curveTo(2.9589f, 16.4241f, 2.0f, 17.6001f, 2.0f, 19.0f)
                curveTo(2.0f, 20.6569f, 3.3431f, 22.0f, 5.0f, 22.0f)
                curveTo(6.3999f, 22.0f, 7.5759f, 21.0411f, 7.9069f, 19.7443f)
                curveTo(7.9374f, 19.7481f, 7.9685f, 19.75f, 8.0f, 19.75f)
                horizontalLineTo(16.0f)
                curveTo(16.0315f, 19.75f, 16.0626f, 19.7481f, 16.093f, 19.7443f)
                curveTo(16.4241f, 21.0411f, 17.6001f, 22.0f, 19.0f, 22.0f)
                curveTo(20.6569f, 22.0f, 22.0f, 20.6569f, 22.0f, 19.0f)
                curveTo(22.0f, 17.6001f, 21.0411f, 16.4241f, 19.7443f, 16.093f)
                curveTo(19.7481f, 16.0626f, 19.75f, 16.0315f, 19.75f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(19.75f, 7.9685f, 19.7481f, 7.9374f, 19.7443f, 7.9069f)
                curveTo(21.0411f, 7.5759f, 22.0f, 6.3999f, 22.0f, 5.0f)
                curveTo(22.0f, 3.3431f, 20.6569f, 2.0f, 19.0f, 2.0f)
                curveTo(17.6001f, 2.0f, 16.4241f, 2.9589f, 16.093f, 4.2557f)
                curveTo(16.0626f, 4.2519f, 16.0315f, 4.25f, 16.0f, 4.25f)
                horizontalLineTo(8.0f)
                curveTo(7.9685f, 4.25f, 7.9374f, 4.2519f, 7.9069f, 4.2557f)
                close()
                moveTo(5.7443f, 7.9069f)
                curveTo(5.7481f, 7.9374f, 5.75f, 7.9685f, 5.75f, 8.0f)
                lineTo(5.75f, 16.0f)
                curveTo(5.75f, 16.0315f, 5.7481f, 16.0626f, 5.7443f, 16.093f)
                curveTo(6.8031f, 16.3633f, 7.6367f, 17.1969f, 7.9069f, 18.2557f)
                curveTo(7.9374f, 18.2519f, 7.9685f, 18.25f, 8.0f, 18.25f)
                horizontalLineTo(16.0f)
                curveTo(16.0315f, 18.25f, 16.0626f, 18.2519f, 16.093f, 18.2557f)
                curveTo(16.3633f, 17.1969f, 17.1969f, 16.3633f, 18.2557f, 16.093f)
                curveTo(18.2519f, 16.0626f, 18.25f, 16.0315f, 18.25f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(18.25f, 7.9685f, 18.2519f, 7.9374f, 18.2557f, 7.9069f)
                curveTo(17.1969f, 7.6367f, 16.3633f, 6.8031f, 16.093f, 5.7443f)
                curveTo(16.0626f, 5.7481f, 16.0315f, 5.75f, 16.0f, 5.75f)
                horizontalLineTo(8.0f)
                curveTo(7.9685f, 5.75f, 7.9374f, 5.7481f, 7.9069f, 5.7443f)
                curveTo(7.6367f, 6.8031f, 6.8031f, 7.6367f, 5.7443f, 7.9069f)
                close()
            }
        }
            .build()
        return _structure!!
    }

private var _structure: ImageVector? = null

package com.chiksmedina.solar.boldduotone.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Screencast: ImageVector
    get() {
        if (_screencast != null) {
            return _screencast!!
        }
        _screencast = Builder(
            name = "Screencast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 4.0f, 4.3432f, 4.0f, 3.1716f, 5.1716f)
                curveTo(2.0f, 6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 20.0f, 19.6569f, 20.0f, 20.8284f, 18.8284f)
                curveTo(22.0f, 17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f)
                curveTo(22.0f, 8.2288f, 22.0f, 6.3432f, 20.8284f, 5.1716f)
                curveTo(19.6569f, 4.0f, 17.7712f, 4.0f, 14.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 9.5f)
                curveTo(2.3358f, 9.5f, 2.0f, 9.8358f, 2.0f, 10.25f)
                curveTo(2.0f, 10.6642f, 2.3358f, 11.0f, 2.75f, 11.0f)
                curveTo(7.3064f, 11.0f, 11.0f, 14.6937f, 11.0f, 19.25f)
                curveTo(11.0f, 19.6642f, 11.3358f, 20.0f, 11.75f, 20.0f)
                curveTo(12.1642f, 20.0f, 12.5f, 19.6642f, 12.5f, 19.25f)
                curveTo(12.5f, 13.8652f, 8.1348f, 9.5f, 2.75f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 12.5f)
                curveTo(2.3358f, 12.5f, 2.0f, 12.8358f, 2.0f, 13.25f)
                curveTo(2.0f, 13.6642f, 2.3358f, 14.0f, 2.75f, 14.0f)
                curveTo(5.6495f, 14.0f, 8.0f, 16.3505f, 8.0f, 19.25f)
                curveTo(8.0f, 19.6642f, 8.3358f, 20.0f, 8.75f, 20.0f)
                curveTo(9.1642f, 20.0f, 9.5f, 19.6642f, 9.5f, 19.25f)
                curveTo(9.5f, 15.5221f, 6.4779f, 12.5f, 2.75f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 15.5f)
                curveTo(2.3358f, 15.5f, 2.0f, 15.8358f, 2.0f, 16.25f)
                curveTo(2.0f, 16.6642f, 2.3358f, 17.0f, 2.75f, 17.0f)
                curveTo(3.9926f, 17.0f, 5.0f, 18.0074f, 5.0f, 19.25f)
                curveTo(5.0f, 19.6642f, 5.3358f, 20.0f, 5.75f, 20.0f)
                curveTo(6.1642f, 20.0f, 6.5f, 19.6642f, 6.5f, 19.25f)
                curveTo(6.5f, 17.1789f, 4.8211f, 15.5f, 2.75f, 15.5f)
                close()
            }
        }
            .build()
        return _screencast!!
    }

private var _screencast: ImageVector? = null

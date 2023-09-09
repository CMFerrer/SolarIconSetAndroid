package com.chiksmedina.solar.bold.arrowsaction

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
import com.chiksmedina.solar.bold.ArrowsActionGroup

public val ArrowsActionGroup.Login: ImageVector
    get() {
        if (_login != null) {
            return _login!!
        }
        _login = Builder(name = "Login", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.8447f, 8.0947f)
                curveTo(10.5518f, 8.3876f, 10.5518f, 8.8624f, 10.8447f, 9.1553f)
                lineTo(12.5643f, 10.875f)
                horizontalLineTo(4.375f)
                curveTo(3.9608f, 10.875f, 3.625f, 11.2108f, 3.625f, 11.625f)
                curveTo(3.625f, 12.0392f, 3.9608f, 12.375f, 4.375f, 12.375f)
                horizontalLineTo(12.5643f)
                lineTo(10.8447f, 14.0947f)
                curveTo(10.5518f, 14.3876f, 10.5518f, 14.8624f, 10.8447f, 15.1553f)
                curveTo(11.1376f, 15.4482f, 11.6124f, 15.4482f, 11.9053f, 15.1553f)
                lineTo(14.9053f, 12.1553f)
                curveTo(15.1982f, 11.8624f, 15.1982f, 11.3876f, 14.9053f, 11.0947f)
                lineTo(11.9053f, 8.0947f)
                curveTo(11.6124f, 7.8018f, 11.1376f, 7.8018f, 10.8447f, 8.0947f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.375f, 5.8774f)
                curveTo(12.375f, 6.3254f, 12.6492f, 6.7172f, 12.966f, 7.034f)
                lineTo(15.966f, 10.034f)
                curveTo(16.8447f, 10.9127f, 16.8447f, 12.3373f, 15.966f, 13.216f)
                lineTo(12.966f, 16.216f)
                curveTo(12.6492f, 16.5327f, 12.375f, 16.9246f, 12.375f, 17.3726f)
                verticalLineTo(19.625f)
                curveTo(16.7933f, 19.625f, 20.375f, 16.0433f, 20.375f, 11.625f)
                curveTo(20.375f, 7.2067f, 16.7933f, 3.625f, 12.375f, 3.625f)
                verticalLineTo(5.8774f)
                close()
            }
        }
        .build()
        return _login!!
    }

private var _login: ImageVector? = null

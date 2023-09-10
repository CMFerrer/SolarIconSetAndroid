package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.Login: ImageVector
    get() {
        if (_login != null) {
            return _login!!
        }
        _login = Builder(
            name = "Login", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 3.25f)
                curveTo(11.5858f, 3.25f, 11.25f, 3.5858f, 11.25f, 4.0f)
                curveTo(11.25f, 4.4142f, 11.5858f, 4.75f, 12.0f, 4.75f)
                curveTo(16.0041f, 4.75f, 19.25f, 7.9959f, 19.25f, 12.0f)
                curveTo(19.25f, 16.0041f, 16.0041f, 19.25f, 12.0f, 19.25f)
                curveTo(11.5858f, 19.25f, 11.25f, 19.5858f, 11.25f, 20.0f)
                curveTo(11.25f, 20.4142f, 11.5858f, 20.75f, 12.0f, 20.75f)
                curveTo(16.8325f, 20.75f, 20.75f, 16.8325f, 20.75f, 12.0f)
                curveTo(20.75f, 7.1675f, 16.8325f, 3.25f, 12.0f, 3.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.4697f, 9.5303f)
                curveTo(10.1768f, 9.2374f, 10.1768f, 8.7626f, 10.4697f, 8.4697f)
                curveTo(10.7626f, 8.1768f, 11.2374f, 8.1768f, 11.5303f, 8.4697f)
                lineTo(14.5303f, 11.4697f)
                curveTo(14.8232f, 11.7626f, 14.8232f, 12.2374f, 14.5303f, 12.5303f)
                lineTo(11.5303f, 15.5303f)
                curveTo(11.2374f, 15.8232f, 10.7626f, 15.8232f, 10.4697f, 15.5303f)
                curveTo(10.1768f, 15.2374f, 10.1768f, 14.7626f, 10.4697f, 14.4697f)
                lineTo(12.1893f, 12.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 12.75f, 3.25f, 12.4142f, 3.25f, 12.0f)
                curveTo(3.25f, 11.5858f, 3.5858f, 11.25f, 4.0f, 11.25f)
                horizontalLineTo(12.1893f)
                lineTo(10.4697f, 9.5303f)
                close()
            }
        }
            .build()
        return _login!!
    }

private var _login: ImageVector? = null

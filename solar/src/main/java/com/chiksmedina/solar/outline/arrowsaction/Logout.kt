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

val ArrowsActionGroup.Logout: ImageVector
    get() {
        if (_logout != null) {
            return _logout!!
        }
        _logout = Builder(
            name = "Logout", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 3.25f)
                curveTo(12.4142f, 3.25f, 12.75f, 3.5858f, 12.75f, 4.0f)
                curveTo(12.75f, 4.4142f, 12.4142f, 4.75f, 12.0f, 4.75f)
                curveTo(7.9959f, 4.75f, 4.75f, 7.9959f, 4.75f, 12.0f)
                curveTo(4.75f, 16.0041f, 7.9959f, 19.25f, 12.0f, 19.25f)
                curveTo(12.4142f, 19.25f, 12.75f, 19.5858f, 12.75f, 20.0f)
                curveTo(12.75f, 20.4142f, 12.4142f, 20.75f, 12.0f, 20.75f)
                curveTo(7.1675f, 20.75f, 3.25f, 16.8325f, 3.25f, 12.0f)
                curveTo(3.25f, 7.1675f, 7.1675f, 3.25f, 12.0f, 3.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.4697f, 9.5303f)
                curveTo(16.1768f, 9.2374f, 16.1768f, 8.7626f, 16.4697f, 8.4697f)
                curveTo(16.7626f, 8.1768f, 17.2374f, 8.1768f, 17.5303f, 8.4697f)
                lineTo(20.5303f, 11.4697f)
                curveTo(20.8232f, 11.7626f, 20.8232f, 12.2374f, 20.5303f, 12.5303f)
                lineTo(17.5303f, 15.5303f)
                curveTo(17.2374f, 15.8232f, 16.7626f, 15.8232f, 16.4697f, 15.5303f)
                curveTo(16.1768f, 15.2374f, 16.1768f, 14.7626f, 16.4697f, 14.4697f)
                lineTo(18.1893f, 12.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 12.75f, 9.25f, 12.4142f, 9.25f, 12.0f)
                curveTo(9.25f, 11.5858f, 9.5858f, 11.25f, 10.0f, 11.25f)
                horizontalLineTo(18.1893f)
                lineTo(16.4697f, 9.5303f)
                close()
            }
        }
            .build()
        return _logout!!
    }

private var _logout: ImageVector? = null

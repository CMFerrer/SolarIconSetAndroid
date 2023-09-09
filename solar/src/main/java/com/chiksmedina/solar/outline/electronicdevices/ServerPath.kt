package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

public val ElectronicDevicesGroup.ServerPath: ImageVector
    get() {
        if (_serverPath != null) {
            return _serverPath!!
        }
        _serverPath = Builder(name = "ServerPath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.25f, 5.0f)
                curveTo(1.25f, 2.9289f, 2.9289f, 1.25f, 5.0f, 1.25f)
                horizontalLineTo(19.0f)
                curveTo(21.0711f, 1.25f, 22.75f, 2.9289f, 22.75f, 5.0f)
                curveTo(22.75f, 6.2267f, 22.161f, 7.3158f, 21.2504f, 8.0f)
                curveTo(22.161f, 8.6842f, 22.75f, 9.7733f, 22.75f, 11.0f)
                curveTo(22.75f, 13.0711f, 21.0711f, 14.75f, 19.0f, 14.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.3535f)
                curveTo(13.6658f, 16.6125f, 14.3875f, 17.3342f, 14.6465f, 18.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 18.25f, 22.75f, 18.5858f, 22.75f, 19.0f)
                curveTo(22.75f, 19.4142f, 22.4142f, 19.75f, 22.0f, 19.75f)
                horizontalLineTo(14.6465f)
                curveTo(14.32f, 20.9043f, 13.2588f, 21.75f, 12.0f, 21.75f)
                curveTo(10.7412f, 21.75f, 9.68f, 20.9043f, 9.3535f, 19.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 19.75f, 1.25f, 19.4142f, 1.25f, 19.0f)
                curveTo(1.25f, 18.5858f, 1.5858f, 18.25f, 2.0f, 18.25f)
                horizontalLineTo(9.3535f)
                curveTo(9.6125f, 17.3342f, 10.3342f, 16.6125f, 11.25f, 16.3535f)
                verticalLineTo(14.75f)
                horizontalLineTo(5.0f)
                curveTo(2.9289f, 14.75f, 1.25f, 13.0711f, 1.25f, 11.0f)
                curveTo(1.25f, 9.7733f, 1.839f, 8.6842f, 2.7496f, 8.0f)
                curveTo(1.839f, 7.3158f, 1.25f, 6.2267f, 1.25f, 5.0f)
                close()
                moveTo(5.0f, 7.25f)
                curveTo(3.7574f, 7.25f, 2.75f, 6.2426f, 2.75f, 5.0f)
                curveTo(2.75f, 3.7574f, 3.7574f, 2.75f, 5.0f, 2.75f)
                horizontalLineTo(19.0f)
                curveTo(20.2426f, 2.75f, 21.25f, 3.7574f, 21.25f, 5.0f)
                curveTo(21.25f, 6.2426f, 20.2426f, 7.25f, 19.0f, 7.25f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.0f, 8.75f)
                horizontalLineTo(5.0f)
                curveTo(3.7574f, 8.75f, 2.75f, 9.7574f, 2.75f, 11.0f)
                curveTo(2.75f, 12.2426f, 3.7574f, 13.25f, 5.0f, 13.25f)
                horizontalLineTo(19.0f)
                curveTo(20.2426f, 13.25f, 21.25f, 12.2426f, 21.25f, 11.0f)
                curveTo(21.25f, 9.7574f, 20.2426f, 8.75f, 19.0f, 8.75f)
                close()
                moveTo(12.25f, 5.0f)
                curveTo(12.25f, 4.5858f, 12.5858f, 4.25f, 13.0f, 4.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 4.25f, 19.75f, 4.5858f, 19.75f, 5.0f)
                curveTo(19.75f, 5.4142f, 19.4142f, 5.75f, 19.0f, 5.75f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 5.75f, 12.25f, 5.4142f, 12.25f, 5.0f)
                close()
                moveTo(12.25f, 11.0f)
                curveTo(12.25f, 10.5858f, 12.5858f, 10.25f, 13.0f, 10.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 10.25f, 19.75f, 10.5858f, 19.75f, 11.0f)
                curveTo(19.75f, 11.4142f, 19.4142f, 11.75f, 19.0f, 11.75f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 11.75f, 12.25f, 11.4142f, 12.25f, 11.0f)
                close()
                moveTo(12.0f, 17.75f)
                curveTo(11.3096f, 17.75f, 10.75f, 18.3096f, 10.75f, 19.0f)
                curveTo(10.75f, 19.6904f, 11.3096f, 20.25f, 12.0f, 20.25f)
                curveTo(12.6904f, 20.25f, 13.25f, 19.6904f, 13.25f, 19.0f)
                curveTo(13.25f, 18.3096f, 12.6904f, 17.75f, 12.0f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 5.5523f, 6.5523f, 6.0f, 6.0f, 6.0f)
                curveTo(5.4477f, 6.0f, 5.0f, 5.5523f, 5.0f, 5.0f)
                curveTo(5.0f, 4.4477f, 5.4477f, 4.0f, 6.0f, 4.0f)
                curveTo(6.5523f, 4.0f, 7.0f, 4.4477f, 7.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                curveTo(7.0f, 11.5523f, 6.5523f, 12.0f, 6.0f, 12.0f)
                curveTo(5.4477f, 12.0f, 5.0f, 11.5523f, 5.0f, 11.0f)
                curveTo(5.0f, 10.4477f, 5.4477f, 10.0f, 6.0f, 10.0f)
                curveTo(6.5523f, 10.0f, 7.0f, 10.4477f, 7.0f, 11.0f)
                close()
            }
        }
        .build()
        return _serverPath!!
    }

private var _serverPath: ImageVector? = null
